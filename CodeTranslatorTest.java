// CodeTranslatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CodeTranslatorTest {

    @Test
    public void testTranslatePythonToJava() {
        String pythonCode = "print('Hello, World!')";
        String expected = "Translated code from Python to Java: " + pythonCode;
        String actual = CodeTranslator.translate(pythonCode, "Python", "Java");
        assertEquals(expected, actual);
    }

    @Test
    public void testTranslateJavaToPython() {
        String javaCode = "System.out.println('Hello, World!');";
        String expected = "Translated code from Java to Python: " + javaCode; // Placeholder
        String actual = CodeTranslator.translate(javaCode, "Java", "Python");
        assertEquals(expected, actual);
    }

    @Test
    public void testUnsupportedTranslation() {
        String unsupportedCode = "Console.WriteLine('Hello, World!');";
        String expected = "Translation not supported between C# and Java";
        String actual = CodeTranslator.translate(unsupportedCode, "C#", "Java");
        assertEquals(expected, actual);
    }
}
