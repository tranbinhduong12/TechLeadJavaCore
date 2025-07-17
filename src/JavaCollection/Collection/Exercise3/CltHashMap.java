package JavaCollection.Collection.Exercise3;

import java.util.HashMap;
import java.util.Scanner;

public class CltHashMap {
    public void run() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> people = new HashMap<>();

        //1. Thêm các cặp key- value
        System.out.print("input the number of people: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i ++) {
            System.out.print("input the name of person: "+ (i+1) + " : ");
            String name = sc.nextLine().trim();

            System.out.print("input age of " + name + " : ");
            int age = Integer.parseInt(sc.nextLine());

            people.put(name, age);
        }

        // 2. Hiển thị danh dách tên
        System.out.println("List of aff people's name: ");
        for (String name : people.keySet()) {
            System.out.println(name + " ");
        }

        // 3. tìm tuổi của 1 người
        System.out.println("input the name of the person to check age: ");
        String searchName = sc.nextLine().trim();
        if (people.containsKey(searchName)) {
            System.out.println(searchName + " is age: " + people.get(searchName));
        }
         else {
            System.out.println(" can not find " + searchName);
        }

         // 4. Xóa 1 người
        System.out.println("input name of person to remove: ");
         String removeName = sc.nextLine().trim();
         if (people.containsKey(removeName)) {
             people.remove(removeName);
             System.out.println("removed " + removeName);
         } else {
             System.out.println("can not find " + removeName);
         }

         // 5. kiểm tra 1 người có tồn tại trong hashMap không
        System.out.println("input name of person to check: ");
         String checkName = sc.nextLine().trim();
         if (people.containsKey(checkName)) {
             System.out.println(checkName + " exist");
         } else {
             System.out.println(checkName + " does not exist");
         }
         sc.close();

    }

    public static void main(String[] args) {
        CltHashMap cltHashMap = new CltHashMap();
        cltHashMap.run();
    }
}
