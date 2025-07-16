package Level;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Level4Exercise {
    Scanner sc = new Scanner(System.in);
    //4.1 đếm số lần duyệt mảng khi sắp xếp bằng bubble sort
    public void countBubbleSort() {
        System.out.println("input numbers: ");
        String[] input = sc.nextLine().split(" ");

        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]); // chuyển các phàn tử thành số nguyên và gán sang arr
        }

        int passes = 0;
        boolean swapped;

        do {
            swapped = false;
            passes++;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        System.out.println("count bubble sort: " + passes);
    }

    //4.2 đếm số chuỗi con có tổng bằng 1 số trong list - chưa biết làm

    //4.3 tìm độ dài chuỗi con dài nhất có trong mọi chuỗi
    public void findLongestSubStr() {
        System.out.println("input strings: ");
        String[] strings = sc.nextLine().trim().split(" ");

        //tìm chuỗi ngắn nhất để làm base
        String base = strings[0];
        for (String s : strings) {
            if (s.length() < base.length()) {
                base = s;
            }
        }

        int maxLength = 0;
        String result = "";

        for (int len = base.length(); len >0; len--) {
            for (int start = 0; start <= base.length() - len; start++) {
                String substr = base.substring(start, start + len);
                boolean allContain = true;

                for (String s : strings) {
                    if (!s.contains(substr)) {
                        allContain = false;
                        break;
                    }
                }

                if (allContain) {
                    maxLength = len;
                    result = substr;
                    System.out.println("substr: " + result);
                    System.out.println("max length: " +maxLength);
                    return;
                }
            }
        }
        System.out.println("no substr");
    }

    // 4.4 bỏ qua
    // 4.5 bỏ qua

    // 4.6 tìm tích lớn nhất của 3 phần tử bất kỳ
    public void maxProductOfThree() {
        System.out.println("input numbers: ");
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        if (arr.length < 3) {
            System.out.println("min 3 numbers");
            return;
        }

        Arrays.sort(arr);
        int n = arr.length;

        int option1 = arr[n-1]*arr[n-2]*arr[n-3]; // 3 số lớn nhất
        int option2 = arr[0]*arr[1]*arr[n-1]; // 2 số âm nhỏ nhất * số lớn nhất

        int maxProduct = Math.max(option1, option2);
        System.out.println("max product: " + maxProduct);
    }

    // 4.7 sắp xếp chuỗi theo số từ và độ dài
    public void sortStrByWord() {
        System.out.println("input strings: ");
        String[] input = sc.nextLine().split(",");

        List<String> lines = new ArrayList<>();
        for (String s : input) {
            lines.add(s.trim());
        }

        lines.sort((s1, s2) ->{
            int wordCount1 = s1.split("\\s+").length; // độ dài chuỗi s1
            int wordCount2 = s2.split("\\s+").length; // độ dài chuỗi s2

            if (wordCount1 != wordCount2) {
                return Integer.compare(wordCount2, wordCount1); // số từ giảm dần
            }

            if (s1.length() != s2.length()) {
                return Integer.compare(s2.length(), s1.length()); // độ dài giảm dần
            }

            return s1.compareTo(s2); // bảng chữ cái tăng dần
        });

        System.out.println(" result: ");
        for (String line : lines) {
            System.out.println(line);
        };
    }

    //4.8 bỏ qua

    //4.9 tìm độ dài dãy con tăng dần với chênh lệch liên tiếp là <= 1
    public void findLongestSubNum() {
        System.out.println("input numbers: ");
        String[] input = sc.nextLine().trim().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0;  i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        if (arr.length == 0) {
            System.out.println("arr empty");
            return;
        }
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1] && arr[i] - arr[i-1] <= 1) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        System.out.println("max length: " + maxLength);
    }

    // 4.10 tìm 2 chuỗi có nhiều substr trùng nhau nhất - chưa làm được

}
