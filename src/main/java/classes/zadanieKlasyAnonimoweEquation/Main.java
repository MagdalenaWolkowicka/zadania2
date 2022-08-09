package classes.zadanieKlasyAnonimoweEquation;

public class Main {

    public static void main(String[] args) {

        Equation equationSum = new Equation() {
            @Override
            public int execute(int number1, int number2) {

                return number1 + number2;
            }
        };

        Equation equationSubtract = new Equation() {
            @Override
            public int execute(int number1, int number2) {
                return number1 - number2;
            }
        };

        int sumResult = equationSum.execute(2, 3);
        System.out.println(sumResult);
        int subtractResult = equationSubtract.execute(8, 2);
        System.out.println(subtractResult);

    }

}
