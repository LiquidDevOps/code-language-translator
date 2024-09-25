// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Code Language Translator!");
        System.out.println("Please enter the code you want to translate:");
        String code = scanner.nextLine();
        
        System.out.println("Enter the source language (e.g., Python, Java):");
        String sourceLanguage = scanner.nextLine();
        
        System.out.println("Enter the target language (e.g., Python, Java):");
        String targetLanguage = scanner.nextLine();
        
        String translatedCode = CodeTranslator.translate(code, sourceLanguage, targetLanguage);
        System.out.println("Translated Code:\n" + translatedCode);
        
        scanner.close();
    }
}
