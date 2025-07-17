package JavaCore.Level;

import java.util.Scanner;

public class Level2Exercise {
    Scanner sc = new Scanner(System.in);
    //2.1 tìm số lớn thứ 2 trong dãy
    public void findSecondMax() {
        System.out.println("input numbers: ");
        String input = sc.nextLine();

        String[] parts = input.split(","); // tạo mảng parts, các phần tử được phân tách ","
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }

        if (numbers.length < 2) {
            System.out.println("at least two numbers");
            return;
        }

        int max = Math.max(numbers[0], numbers[1]);
        int secondMax = Math.min(numbers[0], numbers[1]);
        boolean foundsecond = (numbers[0] != numbers[1]); // kiểm tra max khác secondMax

        for(int i = 2; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > max) {
                secondMax = max;
                max = num;
                foundsecond = true;
            } else if (num > secondMax && num < max) {
                secondMax = num;
                foundsecond = true;
            }
        }

        if (!foundsecond) {
            System.out.println("no secondMax");
        } else {
            System.out.println("secondMax: " + secondMax);
        }
    }

    // 2.2 tìm từ dài nhất trong danh sách chuỗi
    public void findLongestWord() {
        System.out.println("input strings: ");
        String input = sc.nextLine();

        String[] words = input.split(",");

        if (words.length == 0) {
            System.out.println("no words");
            return;
        }

        String longest = words[0].trim();
        for (int i = 1; i < words.length; i++) {
            String word = words[i].trim();
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("longest word: " + longest);
    }

    //2.3 tìm chuỗi con chung dài nhất của hai chuỗi
    public void findLongestSubStr(){
        System.out.println("input s1: ");
        String s1 = sc.nextLine();

        System.out.println("Input s2: ");
        String s2 = sc.nextLine();

        StringBuilder longest = new StringBuilder();// dùng lưu chuỗi chung dài nhất

        for (int i = 0; i <s1.length(); i++) {
            for (int j = 0; j < s2.length();j++){
                StringBuilder current = new StringBuilder(); // chuỗi chung tạm thời
                int m = i;
                int n = j;

                // So sánh các ký tự từ vị trí i, j
                while (m < s1.length() && n < s2.length() && s1.charAt(m) == s2.charAt(n)) {
                    current.append(s1.charAt(m));
                    m++;
                    n++;
                }

                if (current.length() > longest.length()) {
                    longest = current;
                }
            }
        }
        System.out.println("longest sub string: " + longest.toString());
    }

    //2.4 tìm số chia hết cho cả 3 và 5
    public void sumDivisibleByThreeAndFive() {
        System.out.println("input numbers: ");
        String input = sc.nextLine();

        String[] parts = input.split(",");
        int sum = 0;

        for (String part : parts) {
            int num = Integer.parseInt(part.trim());
            if (num % 3 == 0 && num % 5 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum numbers: " + sum);
    }

    //2.5 tổng lớn nhất của dãy con liên tiếp
    public void maxSubSum() {
        System.out.println("input numbers: ");
        String input = sc.nextLine();

        String[] parts = input.split(",");
        int[] nums = new int[parts.length];

        for (int i =0; i <nums.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("max sum of sub array:"+ maxSum);
    }
}
