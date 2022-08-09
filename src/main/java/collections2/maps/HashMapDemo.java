package collections2.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        //mapy to powiązania klucza z wartością
        Map<String, User> users = new HashMap<>();
        //klucze są unikatowe
        //klucze są jak indexy List ale sami wybieramy jakiego typu i z jaką wartością
        users.put("abc@gmail.com", new User("Adam", 30));
        users.put("aaa@gmail.com", new User("Artur", 33));
        users.put("aaa@gmail.com", new User("Ania", 22));
        users.put("ccc@gmail.com", new User("Andrzej", 60));
        users.put("ddd@gmail.com", new User("Adam", 30));

        System.out.println(users);
        User found = users.get("ccc@gmail.com");
        System.out.println(found);
        //map nie można bezpośrednio przeglądać

        /* for(User user :users){
       }*/

        System.out.println("Keys iteration");
        //przeglądanie kluczy umożliwia również przeglądanie wartości
        for (String key : users.keySet()) {
            System.out.println(key  + " = " + users.get(key));
        }

        System.out.println("Values iteration");
        //przeglądanie wartości, pozwala dostać się wyłącznie do wartości
        for(User user : users.values()){
            System.out.println(user);
        }

        System.out.println("Entries iteration");
        //iteracja po parach wartości (Map.Entry)
        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println(entry);
            entry.setValue(new User("Zofia", 50));
        }

        System.out.println(users);




    }
}
