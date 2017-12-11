package com.company;

public class Lists {
    //Pg 997 5-17
    /*

    Problem 5:
                   +----+----+    +----+----+
        list ----> |  1 |  +----> |  3 |  / |
                   +----+----+    +----+----+

    Problem 6:
                   +----+----+    +----+----+    +----+----+
        list ----> |  1 |  +----> |  3 |  +----> |  2 |  / |
                   +----+----+    +----+----+    +----+----+

    Problem 7:
                   +----+----+    +----+----+
        list ----> |  4 |  +----> |  3 |  / |
                   +----+----+    +----+----+

    Problem 8:
                   +----+----+    +----+----+
        list ----> |  1 |  +----> |  2 |  / |
                   +----+----+    +----+----+

    Problem 9:
    list.next.next = mew ListBode (3, null);

    Problem 10:
    list = new ListNode(3, list);

    Problem 11:
    temp..next.next = list.next;
    list.next = temp;

    Problem 12:
    ListNode list2 = list;
    list = list.next;
    list2.next = list2.next.next;
    list.next = null;

    Problem 13:
    ListNode temp = list;
    list = list.next;
    temp.next = list.next;
    list.next = temp;

    Problem 14:
    ListNode temp = list.next.next;
    temp.next = list.next;
    list.next.next = list;
    list.next.next.next = null;
    list = temp;

    Problem 15:
    list.next.next.next = temp;
    temp.next.next = list.next.next;
    list.next.next = null;
    ListNode temp1 = temp.next;
    temp.next = list.next;
    list = temp1;

    Problem 16:
    list2.next.next.next = list;
    list.next = list2;
    list = list2.next.next;
    list2 = list2.next;
    list2.next = null;
    list.next.next.next = null;

    Problem 17:
    ListNode list2 = list.next.next;
    list.next.next.next.next = list.next;
    ListNode temp = list;
    list = list.next.next.next;
    list2.next = temp;
    list.next.next = null;
    list2.next.next = null;

     */
        //Pg 18 -30
    /*

    Problem 18: 2 ways to change an object are to change the front or data/next field in the node

    Problem 19: Inserting and removing is the hardest at the end, since the list has to loop through all the references to get to where it needs to be

    Problem 20: The loop should stop and index i - 1 before the one add or remove so you can adjust the preceding nodes reference

    Problem 21: Resizing is not necessary, since more nodes can me made. The only limit put is on the memory for java

    Problem 22:
        ListNode current = list;
        while (current != null) {
        current.data = 42;
        current = current.next;
        }

    Problem 23:
        ListNode current = list;
        while (current.next != null) {
        current = current.next;
        }
        current.data = 42;

    Problem 24:
        ListNode current = list;
        while (current.next != null) {
        current = current.next;
        }
        current.next = new ListNode(42);

    Problem 25:
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

    public int max() {
    if (front == null) {
        throw new IllegalStateException();
    } else {
        ListNode current = front;
        int max = front.data;
        while (current != null) {
            max = Math.max(max, current.data);
            current = current.next;
        }
        return max;
    }
}

    Problem 26: the 4 cases are : middle, insert in  back, insert in front, and empty

    Problem 27: The inch worm approach is when an algorithm keeps track of linked node references, one for the previous node and one for the current node. They are moved forward together until the position is reached.
    At that point the previous references is modified as appropriate. An advantages is that you dont need to write a long complex chain

    Problem 28:
    public int sum() {
    ListNode current = front;
    int sum = 0;
    while (current != null) {
        sum += current.data;
        current = current.next;
    }
    return total;
}

    public double average() {
        if (front == null) {
            return 0;
        } else {
            ListNode current = front;
            int sum = 0;
            int count = 0;
            while (current != null) {
                sum += current.data;
                current = current.next;
                count++;
            }
            return (double) total / count;
        }
    }
    Problem 29: The main advantage of an intlist interface is the client code can take advantage of the polymorphismm.
    Problem 30:
    public void firstLast(IntList list) {
    if (!list.isEmpty()) {
        int x = list.get(0);
        list.remove(0);
        list.add(x);
    }
}


     */



}
