package Menu;

import Level.*;

import java.util.Scanner;

public class MenuController {
    private final Level1Exercise level1 = new Level1Exercise();
    private final Level2Exercise level2 = new Level2Exercise();
    private final Level3Exercise level3 = new Level3Exercise();

    public void start() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Level 1");
            System.out.println("2. Level 2");
            System.out.println("3. Level 3");
            System.out.println("4. Level 4");
            System.out.println("5. Level 5");
            System.out.println("0. Exit");
            System.out.println("Choose leve: ");
            int level = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (level) {
                case 1 -> showLeve1Menu(sc);
                case 2 -> showLevel2Menu(sc);
                case 3 -> showLevel3Menu(sc);
                case 0 -> {
                    System.out.println("goodbye");
                    return;
                }
                default -> System.out.println("Invalid choice");

            }
        }
    }

    private void showLeve1Menu(Scanner sc) {
        System.out.println("\n--- LEVEL 1 ---");
        System.out.println("1. Sum two numbers");
        System.out.println("2. String length");
        System.out.println("3. Square number");
        System.out.println("4. Find max");
        System.out.println("5. Find shortest string");
        System.out.println("6. Sort numbers ascending");
        System.out.println("7. Sort strings alphabetically");
        System.out.println("8. Find median");
        System.out.println("9. Count words");
        System.out.println("10. Count strings containing 'a'");
        System.out.println("0. Back to main menu");
        System.out.print("Choose an exercise: ");
        int choice = sc.nextInt();
        sc.nextLine();// clear buffer

        switch (choice) {
            case 1 -> level1.sumNumber();
            case 2 -> level1.stringLength();
            case 3 -> level1.squareNumber();
            case 4 -> level1.findMax();
            case 5 -> level1.findShortestString();
            case 6 -> level1.sortNumberAsc();
            case 7 -> level1.sortStringAlphabet();
            case 8 -> level1.findMedian();
            case 9 -> level1.countWords();
            case 10 -> level1.sortStringAlphabet();
        }
    }

    private void showLevel2Menu(Scanner sc) {
        while (true) {
            System.out.println("\n--- LEVEL 2 ---");
            System.out.println("1. Find second largest number");
            System.out.println("2. Find longest word");
            System.out.println("3. Longest common subsequence");
            System.out.println("4. Sum of numbers divisible by 3 and 5");
            System.out.println("5. Maximum sum of contiguous subarray");
            System.out.println("0. Back to main menu");
            System.out.print("Choose an exercise: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> level2.findSecondMax();
                case 2 -> level2.findLongestWord();
                case 3 -> level2.findLongestSubStr();
                case 4 -> level2.sumDivisibleByThreeAndFive();
                case 5 -> level2.maxSubSum();
                case 0 -> {
                    return;
                }
                default -> System.out.println("invalid choice");
            }
        }

    }

    private void showLevel3Menu(Scanner sc) {
        while(true) {
            System.out.println("\n--- LEVEL 3 MENU ---");
            System.out.println("1. Find second smallest number");
            System.out.println("2. Find maximum difference");
            System.out.println("3. Longest increasing subsequence");
            System.out.println("4. Two strings with most overlapping characters");
            System.out.println("5. Smallest unrepresentable positive integer");
            System.out.println("6. Median of two integer arrays");
            System.out.println("7. Length of longest rearranged palindrome");
            System.out.println("8. Sort strings by distinct character count");
            System.out.println("0. Back to main menu");
            System.out.print("Choose an exercise: ");

            int choice = sc.nextInt();
            sc.nextLine();// clear buffer

            switch(choice) {
                case 1 -> level3.findMinSecond();
                case 2 -> level3.finMaxDifference();
                case 3 -> level3.findLongestIncreaseSub();
                case 4 -> level3.findMostOverlap();
                case 5 -> level3.findSmallestNumber();
                case 6 -> level3.findMedianOfTwoArr();
                case 7 -> level3.longestRearrang();
                case 8 -> level3.sortString();
                case 0 -> {
                    return;
            }
                default -> System.out.println("invalid choice");
        }
    }
    }
}
