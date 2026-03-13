/**
 * HelloApp.java – Java application that displays
 * a greeting using command-line arguments.
 */

public class HelloApp {

    public static void main(String[] args) {

        // Check if a name is provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default message if no argument
            System.out.println("Hello, World!");
        }

    }
}