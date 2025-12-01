package com.home.leetcode.set1;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LeetCode2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode cur = temp;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int v1 = (l1 == null ? 0 : l1.val);
            int v2 = (l2 == null ? 0 : l2.val);

            int sum = v1 + v2 + carry;
            carry = sum / 10;

            cur.next = new ListNode(sum % 10);
            cur = cur.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return temp.next;
    }

    // Utility method to print linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        // Represents numbers: 342 + 465 = 807

        ListNode l1 = new ListNode(2,
                        new ListNode(4,
                        new ListNode(3)));

        ListNode l2 = new ListNode(5,
                        new ListNode(6,
                        new ListNode(4)));

        System.out.print("Input List 1: ");
        printList(l1);

        System.out.print("Input List 2: ");
        printList(l2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Output List:  ");
        printList(result);
    }
}