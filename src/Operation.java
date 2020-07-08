import java.util.function.BiFunction;

public class Operation {

    BiFunction<Integer , Integer, Integer> plus = (x , y) -> x + y;
    BiFunction<Integer , Integer, Integer> minus = (x , y) -> x - y;
    BiFunction<Integer , Integer, Integer> multiplication = (x , y) -> x * y;
    BiFunction<Integer , Integer, Integer> division = (x , y) -> x / y;

}
