package chapter8;

public class TextProcessor {

    public static void main(String[] args) {

        countWords("I love QA testing");
        reverseString("Hello QA Testers!");
        addSpaces("HeyWorld!It'sMeStan");
    }

    public static void countWords(String text) {
        String[] words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }

    }

    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Add spaces before each uppercase letter
     *
     * @param text jumbled text
     */
    public static void addSpaces(String text) {
        StringBuilder modifiedString = new StringBuilder(text);
        for (int i = 0; i < modifiedString.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedString.charAt(i))) {
                modifiedString.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedString);
    }
}
