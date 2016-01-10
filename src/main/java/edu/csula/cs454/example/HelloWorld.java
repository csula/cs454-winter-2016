package edu.csula.cs454.example;

/**
 * Simple hello world program.
 *
 * <p>
 *     You can execute this program along with task defined in build.gradle by
 *     `gradle hello -Parguments="Hello Search Engine 101" which then will pass
 *     "Hello", "Search", "Engine", "101" as array of arguments to this main
 *     method.
 * </p>
 */
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