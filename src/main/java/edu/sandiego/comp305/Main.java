package edu.sandiego.comp305;

public class Main {

    public void run() {
        // using this to avoid the issue with checkstyle thinking
        // this is a utility class
    }

    public static void main(final String[] args) {

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
