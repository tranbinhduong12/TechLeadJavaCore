package JavaCollection.Collection.Exercise16;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class MinMaxHashSet {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("input number of element: ");
        int n = Integer.parseInt(sc.nextLine());

        HashSet<Integer> set = new HashSet<>();
        System.out.println("input " + " integer: ");
        for (int i = 0; i < n;i++) {
            set.add(Integer.parseInt(sc.nextLine()));
        }

        if (set.isEmpty()) {
            System.out.println("empty");
            return;
        }

        // tìm min và max
        int min = Collections.min(set);
        int max = Collections.max(set);

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        sc.close();
    }

    public static void main(String[] args) {
        new MinMaxHashSet().run();
    }
}
