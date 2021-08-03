package functionalinterface;

import java.util.function.Predicate;

public class _Predicates {

    public static void main(String[] args) {
        //normal java
        System.out.println(isPhoneNUmberValid("08099090098"));
        //functional predicate interface java
        System.out.println(isValidPhoneNumber.test("08034444575"));

        //chaining predicate
        System.out.println(isValidPhoneNumber.and(contains4).test("08023345679"));

    }

    //normal java function that returns a boolean
    static boolean isPhoneNUmberValid(String phone){
        return phone.startsWith("080") && phone.length() ==11;
    }

    //FUnctional interface
    //The Predicate interface takes one paramter and returns a boolean
    static Predicate<String> isValidPhoneNumber = phone-> phone.startsWith("080") && phone.length() ==11;
    static Predicate<String> contains4 = phone -> phone.contains("4");
}
