package com.company;

import java.util.ArrayList;

public class KillRing {

        private ListNode front;

        private ArrayList<String> graves = new ArrayList<String>();

        public void add(String value){
            if(front == null){
                front = new ListNode(value);
            }else{
                ListNode current = front;
                while(current.next != null){
                    current = current.next;
                }
                current.next = new ListNode(value);
            }
        }

        public boolean checkWinner(){
            if (front.next.next == null){
                return true;
            }else{
                return false;
            }
        }

    public void kill(String s){
        if(front.data.equalsIgnoreCase(s)){
            graves.add(front.data);
            front = front.next;
        }else{
            ListNode current = front;
            while(current.next != null){
                if(current.next.data.equalsIgnoreCase(s)){
                    graves.add(current.next.data);
                    current.next = current.next.next;
                    break;
                }else{
                    current = current.next;
                }
            }
        }

    }

    public void printList(){
        if(front == null){
            System.out.println("Error");
        }else{
            ListNode current = front;
            while(current.next != null){
                System.out.print(current.data + "  ");
                current = current.next;
            }
        }
    }


    public void printGraves(){
        System.out.println();
        System.out.println("Graveyard");
        for(int i = 0 ; i < graves.size(); i++){
            System.out.print(graves.get(i) + "  ");
        }
    }

}
