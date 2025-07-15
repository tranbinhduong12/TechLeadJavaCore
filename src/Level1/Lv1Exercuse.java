package Level1;

import java.util.Arrays;
import java.util.Scanner;

public class Lv1Exercuse {
    Scanner sc = new Scanner(System.in);
    //1.1 tính tổng 2 số
    public void sumNumber() {
        System.out.print("first number: ");
        int number1 = sc.nextInt();
        System.out.print("second number: ");
        int number2 = sc.nextInt();
        int sum = number1+number2;
        System.out.println("Sum: " + sum);
    }

    //1.2 tính độ dài chuỗi
    public void stringLength() {
        System.out.println("input string: ");
        String input = sc.nextLine();
        System.out.println("Length: " + input.length());
    }

    // 1.3 Tính bình phương
    public void squareNumber() {
        System.out.println("number: ");
        int num = sc.nextInt();
        int square = num*num;
        System.out.println("Square: " + square);
    }

    //1.4 tìm chuỗi lớn nhất trong dãy
    public void findMax() {
        System.out.println("input numbers: ");
        String input = sc.nextLine();
        String[] parts = input.split(",");

        int max = Integer.parseInt(parts[0].trim());

        for (int i=1; i < parts.length; i++) {
            int number = Integer.parseInt(parts[i].trim());
            if (number >max) {
                max = number;
            }
        }
        System.out.println("max number: " + max);
    }

    //1.5 tìm chuỗi ngắn nhất
    public void findShortestString() {
        System.out.println("Input string: ");
        String input = sc.nextLine();

        String[] parts = input.split(",");

        String shortest = parts[0].trim();

        for (int i =1; i < parts.length; i++) {
            String s1 = parts[i].trim();
            if (s1.length() < shortest.length()) {
                shortest = s1;
            }
        }

        System.out.println("The shortest string: " + shortest);
    }

    // 1.6 sắp xếp số tăng dần
    public void sortNumberAsc() {
        System.out.println("input numbers: ");
        String input = sc.nextLine();

        String[] parts = input.split(",");
        int[] numbers = new int[parts.length]; // tạo mảng số nguyên numbers có kích thước bằng mảng parts

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }

        Arrays.sort(numbers);

        System.out.println("Sort list asc: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // 1.7 sắp xếp chuỗi theo thứ tự alphabet
    public void sortStringAlphabet() {
        System.out.println("input strings: ");
        String input = sc.nextLine();

        String[] parts = input.split(",");

        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
        }

        Arrays.sort(parts);

        System.out.println("Sorted: ");
        for (String str : parts) {
            System.out.print(str + " ");
        }
    }

    //1.8 tìm số trung vị: dãy có số phần tử lẻ -> số trung vị là số ở giữa
    // dãy có số phàn tử chẵn -> số trung vị là trung bình cộng 2 số ở giữa

    public void findMedian() {
        System.out.println("input numbers: ");
        String input = sc.nextLine();

        String[] parts = input.split(",");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }

        Arrays.sort(numbers);
        double median;
        int n = numbers.length;

        if (n%2 == 1) {
            median = numbers[n/2];
        } else {
            median = (numbers[n/2 -1] + numbers[n/2+1])/2.0;
        }

        System.out.println("Median: " + median);
    }

    // 1.9 tìm số lượng từ trong 1 chuỗi: hi guy -> 2 từ
    public void countWords() {
        System.out.println("input: ");
        String input = sc.nextLine();

        input = input.trim();

        if (input.isEmpty()) {
            System.out.println("number of words: 0");
            return;
        }

        String[] words = input.split("\\s+"); // tách chuỗi từ 1 hoặc nhiều dấu cách
        System.out.println("Number of words: " +words.length);
    }

    //1.10 đếm số chuỗi chứa ký tự "a"
    public void countStrContainA() {
        System.out.println("input strings: ");
        String input = sc.nextLine();

        String[] parts = input.split(",");
        int count = 0;

        for (String str : parts) {
            if (str.trim().toLowerCase().contains("a")) {
                count++;
            }
        }

        System.out.println("number of string contain 'a': " + count);
    }

}