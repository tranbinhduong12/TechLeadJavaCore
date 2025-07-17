package JavaCore.Menu;

import JavaCore.Level.*;

import java.util.Scanner;

public class MenuController {
    private final Level1Exercise level1 = new Level1Exercise();
    private final Level2Exercise level2 = new Level2Exercise();
    private final Level3Exercise level3 = new Level3Exercise();
    private final Level4Exercise level4 = new Level4Exercise();
    private final Level5Exercise level5 = new Level5Exercise();

    public void start() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. JavaCore.Level 1");
            System.out.println("2. JavaCore.Level 2");
            System.out.println("3. JavaCore.Level 3");
            System.out.println("4. JavaCore.Level 4");
            System.out.println("5. JavaCore.Level 5");
            System.out.println("0. Exit");
            System.out.println("Choose leve: ");
            int level = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (level) {
                case 1 -> showLeve1Menu(sc);
                case 2 -> showLevel2Menu(sc);
                case 3 -> showLevel3Menu(sc);
                case 4 -> showLevel4Menu(sc);
                case 5 -> showLevel5Menu(sc);
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

    private void showLevel4Menu(Scanner sc) {
        while (true) {
            System.out.println("\n--- LEVEL 4 MENU ---");
            System.out.println("1. Bubble sort iteration count");
//            System.out.println("2. Count subsequences summing to target [BỎ]");
            System.out.println("3. Longest common substring among all strings");
//            System.out.println("4. Max subarray sum with no consecutive integers [BỎ]");
//            System.out.println("5. Longest common substring (generalized) [BỎ]");
            System.out.println("6. Max product of any 3 distinct elements");
            System.out.println("7. Sort strings by distinct word count and length");
//            System.out.println("8. Smallest unrepresentable sum (no consecutive) [BỎ]");
            System.out.println("9. LIS with adjacent diff ≤ 1");
//            System.out.println("10. Most overlapping substrings of length ≥ k [BỎ]");
            System.out.println("0. Back to main menu");
            System.out.print("Choose an exercise: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> level4.countBubbleSort();
                case 3 -> level4.findLongestSubStr();
                case 6 -> level4.maxProductOfThree();
                case 7 -> level4.sortStrByWord();
                case 9 -> level4.findLongestSubNum();
                case 0 -> {
                    return;
                }
                default -> System.out.println("invalid choice");
            }
        }
    }

    private void showLevel5Menu(Scanner sc) {
        while (true) {
            System.out.println("\n--- LEVEL 5 MENU ---");
            System.out.println("1. Reverse array (no built-in reverse)");
            System.out.println("2. Chunk array into subarrays");
            System.out.println("3. Remove duplicate values (uniq)");
            System.out.println("4. Remove duplicate objects (uniq objects)"); // chưa làm
            System.out.println("5. Group array of objects by field"); // chưa làm
            System.out.println("6. Trim all spaces (single space between words)");
            System.out.println("7. Map object fields to given key order"); // chưa làm
            System.out.println("8. Switch order of objects by ID"); // copy chat gpt
            System.out.println("9. Sum all key values in object array");// copy chat gpt
            System.out.println("0. Back to main menu");
            System.out.print("Choose an exercise: ");

            int choice = sc.nextInt();
            sc.nextLine();// clear buffer
            switch (choice) {
                case 1 -> level5.reverseArr();
                case 2 -> level5.chunkArray();
                case 3 -> level5.chunkArray();
                case 6 -> level5.trimStr();
                case 8 -> level5.switchOrder();
                case 9 -> level5.sumAll();
                case 0 -> {
                    return;
                }
                default -> System.out.println("invalid choice");
            }
        }
    }
}
