package JavaCollection.Collection.Exercise17;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueStringHashSet {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input number of strings: ");
        int n = Integer.parseInt(sc.nextLine());

        HashSet<String> uniqueStrings = new HashSet<>();

        System.out.println("input " + n + " strings: ");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine().trim();
            uniqueStrings.add(input);
        }

        System.out.println("the unique strings: ");
        for (String str : uniqueStrings) {
            System.out.println(str);
        }
        sc.close();
    }

    public static void main(String[] args) {
        new UniqueStringHashSet().run();
    }
}
