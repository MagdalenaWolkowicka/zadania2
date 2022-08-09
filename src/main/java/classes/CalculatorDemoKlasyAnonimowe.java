package classes;

import java.util.Scanner;

public class CalculatorDemoKlasyAnonimowe {
    public static void main(String[] args) {

        MathOperation addition = new MathOperation() {
            @Override
            public int execute(int number1, int number2) {
                return number1 + number2;
            }
        };
        Calculator calculator = new Calculator(addition);
        calculator.calculate();

        MathOperation subtraction = new MathOperation() {
            @Override
            public int execute(int number1, int number2) {
                return number1 - number2;
            }
        };

        Calculator calculator1 = new Calculator(subtraction);
        calculator1.calculate();

    }


}

class Calculator {

    private MathOperation mathOperation;

    public Calculator(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void  calculate() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int number = scanner.nextInt();

        System.out.println("Podaj druga liczbe");
        int number2 = scanner.nextInt();

        // obliczenia
        mathOperation.execute(number, number2);
        int result = mathOperation.execute(number, number2);
        System.out.println("wynik obliczenia: " + result);
    }

}

interface  MathOperation {
    int execute(int number1, int number2);
}