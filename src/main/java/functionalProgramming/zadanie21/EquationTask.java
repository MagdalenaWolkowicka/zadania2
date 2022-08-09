package functionalProgramming.zadanie21;

public class EquationTask {
    public static void main(String[] args) {

       Operation addition = new Operation() {
           @Override
           public double calculate(double number1, double number2) {
               return number1 + number2;
           }
       };

       Operation subtract = (number1, number2) -> number1 - number2;

        System.out.println(addition.calculate(2, 4));
        System.out.println(subtract.calculate(3,1));



    }
}

interface Operation {
    abstract double calculate(double number1, double number2);
}

/*
Stwórz interfejs Operation, posiadający metodę abstrakcyjną przyjmującą 2 liczby i zwracającą liczbę.

za pomocą wewnętrznej klasy zaimplementuj dodawanie
za pomocą lambdy zaimplementuj odejmowanie



 */
