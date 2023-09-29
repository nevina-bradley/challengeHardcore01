package com.codedifferently;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String words[] = str.split("\\s");
        String newStr = "";

        for (String first : words) {
            String firstLetter = first.substring(0, 1);
            String restOfWord = first.substring(1);
            newStr += firstLetter.toUpperCase() + restOfWord + " ";
        }

        return newStr.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();
        return reverseStr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseString(word);
            reversed.append(reversedWord).append(" ");
        }

        return reversed.toString().trim();
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();
        String words[] = reverseStr.split("\\s");
        String newStr = "";

        for (String first : words) {
            String firstLetter = first.substring(0, 1);
            String restOfWord = first.substring(1);
            newStr += firstLetter.toUpperCase() + restOfWord + " ";
        }

        return newStr.trim();
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String withoutFirstAndLastLetter = str.substring(1, str.length() - 1);
        return withoutFirstAndLastLetter;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuffer newStr = new StringBuffer(str);

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if (Character.isUpperCase(str.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        return newStr.toString();
    }
}
