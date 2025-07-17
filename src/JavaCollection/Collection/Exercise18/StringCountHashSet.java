package JavaCollection.Collection.Exercise18;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringCountHashSet {
    public void run() {
        Scanner sc = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();

        System.out.print("input number of strings: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("input " + n + " strings: ");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine().trim();
            stringSet.add(input);
        }
        System.out.println("number of unique elements: " + stringSet.size());
        sc.close();
    }

    public static void main(String[] args) {
        new StringCountHashSet().run();
    }
}
