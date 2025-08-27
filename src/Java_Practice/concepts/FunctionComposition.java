package Java_Practice.concepts;

import java.util.function.Function;

public class FunctionComposition {
    public static void main(String[] args) {
        Function<String, String> toUpper = String::toUpperCase;
        Function<String, String> addExclamation = str -> str + "!";

        String out1 = toUpper.apply("Krishna");
        System.out.println(out1);

        String out2 = addExclamation.apply("Krishna");
        System.out.println(out2);

        Function<String, String> andThen = toUpper.andThen(addExclamation);
        String lagad = andThen.apply("Lagad");
        System.out.println(lagad);

        Function<String, String> compose = toUpper.compose(addExclamation);
        String lagad1 = compose.apply("Lagad");
        System.out.println(lagad1);
    }
}