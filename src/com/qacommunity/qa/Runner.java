package com.qacommunity.qa;

public class Runner {
    public static void main(String[] args) {
        // while loops should be used when we don't know how many times we want to iterate        // i.e. repeat some instructions//      whileLoop();//      doWhileLoop();        // for loops should be used when we know how many times we want to iterate,        // such as when we know the length of a list or a number to count to        // forLoop();        // nestedForLoop();        controlStatements();
    }
    // avoid these    public static void infiniteLoops() {
//      for (;;) {//          int i = 0;//          System.out.println(i);//      }//      //      while (true) {//          int i = 0;//          System.out.println(i);//      }//      for (double i = 0; i < 10; i--) {//          System.out.println(i);//      }    }
    public static void forLoop() {
        // for (initializers; termination; increment)        for (int counter = 0; counter <= 10; counter++) {
            // only print even numbers from 0 to 10            if (counter % 2 == 0) {
                System.out.println(counter);
            }
        }
    }
    public static void nestedForLoop() {
        // a nested for loop is a loop within a loop        int targetTimesTable = 10;
        int targetCount = 12;
        for (int table = 1; table <= targetTimesTable; table++) { // outer loop            System.out.println("TIMES TABLE FOR: " + table);
            for (int count = 1; count <= targetCount; count++) { // inner loop//              System.out.println("OUTER LOOP ITERATION: " + table);//              System.out.println("INNER LOOP ITERATION: " + count);                System.out.println(table + " x " + count + " = " + (table * count));
            }
        }
    }
    public static void controlStatements() {
        // break, continue        // - break will stop the loop, i.e. it will break out of it        // - continue will skip to the next iteration of the loop        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                continue; // skips to the next iteration if i is a multiple of 10            }
            if (i == 93) {
                break; // exits the loop            }
            System.out.println(i);
        }
        // the break statement forces control to return to here    }
    public static void doWhileLoop() {
        // almost exactly the same as the while loop        // except that it will run at least once        boolean inPlay = false;
        String prompt = "> ";
        do {
            System.out.println("PLAY | EXIT");
            System.out.print(prompt);
            // instead of doing nothing, we would be getting user input here            String input = "EXIT";
            // do some action based on input, i.e. some if statements            if (input == "EXIT") {
                inPlay = false;
            }
        } while (inPlay == true);
    }
    public static void whileLoop() {
        // while loops use a boolean expression        // while (someBooleanExpression)        // >,<,==,!=,<=,>=        boolean inPlay = true;
        int i = 3;
//       the loop only runs while inPlay is true        while (inPlay == true) { // start of while loops body            if (i >= 10) {
                inPlay = false;
            }
            System.out.println(i);
            i = i + 1; // i += 1; or as i++;        } // end of while loops body        // equivalent to the above loop        i = 3;
        inPlay = true;
        while (inPlay) {
            System.out.println(i);
            i = i + 1; // i += 1; or as i++;            if (i > 10) {
                inPlay = false;
            }
        }
        // equivalent to the above 2 while loops        // but it doesn't need an if statement as we don't use the inPlay variable.        // - instead, we directly do the check in the while loops boolean condition        i = 3;
        while (i <= 10) {
            System.out.println(i);
            i++; // i += 1; or as i++;        }
    }
}