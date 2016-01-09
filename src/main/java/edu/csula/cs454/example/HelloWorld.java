package edu.csula.cs454.example;

public class HelloWorld {
    private static String name = "Search Engine";

    public static void main(String[] args) {
        System.out.println(
            String.format("Hello %s", getName())
        );
    }

    public static String getName() {
        return name;
    }
}