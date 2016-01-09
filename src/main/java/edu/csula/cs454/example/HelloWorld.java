package edu.csula.cs454.example;

public class HelloWorld {
    private static String name = "Search Engine";

    public static void main(String[] args) {
        for (String arg: args) {
            System.out.println("Received argument: " + arg);
        }
        System.out.println(
            String.format("Hello %s", getName())
        );
    }

    public static String getName() {
        return name;
    }
}