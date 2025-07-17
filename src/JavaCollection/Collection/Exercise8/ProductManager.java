package JavaCollection.Collection.Exercise8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductManager {
    private final Map<String, Product> products = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add new product");
            System.out.println("2. Show all products");
            System.out.println("3. Find product by code");
            System.out.println("4. Remove product by code");
            System.out.println("5. Update product by code");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> showProducts();
                case 3 -> findProduct();
                case 4 -> removeProduct();
                case 5 -> updateProduct();
                case 0 -> {
                    return;
                }
                default -> System.out.println("invalid choice");
            }
        }
    }

    private void addProduct() {
        System.out.print("input product code: ");
        String code = sc.nextLine();

        if (products.containsKey(code)) {
            System.out.println("Product code already exists.");
            return;
        }
        System.out.print("input product name: ");
        String name = sc.nextLine();
        System.out.print("input price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("input quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());

        products.put(code, new Product(name, price, quantity));
        System.out.println("Product added.");
    }

    private void showProducts() {
        if (products.isEmpty()) {
            System.out.println("no product found");
            return;
        }

        System.out.println("product list: ");
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            System.out.println("code " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    private void findProduct() {
        System.out.print("input product code to find: ");
        String code = sc.nextLine();

        Product product = products.get(code);
        if (product != null) {
            System.out.println("product found: " + product);
        } else {
            System.out.println("product not found");
        }
    }

    private void removeProduct() {
        System.out.print("input product code to remove: ");
        String code = sc.nextLine();

        if (products.remove(code) != null) {
            System.out.println("product removed");
        }
        else {
            System.out.println("product not found");
        }
    }

    private void updateProduct() {
        System.out.print("input product code to update: ");
        String code = sc.nextLine();

        Product product = products.get(code);
        if (product == null) {
            System.out.println("product not found");
            return;
        }

        System.out.print("input new name: (" + product.getName() + "): ");
        String newName = sc.nextLine();
        if (!newName.isEmpty()) {
            product.setName(newName);
        }

        System.out.print("input new price (" + product.getPrice() +"):");
        String newPrice = sc.nextLine();
        if (!newPrice.isEmpty()) {
            product.setPrice(Double.parseDouble(newPrice));
        }

        System.out.print("input new quantity (" + product.getQuantity() + "): ");
        String newQty = sc.nextLine();
        if (!newQty.isEmpty()) {
            product.setQuantity(Integer.parseInt(newQty));
        }
        System.out.println("product updated");
    }
}
