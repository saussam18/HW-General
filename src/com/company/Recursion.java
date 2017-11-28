package com.company;

public class Recursion {

        public void recursion() {
        /*
        Pg 802
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
        pg 805
        Problem 11: There is no base case, so it becomes a stackOverflow or an infinite loop

        Problem 12: The one with the less recursive calls is always the more efficient

        Problem 13: Output
        a. 6
        b. 4
        c. 7
        d. 0
        e. 1
        Problem 14: Output
        a. 57
        b. 1029
        c. -74
        d. 2438
        e. 132483
        Problem 15: Output
        a. 7
        b. 6
        c. 4
        d. 10
        e. 5
        Problem 16: Check code for method

        Problem 17: You need to flip the less than sign from n < 10 to M > 10

        Problem 18: Throw an error or an exception or have it change to the closest desirable. All of these would work

        Problem 19: Check code for method

         */
            doubleReverse("YEET");
            System.out.println();
            //Pg806
            //Problem 16
            System.out.println(factorial(5));
            //Problem 19
            System.out.println(fibonacci(10));
            //Pg 808
            //Problem 2
            writeNums(5);
            System.out.println();
            writeNums(12);
            System.out.println();
            //Problem 6
            writeSquares(8);
            //Problem 8
            System.out.println();
            System.out.println(multiplyEvens(1));
            System.out.println(multiplyEvens(4));
            //Problem 9
            System.out.println(sumTo(2));
            //Problem 10
            System.out.println(digitMatch(1072503891, 62530841));

            //Project Problem #1
            mAndC(3, 3, true);
        }

        public static void mAndC(int m, int c, boolean b){ //Helped by Ginsu, couldn't get the reverse my way so gave up and did it Ginsu's way which actually worked
            if(m == 0 && c == 0 && b == false){
                System.out.println(" M M M C C C                                     ");
                System.out.println("            ____B");
            }else if(b ==true){
                if(m == 3 && c == 3){
                    System.out.println("                                 C C C M M M");
                }else if(m == 3 && c == 2){
                    System.out.println(" C                                 C C M M M");
                }else if(m == 3 && c == 1){
                    System.out.println(" C C                                 C M M M");
                }else if(m == 2 && c == 2){
                    System.out.println(" M C                                 C C M M");
                }else if(m == 0 && c == 3){
                    System.out.println(" M M M                                 C C C");
                }else if(m == 0 && c == 2){
                    System.out.println(" M M M C                                C C ");
                }
                System.out.println("                          B____");
                System.out.println();
                if(m - 2 >= c || m - 2 == 0){
                    mAndC(m - 2, c, false);
                }else{
                    mAndC(m, c - 2, false);
                }

            }else if (b == false){
                if(m == 3 && c == 1){
                    System.out.println(" C C                                 C M M M");
                }else if(m == 3 && c == 0){
                    System.out.println(" C C C                                     M M M");
                }else if(m == 1 && c == 1){
                    System.out.println(" M M C C                                 C M");
                }else if(m == 0 && c == 2){
                    System.out.println(" M M M C                                 C C");
                }else if(m == 0 && c == 1){
                    System.out.println(" M M M C C                                 C");
                }
                System.out.println("            ____B");
                System.out.println();
                if(m >= c + 1 || m == 0){
                    mAndC(m, c + 1, true);
                }else if(m <= c + 1 && m != 1){
                    mAndC(m +1 , c, true);
                }else{
                    mAndC(m + 1, c + 1, true);
                }

            }
        }
        public static int fibonacci(int n) {
            if (n <= 2) {
                return 1;
            } else {
                return fibonacci(n, 3, 1, 1);
            }
        }

        private static int fibonacci(int n, int i, int prev, int curr) {
            if (n == i) {
                return prev + curr;
            } else {
                return fibonacci(n, i + 1, curr, prev + curr);
            }
        }

        public static int factorial(int n){
            if(n == 1){
                return n;
            }
            return n * factorial(n-1);
        }

        public static int digitMatch(int x, int y) {
            if(x == 0 || y == 0){
                return 0;
            }else if (x < 10 || y < 10){
                if(x % 10 == y % 10){
                    return 1;
                }else{
                    return 0;
                }
            }else if(x % 10 != y % 10){
                return digitMatch(x / 10, y / 10);
            }else{
                return 1 + digitMatch(x / 10, y / 10);
            }
        }

        public static double sumTo(double num) {
            if(num == 1/num){
                return num;
            }else{
                return 1 / num + (1 / sumTo(num - 1));
            }
        }

        public static int multiplyEvens(int num) {
            if(num == 1){
                return num * 2;
            }else{
                return (num * 2) * multiplyEvens(num - 1);
            }
        }
        public static void writeSquares(int num) {
            if(num == 1) {
                System.out.print(1);
                return;
            }
            if (num % 2 == 0) {
                writeSquares(num - 1);
                System.out.print(", " + num * num);
            } else {
                System.out.print( num * num + ", ");
                writeSquares(num - 1);
            }
        }
        public static void writeNums(int num) {
            if(num < 2){
                System.out.print(num + ", ");
            }else{
                writeNums(num - 1);
                System.out.print(num + ", ");
            }

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



























