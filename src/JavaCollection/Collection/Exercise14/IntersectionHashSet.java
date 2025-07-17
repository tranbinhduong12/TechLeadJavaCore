package JavaCollection.Collection.Exercise14;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionHashSet {
    public void run() {
        Scanner sc = new Scanner(System.in);

        // Nhập tập hợp A
        System.out.print("input number of element in list A: ");
        int n = Integer.parseInt(sc.nextLine());
        HashSet<Integer> setA = new HashSet<>();
        System.out.println("input " + n + " integer for set A: ");
        for (int i = 0; i < n; i++) {
            setA.add(Integer.parseInt(sc.nextLine()));
        }

        // Nhập tập hợp B
        System.out.print("input number of element in list B: ");
        int m = Integer.parseInt(sc.nextLine());
        HashSet<Integer> setB = new HashSet<>();
        System.out.println("input " + m + " integer for set B: ");
        for (int i = 0; i < m; i++) {
            setB.add(Integer.parseInt(sc.nextLine()));
        }

        // tìm phần tử chung hai tập hợp
        HashSet<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB); // giữ lại phần tử chung ở hai tập

        // result
        if (intersection.isEmpty()) {
            System.out.println("no common elements");
        } else {
            System.out.println("the common element: ");
            for (int num : intersection) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        new IntersectionHashSet().run();
    }
}
