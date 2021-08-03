package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int ans = incrementByOne.apply(19);
        System.out.println(ans);

        int ans2 = increment(10);
        System.out.println(ans2);

        // chaining functions with addThen()
        Function<Integer, Integer> addAndMulBy10 = incrementByOne.andThen(multiplyBy10);
        Integer ans3 = addAndMulBy10.apply(5);
        System.out.println(ans3);

        //BIfunction
        Integer ans4 = addAndMultiplyBi.apply(2, 10);
        System.out.println(ans4);

    }

    static  Function<Integer, Integer> incrementByOne = number ->++number;
    static  Function<Integer, Integer> multiplyBy10 = number -> number * 10;
    static BiFunction<Integer, Integer, Integer> addAndMultiplyBi =(num1, num2)-> (num1 +1) *num2;

    static int increment(int number){
        return ++number;
    }
}
