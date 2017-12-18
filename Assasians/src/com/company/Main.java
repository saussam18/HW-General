package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    KillRing game = new KillRing();
    game.add("Sam");
    game.add("Ginsu");
    game.add("Connor");
    game.add("Jojo");
    game.add("Cara");
    Scanner scan = new Scanner(System.in);
    boolean b = false;
    game.printList();
        System.out.println();
        String s = "";
    while( b == false){
        System.out.println("Print a name to kill");
        s = scan.nextLine();
       game.kill(s);
        game.printList();
        System.out.println();
        game.printGraves();
        System.out.println();
        b = game.checkWinner();
    }
        System.out.println();
        System.out.println();
        System.out.println("Game is over the Winner is: ");
        game.printList();





    }
}
