package JavaCollection.Collection.Exercise10;

import java.util.*;

public class ScoreStudentHashMap {
    Scanner sc = new Scanner(System.in);

    public void run() {
        List<Double> scores = new ArrayList<>();
        Map<Double, Integer> scoreCount = new HashMap<>();

        System.out.print("input number of student: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("input the score of studen " + (i+1) +" : ");
            double score = Double.parseDouble(sc.nextLine());
            scores.add(score);

            //cập nhập vào hashMap: Điểm -> số lượng xuất hiện
            scoreCount.put(score, scoreCount.getOrDefault(score, 0) + 1);
        }

        // Thống kê theo phân loại
        int high = 0;
        int medium = 0;
        int fail = 0;
        for (double score : scores) {
            if (score >= 8) {
                high++;
            } else if (score >= 5.0) {
                medium++;
            } else {
                fail++;
            }
        }

        //result
        System.out.println("\nScore distribution:");
        System.out.println("Number of high-scoring students    (>= 8.0): " + high);
        System.out.println("Number of average-scoring students (>= 5.0 and < 8.0): " + medium);
        System.out.println("Number of failing students         (< 5.0): " + fail);

        // hiển thị thống kê
        System.out.println("thống kê score");
        for (Map.Entry<Double, Integer> entry : scoreCount.entrySet()) {
            System.out.printf("score %.1f : %d student %n", entry.getKey(), entry.getValue());
        }
        sc.close();
    }

    public static void main(String[] args) {
        new ScoreStudentHashMap().run();
    }

}
