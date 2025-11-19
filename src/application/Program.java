package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data");
        
        System.out.print("Name: ");
        produc.name = input.nextLine();
        System.out.print("");
        product.price = input.nextDouble();
        product.quantity = input.nextInt();


        input.close();
    }
}
