package src.linked_list.circularSinglyLinkedList;

import src.linked_list.singly.ListNode;

/**
 * @author giraykaleli
 * @return the loop consists of the singly linked list
 */

public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private class ListNode{

        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        this.last = null;
        this.length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularSinglyLinkedList(){

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(7);
        ListNode fifth = new ListNode(9);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;

        last = fifth;

    }
    

    public static void main(String[] args) {

        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        csll.createCircularSinglyLinkedList();


    }













}