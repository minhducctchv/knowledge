package com.example.demo;

/**
 * Main entry point of the application.
 */
public class App {

    /**
     * Returns a greeting message.
     *
     * @return the greeting text
     */
    public String getGreeting() {
        return "Hello from demo-java-project!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
