package manipulando_strings;

import java.util.Scanner;

public class ListasString {
    public  String longestWord(String sen) {
        String[] senArray = sen.split(" ");

        int indexLongest = 0;
        String longestWord = "";

        for (int i = 0; i < senArray.length; i++) {
            if(senArray[i].length() > indexLongest) {
                longestWord = senArray[i];
                indexLongest = senArray[i].length();
            }
        }
        
        return longestWord;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the words: ");
        String word = scanner.nextLine();

        ListasString s = new ListasString();
        String longestWord = s.longestWord(word);
        System.out.println("The longest word is: " + longestWord);

        scanner.close();
    }
}
