package JavaCollection.Collection.Exercise11;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class SimpleDictionary {
    public void run() {
        Scanner sc = new Scanner(System.in);

        Map<String, String> dictionary = new HashMap<>();
        System.out.print("number of word: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("input word " +(i+1) + " : ");
            String word = sc.nextLine();

            // nhập định nghĩa của word
            System.out.print("input the definition of " + word + " : ");
            String definition = sc.nextLine();

            dictionary.put(word.toLowerCase(), definition);
        }

        // Tra cứu
        while (true) {
            System.out.println("input the word want to lookup: ");
            String keyword = sc.nextLine().toLowerCase();

            if (keyword.equals("exit")) {
                System.out.println("exit program");
                break;
            }

            if (dictionary.containsKey(keyword)) {
                System.out.println("definition: " + dictionary.get(keyword));
            } else {
                System.out.println(" the word is not in the dictionary");
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        new SimpleDictionary().run();
    }
}
