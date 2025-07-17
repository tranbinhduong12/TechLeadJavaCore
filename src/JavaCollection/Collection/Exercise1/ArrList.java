package JavaCollection.Collection.Exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrList {
    public void run() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        //1. Thêm phần tử
        System.out.print("input the number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("number " + (i+1) + " : ");
            int num = sc.nextInt();
            numbers.add(num);
        }

        //2. Hiển thị phần tử
        System.out.println(numbers);

        // 3. tính tổng
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("sum: " + sum);

        // 4. tìm max min
        Collections.sort(numbers);
        int min = numbers.get(0);
        int max = numbers.get(numbers.size()-1);

        // 5. xóa 1 phần tử cụ thể
        System.out.println("input the number to remove: ");
        int toRemove = sc.nextInt();
        boolean removed = numbers.remove((Integer) toRemove); // xóa theo value
        if (removed) {
            System.out.println("removed " + toRemove);
        } else {
            System.out.println("can not find " + toRemove);
        }

        System.out.println("ArrayList after remove: " + numbers);

        // 5. Kiểm tra phần tử có tồn tại
        System.out.println("input the number to check: ");
        int toCheck = sc.nextInt();
        if (numbers.contains(toCheck)) {
            System.out.println(toCheck + " exist in the list");
        } else {
            System.out.println(toCheck + " not exist int the list");
        }
        sc.close();
    }

    public static void main(String[] args) {
        ArrList e1 = new ArrList();
        e1.run();
    }
}
