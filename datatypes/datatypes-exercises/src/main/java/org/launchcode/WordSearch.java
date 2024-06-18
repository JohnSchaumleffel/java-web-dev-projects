package org.launchcode;

import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args){
        String firstLine = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: once or" +
                " twice she had peeped into the book her sister was reading, but" +
                " it had no pictures or conversations in it, 'and what is the use" +
                " of a book,' thought Alice 'without pictures or conversation?'";
        firstLine = firstLine.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Please pick a word:");
        String word = input.nextLine();
        String wordAdj = word.toLowerCase();
        System.out.println(firstLine.contains(wordAdj));
        System.out.println(wordAdj.length());
        System.out.println(wordAdj.indexOf(word));
    }
}
