import java.util.HashMap;
import java.util.Map;

public class Translator {

    private Map<String, String> languageMap;

    public Translator() {
        languageMap = new HashMap<>();
        initializeLanguageMap();
    }

    // Method to initialize supported languages
    private void initializeLanguageMap() {
        // Add supported languages and basic translations
        languageMap.put("Python", "Python code");
        languageMap.put("Java", "Java code");
        languageMap.put("C", "C code");
        languageMap.put("C++", "C++ code");
        languageMap.put("JavaScript", "JavaScript code");
        languageMap.put("C#", "C# code");
        // Additional languages can be added here
    }

    // Method to translate code from one language to another
    public String translate(String code, String fromLang, String toLang) {
        // Handle edge cases for unsupported languages or empty input
        if (code == null || code.trim().isEmpty()) {
            return "Error: No code provided for translation.";
        }

        if (!languageMap.containsKey(fromLang)) {
            return "Error: Unsupported source language: " + fromLang;
        }

        if (!languageMap.containsKey(toLang)) {
            return "Error: Unsupported target language: " + toLang;
        }

        // Placeholder for actual translation logic
        return "Translating from " + fromLang + " to " + toLang + ": " + code;
    }

    // Method to add new languages dynamically
    public void addLanguage(String language, String description) {
        languageMap.put(language, description);
    }

    // Method to list supported languages
    public String listSupportedLanguages() {
        return "Supported languages: " + languageMap.keySet();
    }

    public static void main(String[] args) {
        Translator translator = new Translator();
        System.out.println(translator.translate("print('Hello, World!')", "Python", "Java"));

        // Dynamically adding a new language
        translator.addLanguage("Ruby", "Ruby code");
        System.out.println(translator.translate("puts 'Hello, World!'", "Ruby", "JavaScript"));

        // Listing all supported languages
        System.out.println(translator.listSupportedLanguages());
    }
}
