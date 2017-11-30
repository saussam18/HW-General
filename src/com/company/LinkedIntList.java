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

    public void set (int index, int value){
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = value;
    }
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












}
