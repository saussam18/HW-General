package com.company;

public class Main {

    public static void main(String[] args) {
        //Pg 999
        /*
        Problem 32:

        Problem 33:

         */
        //Exercises
        /*
        Problem 1:
            public void set (int index, int value){
                ListNode current = front;
                for (int i = 0; i < index; i++) {
                current = current.next;
                }
                current.data = value;

            }
         Problem 2:
            public int min (){
              ListNode current = front;
              int min = current.data;
              while(current.next != null){
                   int x = current.data;
                   if(x < min){
                        min = x;
                   }
                   current = current.next;
              }
              return min;
            }
          Problem 3:
           public boolean isSorted (){
            ListNode current = front;
            boolean b = true;
            while(current.next != null){
                int x = current.data;
                int y = current.next.data;
                    if(x > y){
                    b = false;
                    }
                current = current.next;
            }
            return b;
           }
                     */




    }

}
