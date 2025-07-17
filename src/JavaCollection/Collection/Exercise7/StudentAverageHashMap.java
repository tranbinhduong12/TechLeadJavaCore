package JavaCollection.Collection.Exercise7;

import java.util.*;

public class StudentAverageHashMap {
    Scanner sc = new Scanner(System.in);

    public void run() {
        Map<String, List<Double>> studentScore = new HashMap<>();

        System.out.print("input number of student: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("input student " + (i+1) + " : ");
            String name = sc.nextLine();

            System.out.print("input score of " + name + " : ");
            int m = sc.nextInt();

            List<Double> score = new ArrayList<>();
            System.out.println("input " + m + " score: ");
            for (int j =0; j < m; j++) {
                score.add(sc.nextDouble());
            }
            sc.nextLine(); // clear buffer

            studentScore.put(name, score);
        }

        System.out.println(" average score for each student ");
        for (Map.Entry<String, List<Double>> entry : studentScore.entrySet()) {
            String name = entry.getKey();
            List<Double> scores = entry.getValue();

            double average = averageScore(scores);
            System.out.printf("student: %-20s -> average score: %.2f%n", name, average);
        }
        sc.close();
    }

    private double averageScore(List<Double> scores) {
        if (scores.isEmpty()) return 0;
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    public static void main(String[] args) {
        StudentAverageHashMap studentAverageHashMap = new StudentAverageHashMap();
        studentAverageHashMap.run();
    }
}
