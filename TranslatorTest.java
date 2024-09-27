import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TranslatorTest {

    private Translator translator;

    @BeforeEach
    public void setUp() {
        translator = new Translator();
    }

    @Test
    public void testTranslateSupportedLanguages() {
        String result = translator.translate("print('Hello, World!')", "Python", "Java");
        assertEquals("Translating from Python to Java: print('Hello, World!')", result);
    }

    @Test
    public void testTranslateUnsupportedLanguages() {
        String result = translator.translate("System.out.println('Hello, World!');", "Java", "Ruby");
        assertEquals("Error: Unsupported target language: Ruby", result);
    }

    @Test
    public void testTranslateSameLanguage() {
        String result = translator.translate("print('Hello, World!')", "Python", "Python");
        assertEquals("Translating from Python to Python: print('Hello, World!')", result);
    }

    @Test
    public void testNoCodeProvided() {
        String result = translator.translate("", "Python", "Java");
        assertEquals("Error: No code provided for translation.", result);
    }

    @Test
    public void testUnsupportedSourceLanguage() {
        String result = translator.translate("puts 'Hello, World!'", "Ruby", "Java");
        assertEquals("Error: Unsupported source language: Ruby", result);
    }

    @Test
    public void testAddLanguageAndTranslate() {
        translator.addLanguage("Ruby", "Ruby code");
        String result = translator.translate("puts 'Hello, World!'", "Ruby", "JavaScript");
        assertEquals("Translating from Ruby to JavaScript: puts 'Hello, World!'", result);
    }
}
