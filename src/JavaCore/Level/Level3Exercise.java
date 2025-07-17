package JavaCore.Level;

import java.util.*;

public class Level3Exercise {
    Scanner sc = new Scanner(System.in);

    //3.1 tìm số nhỏ thứ 2 trong dãy
    public void findMinSecond() {
        System.out.println("input numbers: ");
        String input = sc.nextLine();

        String[] parts = input.split(",");
        int[] nums = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }

        if (nums.length < 2) {
            System.out.println("at least 2 numbers");
            return;
        }

        // tìm min
        int min = nums[0];
        for (int i = 1; i <nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }

        Integer seconMin = null;
        for (int num : nums) {
            if (num > min) {
                if (seconMin == null || num < seconMin) {
                    seconMin = num;
                }
            }
        }
        if (seconMin == null) {
            System.out.println("no second min number");
        } else {
            System.out.println("second min numbers: " + seconMin);
        }
    }

    //3.2 tìm hiệu lớn nhất giữa 2 phần tử bất kỳ
    public void finMaxDifference() {
        System.out.print("input numbers: ");
        String input = sc.nextLine();

        String[] parst = input.split(",");
        int[] nums = new int[parst.length];
        for (int i = 0; i < parst.length; i++) {
            nums[i] = Integer.parseInt(parst[i].trim());
        }

        if (nums.length < 2) {
            System.out.println("at least 2 numbers");
            return;
        }

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        int difference = max -min;
        System.out.println("max difference: " + difference);
    }

    // 3.3 độ dài dãy con tăng dài nhất, k cần liên tiếp
    public void findLongestIncreaseSub() {
        System.out.println("input numbers: ");
        String input = sc.nextLine();

        String[] parts = input.split(",");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }

        if (nums.length == 0) {
            System.out.println("empty list");
            return;
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLen = dp[0];
        for (int i = 1; i < n; i++) {
            if (dp[i] > maxLen) {
                maxLen = dp[i];
            }
        }

        System.out.println("max length: " +maxLen);
    }

    //3.4 tìm 2 chuỗi có nhiều ký tự giống nhau nhất
    //source: 100% chat GPT
    public void findMostOverlap() {
        System.out.println("input strings: ");
        String input = sc.nextLine();

        String[] strings = input.split(",");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();
        }

        int maxOverlap = -1; // số ký tự trùng lớn nhất
        String first = "";
        String second = "";

        for (int i = 0; i < strings.length; i++) {
            Map<Character, Integer> map1 = new HashMap<>();
            for (char c: strings[i].toCharArray()) {
                map1.put(c, map1.getOrDefault(c,0) + 1);
            }

            for (int j =i+1; j < strings.length; j++) {
                Map<Character, Integer> map2 = new HashMap<>();
                for (char c : strings[j].toCharArray()) {
                    map2.put(c, map2.getOrDefault(c,0) + 1);
                }

                int overlap = 0;
                for (char c : map1.keySet()) {
                    if (map2.containsKey(c)) {
                        overlap += Math.min(map1.get(c), map2.get(c));
                    }
                }

                if (overlap > maxOverlap) {
                    maxOverlap = overlap;
                    first = strings[i];
                    second = strings[j];
                }
            }
        }
        System.out.println("s1: " + first + ", s2: " +second + ", overlap: " + maxOverlap);
    }

    //3.5 tìm số nguyên dương nhỏ nhất k thể tạo ra bằng tổng các số trong chuỗi
    public void findSmallestNumber() {
        System.out.println("input numbers: ");
        String[] input = sc.nextLine().split(" ");

        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        int res = 1; // bắt đầu bằng
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > res) {
                break;
            }
            res += arr[i];
        }
        System.out.println("number: " + res);
    }

    //3.6 tìm số trung vị của 2 mảng đã nhập
    public void findMedianOfTwoArr() {
        System.out.println("input arr1: ");
        String[] input1 = sc.nextLine().split(" ");
        System.out.println("input arr2: ");
        String[] input2 = sc.nextLine().split(" ");

        int n1 = input1.length;
        int n2 = input2.length;

        int[] merged = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = Integer.parseInt(input1[i]);
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = Integer.parseInt(input2[i]);
        }

        Arrays.sort(merged);
        double median;
        int n = merged.length;
        if(n % 2 == 1) {
            median = merged[n/2];
        } else {
            median = (merged[n/2-1] + merged[n/2])/ 2.0;
        }
        System.out.println("Median: " + median);
    }

    //3.7 độ dài chuỗi đối xứng dài nhất
    public void longestRearrang() {
        System.out.println("input strings: ");
        String input = sc.nextLine().replaceAll("\\+s", "").toLowerCase();
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false; // đánh dấu ký tự có số lần lẻ

        for(int freq : freqMap.values()) {
            length += (freq/2)*2; // lấy phần chẵn
            if (freq % 2 == 1) hasOdd = true;
        }

        if (hasOdd) length += 1;
        System.out.println("length: " + length);


    }

    // 3.8 bỏ qua
    //3.9 bỏ qua

    //3.10 sắp xếp chuỗi:
    // - ít ký tự khác nhau hơn
    // - ngắn hơn đứng trước
    public void sortString() {
        System.out.println("input string: ");
        String[] input = sc.nextLine().split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(input));

        list.sort((s1, s2) -> {
            int unique1 = (int) s1.chars().distinct().count(); // số ký tự khác nhau
            int unique2 = (int) s2.chars().distinct().count();

            if (unique1 != unique2) {
                return Integer.compare(unique1, unique2);
            }
            return Integer.compare(s1.length(), s2.length()); // nếu bằng thì chuỗi ngắn hơn đứng trước
        });
        System.out.println("sorted list: ");
        for (String s: list) {
            System.out.println(s);
        }
    }
}
