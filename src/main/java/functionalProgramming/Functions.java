package functionalProgramming;

import java.util.Locale;

public class Functions {
    public static void main(String[] args) {

        Equation addition = new Equation() {
            @Override
            public double evaluate(double number1, double number2) {
                return number1 + number2;
            }
        };


        Equation subtraction = (double number1, double number2) -> {
            return number1 - number2;

        };

        Equation multiplication = ( number1, number2) -> {     // mozna pominąć typy!
            return number1 * number2;

        };

        Equation divide = ( number1, number2) -> number1 / number2;  // mozna pominąć klamry




        System.out.println(addition.evaluate(10, 20));
        System.out.println(subtraction.evaluate(30, 10));
        System.out.println(multiplication.evaluate(10, 5));
        System.out.println(divide.evaluate(10, 2));


        TextManipulator shouter = text -> text.toUpperCase(Locale.ROOT) + "!";
        System.out.println(shouter.change("hello"));

        TextManipulator encoder = text -> {
            String newText = "";

            for (int i = 0; i < text.length(); i++) {
                char letter = (char) (text.charAt(i) + 1);
                newText += letter;
            }
            return  newText;
        };

        System.out.println(encoder.change("Sasanka"));
    }


}

interface Equation {
    double evaluate(double number1, double number2);
}

interface TextManipulator {
    String change(String text);
}


// Wyrażenie lambda można budować na bazie wyłącznie interfejsów funkcyjnych, czyli takich
// które mają DOKŁADNIE JEDNĄ   METODĘ ABSTRAKCYJNĄ