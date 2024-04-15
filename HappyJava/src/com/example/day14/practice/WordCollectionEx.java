package com.example.day14.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCollectionEx {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        inputWords(wordList, scanner);
        printWordList(wordList);

        scanner.close();
    }

    public static void inputWords(List<String> wordList, Scanner scanner) {
        while (true) {
            System.out.println("단어를 입력해주세요 || quit 을 입력하면 종료");
            String str = scanner.nextLine();
            if (str.equals("quit")) {
                wordList.remove("quit");
                break;
            } else {
                wordList.add(str);
            }
        }
    }

    public static void printWordList(List<String> wordList) {
        System.out.println("입력된 단어: " + wordList);

        int wordCount = wordList.size();
        int totalLength = 0;
        String longestWord = "";

        for (String word : wordList) {
            totalLength += word.length();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("단어 수: " + wordCount);
        System.out.println("글자 수의 합: " + totalLength);
        System.out.println("가장 긴 단어: " + longestWord);
        System.out.println("가장 긴 단어의 길이: " + longestWord.length());
    }
}
