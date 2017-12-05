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




}
