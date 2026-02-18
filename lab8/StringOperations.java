import java.util.*;

public class StringOperations {

    static String changeCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                result += (char)(ch - 32);
            else if (ch >= 'A' && ch <= 'Z')
                result += (char)(ch + 32);
            else
                result += ch;
        }
        return result;
    }

    static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    static int compareStrings(String s1, String s2) {
        return s1.compareTo(s2);
    }

    static String insertString(String s1, String s2) {
        return s1 + " " + s2;
    }

    static void upperLower(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    static void searchCharacter(String str, char ch) {
        int pos = str.indexOf(ch);

        if (pos != -1)
            System.out.println("Position of entered character: " + pos);
        else
            System.out.println("Entered character is not present");
    }

    static void palindromeCheck(String str) {
        String rev = reverseString(str);

        if (str.equals(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");
    }

    static void countWordsVowelsConsonants(String str) {
        int vowels = 0, consonants = 0, words = 0;

        str = str.trim();

        if (!str.isEmpty()) {
            String[] wordArray = str.split("\\s+");
            words = wordArray.length;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str1 = sc.nextLine();
        System.out.println("The string after changing the case is " + changeCase(str1));

        System.out.println("The string after reversing is " + reverseString(str1));

        System.out.print("\nEnter the second string for comparision : ");
        String str2 = sc.nextLine();
        System.out.println("The difference between ASCII value is " + compareStrings(str1, str2));

        System.out.print("\nEnter the string to be inserted into first string : ");
        String str3 = sc.nextLine();
        System.out.println("The string after insertion is : " + insertString(str1, str3));

        System.out.print("\nEnter a String : ");
        String str4 = sc.nextLine();
        upperLower(str4);

        System.out.print("\nEnter a String : ");
        String str5 = sc.nextLine();
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        searchCharacter(str5, ch);

        sc.nextLine(); 

        System.out.print("\nEnter a String : ");
        String str6 = sc.nextLine();
        palindromeCheck(str6);

        System.out.print("\nEnter a String : ");
        String str7 = sc.nextLine();
        countWordsVowelsConsonants(str7);

        sc.close();
    }
}