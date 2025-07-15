package Menu;

import Level1.Lv1Exercuse;

import java.util.Scanner;

public class MenuController {
    private final Lv1Exercuse level1 = new Lv1Exercuse();

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
}
