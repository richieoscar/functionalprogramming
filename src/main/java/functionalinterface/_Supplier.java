package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        //normal java
        System.out.println( getDbConnectionUrl());

        //functional java
        System.out.println(getDbUrl.get());
    }

    //normal java function for getting stuff
    static String getDbConnectionUrl() {
        return "jdbc//localhost:3243/users";
    }

    //Supplier function interface does the same it suplies stuff
    static Supplier<String> getDbUrl = () -> "jdbc//localhost:3243/users";
}
