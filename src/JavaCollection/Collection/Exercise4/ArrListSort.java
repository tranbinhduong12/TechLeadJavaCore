package JavaCollection.Collection.Exercise4;

import java.util.*;

public class ArrListSort {
    public void run() {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // nhập số lượng phần tử
        System.out.print("input number of integer: ");
        int n = sc.nextInt();

        //nhập các phàn tử
        for (int i = 0; i < n; i++) {
            System.out.print("input number " +(i+1) + " : ");
            int num = sc.nextInt();
            numbers.add(num);
        }

        System.out.println("Original list: " + numbers);

        // sắp xếp tăng dần
        ArrayList<Integer> ascList = new ArrayList<>(numbers);
        Collections.sort(ascList);
        System.out.println("asc list: " + ascList);

        // sắp xếp giảm dần
        ArrayList<Integer> desList = new ArrayList<>(numbers);
        Collections.sort(desList, Collections.reverseOrder());
        System.out.println("des list: " + desList);

        sc.close();
    }

    public static void main(String[] args) {
        ArrListSort arrListSort = new ArrListSort();
        arrListSort.run();
    }
}

