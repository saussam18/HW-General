package com.company;

public class ListNode {

        public String data;
        public com.company.ListNode next;

        public ListNode() {
            this("", null);
        }

        public ListNode(String data) {
            this(data, null);
        }
        public ListNode(String data, com.company.ListNode next) {
            this.data = data;
            this.next = next;
        }


    }
