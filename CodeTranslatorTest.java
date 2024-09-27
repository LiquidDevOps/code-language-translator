// CodeTranslatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CodeTranslatorTest {

    @Test
    public void testTranslatePythonToJava() {
        String pythonCode = "print('Hello, World!')";
        String expected = "Translated code from Python to Java: System.out.println(\"Hello, World!\");";
        String actual = CodeTranslator.translate(pythonCode, "Python", "Java");
        assertEquals(expected, actual, "Translation from Python to Java failed");
    }

    @Test
    public void testTranslateJavaToPython() {
        String javaCode = "System.out.println('Hello, World!');";
        String expected = "Translated code from Java to Python: print('Hello, World!')";
        String actual = CodeTranslator.translate(javaCode, "Java", "Python");
        assertEquals(expected, actual, "Translation from Java to Python failed");
    }

    @Test
    public void testUnsupportedTranslation() {
        String unsupportedCode = "Console.WriteLine('Hello, World!');";
        String expected = "Translation not supported between C# and Java";
        String actual = CodeTranslator.translate(unsupportedCode, "C#", "Java");
        assertEquals(expected, actual, "Unsupported translation test case failed");
    }

    @Test
    public void testTranslateSameLanguage() {
        String pythonCode = "print('Hello, World!')";
        String expected = "Translation not supported between Python and Python";
        String actual = CodeTranslator.translate(pythonCode, "Python", "Python");
        assertEquals(expected, actual, "Same language translation check failed");
    }

    @Test
    public void testTranslateJavaToCSharp() {
        String javaCode = "System.out.println('Hello, World!');";
        String expected = "Translation not supported between Java and C#";  // Placeholder since we don't support this yet
        String actual = CodeTranslator.translate(javaCode, "Java", "C#");
        assertEquals(expected, actual, "Translation from Java to C# failed");
    }
}
