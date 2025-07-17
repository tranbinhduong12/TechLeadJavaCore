package JavaCollection.Collection.Exercise2;

import java.util.HashSet;
import java.util.Scanner;

public class CltHashSet {
    public void run() {
        Scanner sc = new Scanner(System.in);

        HashSet<String> countries = new HashSet<>();

        // 1. thêm tên quốc gia
        System.out.print("input the number of the countries:");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("input country name " +(i+1) + " : ");
            String country = sc.nextLine().trim();
            boolean added = countries.add(country);
            if (!added) {
                System.out.println("the country " + country + " already exists");
            }
        }

        // 2. hiển thị danh sách country
        System.out.println("countries list:");
        for (String country : countries) {
            System.out.print(country + " ");
        }
        System.out.println();

        //3. kiểm tra countries có tồn tại không
        System.out.print("input county name: ");
        String checkCountry = sc.nextLine().trim();
        if (countries.contains(checkCountry)) {
            System.out.println("The country \"" + checkCountry + "\" is in the list.");
        } else {
            System.out.println("The country \"" + checkCountry + "\" is not in the list.");
        }

        // 4. xóa 1 country
        System.out.println("input country name to remove: ");
        String removeCountry = sc.nextLine().trim();
        boolean removed = countries.remove(removeCountry);
        if (removed) {
            System.out.println("the country " + removeCountry + " has been removed");
        } else {
            System.out.println(removed + " was not found");
        }

        // 5. tính số lượng quốc gia trong HashSet
        System.out.println("number of countries: " +countries.size());
        sc.close();
    }

    public static void main(String[] args) {
        CltHashSet cltHashSet = new CltHashSet();
        cltHashSet.run();
    }
}
