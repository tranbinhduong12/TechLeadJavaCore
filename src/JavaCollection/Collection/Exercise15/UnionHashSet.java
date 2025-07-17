package JavaCollection.Collection.Exercise15;

import java.util.HashSet;
import java.util.Scanner;

public class UnionHashSet {
    public void run() {
        Scanner sc = new Scanner(System.in);

        // Nhập tập hợp A
        System.out.print("input number of element in set A: ");
        int n = Integer.parseInt(sc.nextLine());
        HashSet<Integer> setA = new HashSet<>();
        System.out.println("input " + n + " integer for set A: ");
        for (int i = 0; i < n; i++) {
            setA.add(Integer.parseInt(sc.nextLine()));
        }

        // Nhập tập hợp B
        System.out.print("input number of element in set B: ");
        int m = Integer.parseInt(sc.nextLine());
        HashSet<Integer> setB = new HashSet<>();
        System.out.println("input " + n + " integer for set B: ");
        for (int i = 0; i < m; i++) {
            setB.add(Integer.parseInt(sc.nextLine()));
        }

        // hợp của 2 tập hợp
        HashSet<Integer> union = new HashSet<>(setA);
        union.addAll(setB); // Thêm tàon bộ phần tử B vào A

        // result: hợp của 2 tập hợp
        System.out.println("the union of two set:");
        for (int num : union) {
            System.out.println(num);
        }
        sc.close();
    }

    public static void main(String[] args) {
        new UnionHashSet().run();
    }
}
