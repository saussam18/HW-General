package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Problem 1: Recursion methods call themselves within their own method until a certain thing is met.
        It behaves similarly to a for loop as it repeats until a certain thing happens.
        Problem 2: Base cases are the cases that break the loop  and is the first thing it does after the loop of methods.
        It stops it from calling itself forever. The Recursive case is where the method calls itself.
        Problem 3: Output
        a. 1
        b. 1, 2
        c. 1, 3
        d. 1, 2, 4
        e. 1, 2, 4, 8, 16
        f. 1. 3. 7. 15. 30
        g. 1, 3, 6, 12, 25, 50, 100
        Problem 4: Output
        a. 113
        b. 140, 70
        c. 168, 84, 42
        d. 120, 60, 30
        e. 160, 80, 40, 20, 10
        Problem 5: Output
        a. *
        b. [*]
        c. ([*])
        d. ([([*])])
        e. [([([*])])])]
        Problem 6: Output
        a. 4
        b. 8, 4, 8
        c. 16, 8, 16
        d. 12, 8, 4, 8, 12
        e. 12, 9, 6, 3, 6, 9,12
        Problem 7: Look beyond these comments to method

        Problem 8: It is the info or stack of method calls that need to happen for the loop to occur
        Problem 9: It would not reverse as you are printing the line before the method call
        Problem 10: An infinite loop or stack overflow happens as it calls the method forever
         */


        doubleReverse("YEET");
        System.out.println();

    }
    public static void doubleReverse(String s) {
        if (s.length() > 0) {
            char c = s.charAt(s.length() - 1);
            System.out.print(c);
            System.out.print(c);
            doubleReverse(s.substring(0, s.length() - 1));
        }
    }
}
