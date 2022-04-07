package at.campus02.iwi.recursion;

public class MultiplicationDemoApp {
    public static void main(String[] args) {
        System.out.println(multiplicate(10, 5));
        System.out.println(multiplicate(3, 5));
        System.out.println(multiplicate(10, 10));
    }

    public static int multiplicate(int number1, int number2) {
        if (number1 < 0) {
            return multiplicate(number1, number2);
        } else if (number2 != 0) {
            return number1 + multiplicate(number1, number2 - 1);
        } else {
            return 0;
        }
    }
}
