package lambdainjava.radionov;

import java.util.function.Function;

/**
 *
 * @author Alex
 */
public class FunctionManager {
    public static void run(Double step) {
        Function<Double, Double> func = x -> x * x;
        Function<Double, Double> calcFunc = y -> step * (y * y);
        Function<Double, Double> resFunc = func.andThen(calcFunc);
        System.out.println("res func:" + func.apply(step));
        System.out.println("res calcFunc:" + resFunc.apply(step));
    }
}
