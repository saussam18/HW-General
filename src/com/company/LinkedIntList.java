package com.company;

public class LinkedIntList {

    private ListNode front;

    public LinkedIntList() {
        front = null;
    }

    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while(current.next != null){
                current = current.next;
            }
            current.data = value;
        }

    }
    //Problem 1
    public void set (int index, int value){
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = value;
    }
    //Problem 2
    public int min (){
        if(front == null){
            throw new IllegalStateException();
        }else {
            ListNode current = front;
            int min = current.data;
            while (current.next != null) {
                int x = current.data;
                if (x < min) {
                    min = x;
                }
                current = current.next;
            }
            return min;
        }
    }
    //Problem 3
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
    //Problem 4
    public int lastIndexOf (int value){
        ListNode current = front;
        int check = -1;
        while(current.next != null){
            int count = 0;
            int x = current.data;
            if(x == value){
                check = count + 1;
            }
            current = current.next;
        }
        return check;
    }
    // Problem 5
    public int countDuplicates (){
        ListNode current = front;
        int count = 0;
        while(current.next != null){
            int x = current.data;
            int y = current.next.data;
            if(y == x){
                count ++;
            }
            current = current.next;
        }
        return count;
    }
}
