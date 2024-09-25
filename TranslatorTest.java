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
        assertEquals("Translation not supported for the selected languages.", result);
    }

    @Test
    public void testTranslateSameLanguage() {
        String result = translator.translate("print('Hello, World!')", "Python", "Python");
        assertEquals("Translating from Python to Python: print('Hello, World!')", result);
    }
}
