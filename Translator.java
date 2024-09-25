import java.util.HashMap;
import java.util.Map;

public class Translator {

    private Map<String, String> languageMap;

    public Translator() {
        languageMap = new HashMap<>();
        // Initialize supported languages and their simple translations
        languageMap.put("Python", "Python code");
        languageMap.put("Java", "Java code");
        languageMap.put("C", "C code");
        languageMap.put("C++", "C++ code");
        languageMap.put("JavaScript", "JavaScript code");
        languageMap.put("C#", "C# code");
    }

    public String translate(String code, String fromLang, String toLang) {
        // Simple mock translation logic
        if (languageMap.containsKey(fromLang) && languageMap.containsKey(toLang)) {
            return "Translating from " + fromLang + " to " + toLang + ": " + code;
        } else {
            return "Translation not supported for the selected languages.";
        }
    }
}
