import java.util.function.*;

public class Functions{
    public static void main(String[] args) {
        Function <Integer, Integer> square = i -> i * i;
        Function <String, Integer> length = i -> i.length();
        Predicate <Integer> checkEven = i -> (i&1)==0;
        System.out.println("Square of 4 is " + square.apply(4));
        System.out.println("Length of Adarsh is " + length.apply("Adarsh"));
        System.out.println("2 is Even " + checkEven.test(2));
        System.out.println("3 is Even " + checkEven.test(3));
    }
}