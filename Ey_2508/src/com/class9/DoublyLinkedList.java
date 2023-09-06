package com.class9;

public class DoublyLinkedList {

	class Node {

		int data;

		Node previous;

		Node next;

		public Node(int data) {

			this.data = data;

		}

	}

	Node head, tail = null;

	public void addItem(int data) {

		Node newNode = new Node(data);

		if (head == null) {

			head = tail;

			head.previous = null;

			tail.next = null;

		} else {

			tail.next = newNode;

			newNode.previous = tail;

			tail = newNode;

			tail.next = null;

		}

	}

	public void disply() {

            Node current = head;

            if(head == null) {

                System.out.println("List is empty");

                return;

            }

            System.out.println("Nodes of doubly linked list : ");

            while(current != null) {

                System.out.println(current.data + " ");

                current = current.next;

            }

        

    }

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		DoublyLinkedList obj = new DoublyLinkedList();

		obj.addItem(10);

		obj.addItem(15);

		obj.addItem(20);

		obj.addItem(25);

		obj.addItem(30);

		obj.disply();

	}

}