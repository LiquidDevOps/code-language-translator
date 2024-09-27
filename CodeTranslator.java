// CodeTranslator.java
import java.util.HashMap;
import java.util.Map;

public class CodeTranslator {

    // Map for language translation pairs
    private static final Map<String, String> translations = new HashMap<>();

    // Static block to initialize translation mappings
    static {
        // Example translations (extendable)
        translations.put("Python->Java", "System.out.println(\"Hello, World!\");");
        translations.put("Java->Python", "print('Hello, World!')");
        translations.put("C#->Java", "Console.WriteLine(\"Hello, World!\");");
        // Add more language mappings as needed
    }

    /**
     * Translates the given code from one language to another.
     *
     * @param code         The code to translate
     * @param fromLanguage The source language of the code
     * @param toLanguage   The target language to translate to
     * @return The translated code or a message if translation is unsupported
     */
    public static String translate(String code, String fromLanguage, String toLanguage) {
        String translationKey = fromLanguage + "->" + toLanguage;
        
        if (translations.containsKey(translationKey)) {
            // Replace the placeholder translation with the actual code (for demo purposes)
            return "Translated code from " + fromLanguage + " to " + toLanguage + ": " 
                    + translations.get(translationKey);
        } else {
            // Return a message indicating the translation isn't supported yet
            return "Translation not supported between " + fromLanguage + " and " + toLanguage;
        }
    }

    public static void main(String[] args) {
        // Example code snippets
        String pythonCode = "print('Hello, World!')";
        String javaCode = "System.out.println(\"Hello, World!\");";
        
        // Sample usage: Python to Java
        String translatedCode = translate(pythonCode, "Python", "Java");
        System.out.println(translatedCode);

        // Sample usage: Java to Python
        String translatedJavaCode = translate(javaCode, "Java", "Python");
        System.out.println(translatedJavaCode);
        
        // Try unsupported translation (returns a warning message)
        String unsupportedTranslation = translate(javaCode, "Java", "C++");
        System.out.println(unsupportedTranslation);
    }
}
