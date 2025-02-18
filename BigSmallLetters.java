package Demo;

import java.util.Scanner;

public class BigSmallLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        // Splitting the sentence into words to find the no of words in the sentence
        String[] words = sentence.split("\\s+");

        if (words.length == 0) {
            System.out.println("No words found.");
            return;
        }

        String smallest = words[0], largest = words[0];

        for (String word : words) {
            if (word.length() < smallest.length()) {
                smallest = word; //smallest
            }
            if (word.length() > largest.length()) {
                largest = word;  //largest
            }
        }
        System.out.println("Smallest word: " + smallest);
        System.out.println("Biggest word: " + largest);
    }
}