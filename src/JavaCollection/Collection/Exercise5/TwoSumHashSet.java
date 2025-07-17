package JavaCollection.Collection.Exercise5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoSumHashSet {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("input element: ");
        for (int i = 0; i < n;i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("input target: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("result: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("not found pair of numbers");
        }
        sc.close();
    }

    public int[] twoSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.contains(complement)) {
                // tìm index của complement
                for (int j = 0; j < i; j++) {
                    if (nums[j] == complement) {
                        return new int[] {i, j};
                    }
                }
            }
            seen.add(nums[i]);
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSumHashSet twoSumHashSet = new TwoSumHashSet();
        twoSumHashSet.run();
    }

}
