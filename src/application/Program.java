package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);



        System.out.println("Enter product data");
        
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();

        Product product = new Product(name, price, quantity);

        product.setName("computer");
        System.out.println("Updated name: " + product.getName());

        product.setPrice(900);
        System.out.println("Updated price: " + product.getPrice());


        System.out.println("product data: " + product);
        


        System.out.print("enter the number of products to be addes in stock: ");
        quantity = input.nextInt();
        product.addProducts(quantity);
        System.out.println("Update data: " + product);


        System.out.print("enter the number of products to be removed in stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);


       
        
        

        //System.out.println(product.name + " " + product.price + " " + product.quantity);

        input.close();
    }
}
