package se.lexicon;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        double result1 = Calculator.multiply(5, 6);
        System.out.println(result1);
        double result2 = Calculator.multiply(2, 3);
        PrintMessage.print("Multiply result: " + result2);


    }


}
