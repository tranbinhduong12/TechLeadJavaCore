package JavaCollection.Collection.Exercise9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCountHashMap {
    public void run() {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> wordCount = new HashMap<>();

        System.out.print("input texts: ");
        String text = sc.nextLine();

        // chuyển văn bản về chữ thường, loại bỏ dấu, tách từ
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) continue; // bỏ qua những từ rỗng, không xử lý chúng
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // đếm số lần xuất hiện mỗi từ
        System.out.println("number of occurrences of each word: ");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.printf("%-15s : %d%n", entry.getKey(), entry.getValue());
        }
        sc.close();
    }

    public static void main(String[] args) {
//        CountWordHashMap countWord = new CountWordHashMap();
        new WordCountHashMap().run();
    }
}
