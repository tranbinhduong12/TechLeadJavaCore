package JavaCollection.Collection.Exercise12;

import java.util.*;
import java.time.LocalDate;

public class ProductStore {
    public void run() {
        List<Product> products = new ArrayList<>();

        // sample products
        products.add(new Product("Banana", "P001", 2.5, LocalDate.of(2024, 5, 20)));
        products.add(new Product("Apple", "P002", 3.0, LocalDate.of(2024, 6, 10)));
        products.add(new Product("Orange", "P003", 2.5, LocalDate.of(2024, 7, 15)));
        products.add(new Product("Mango", "P004", 5.5, LocalDate.of(2024, 5, 25)));

        Scanner sc = new Scanner(System.in);

        System.out.println("Select sorting criteria:"); // chọ các tiêu chí sắp xếp
        System.out.println("1. By name"); //
        System.out.println("2. By price");
        System.out.println("3. By production date"); // theo ngày sản xuất
        System.out.println("4. By price and production date"); // theo giá bán và ngày sản xuất
        System.out.print("Your choice: ");

        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                products.sort(Comparator.comparing(Product::getName));
                break;
            case 2:
                products.sort(Comparator.comparing(Product::getPrice));
                break;
            case 3:
                products.sort(Comparator.comparing(Product::getManufactureDate).reversed());// sắp xếp sp mới trước
                break;
            case 4:
                products.sort(Comparator
                        .comparingDouble(Product::getPrice)
                        .thenComparing(Product::getManufactureDate).reversed());
                break;
            default:
                System.out.println("invalid choice");
                return;
        }

        System.out.println("product list after sort: ");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
