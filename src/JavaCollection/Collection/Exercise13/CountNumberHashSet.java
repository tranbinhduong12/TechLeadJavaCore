package JavaCollection.Collection.Exercise13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountNumberHashSet {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input number of element: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n];
        System.out.println("input " + n + " number: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!unique.add(num)) {
                duplicates.add(num); // nếu k thể add vào unique -> bị trùng
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements");
        } else {
            System.out.println("The duplicate elements: ");
            for (int num : duplicates) {
                System.out.println(num);
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        new CountNumberHashSet().run();
    }
}
