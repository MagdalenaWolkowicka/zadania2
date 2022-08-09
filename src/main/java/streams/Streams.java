package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        Product product1 = new Product("Cukier", 8.99, 1);
        Product product2 = new Product("Mleko", 3, 40);
        Product product3 = new Product("Kocia karma", 6, 15);
        Product product4 = new Product("Papier toaletowy", 10, 20);
        Product product5 = new Product("Mąka", 2.5, 4);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);


        // wyświelt produkty, które kosztują mniej niż 5 zł

     List<Product> filteredProducts =   products.stream()   // przypisujemy posortowane do nowej listy
                .filter(product -> product.getPrice() < 5)
                        .collect(Collectors.toList());
               // .forEach(product -> System.out.println(product));  // a tak się wypisuje
        System.out.println(" ");

       List<Product> posortowane =  products.stream().sorted((prod1, prod2)-> Double.compare(prod1.getPrice(), prod2.getPrice()))
                        .collect(Collectors.toList());
        System.out.println(posortowane);
        System.out.println(" ");

        products.stream()
                        .filter(product -> product.getPrice()< 10)
                                .map(product -> product.getAmount())
                                        .filter(amount -> amount > 10)
                                                .forEach(amount -> System.out.println(amount));
        System.out.println(" ");

        int sum = products.stream()
                .filter(product -> product.getPrice()< 10)
                .mapToInt(product -> (int) product.getAmount())
                .filter(amount -> amount < 10)
                .sum();
        System.out.println(sum);
        System.out.println("");

        Product prod = products.stream()
                        .sorted((prod1, prod2) -> (int) (prod2.getAmount()- prod1.getAmount()))
                                .findFirst()
                                        .get();
        System.out.println(prod);





        System.exit(0);

        products.forEach(product -> System.out.println(product));




        // zliczam łączną ilość

        // int counter = 0;
        MyInt myInt = new MyInt();
        myInt.number = 0;

        // nie mozna używać zmiennych lokalnych w lambdzie chyba że są final
        products.forEach(product -> {
            myInt.number += product.getAmount();
        });





    }

//    private static Consumer<Product> prepareLambda() {
//        int counter = 0;
//        Consumer<Product> myLambda = product -> {
//            counter += product.getAmount();
//        };
//        return myLambda;
//    }

}

class MyInt {
    int number;
}

class Product {
    private  String name;
    private double price;
    private  double amount;

    public Product(String name, double price, double amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }
}
