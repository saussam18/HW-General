package com.company;

public class Main {

    public static void main(String[] args) {
        //Pg 999
        /*
        Problem 32: Iterators are useful with linked lists since it is inefficient to go through a linked list by calling get for each index. Iterators just remembers the position with next

        Problem 33: The linked list iterator keeps a reference to its current node and a boolean for whether it is safe to remove an element. It knows there are more due to the next reference in current
         */
        //Exercises
        //Problem 1
        LinkedIntList list = new LinkedIntList();
        list.set(0, 5);
        //Problem 2
        int x = list.min();
        //Problem 3
        Boolean b = list.isSorted();
        //Problem 4
        int y = list.lastIndexOf(5);
        //Problem 5
        int z = list.countDuplicates();





    }

}
