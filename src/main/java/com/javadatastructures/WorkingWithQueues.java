package com.javadatastructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {


    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alexa", 21));
        linkedList.add(new Person("Sara", 21));
        linkedList.addFirst(new Person("Ali", 21));
        linkedList.addLast(new Person("Ahmed", 21));
        ListIterator<Person> personIterator = linkedList.listIterator();

        while(personIterator.hasNext()){
            System.out.println(personIterator.next());
        }

        while(personIterator.hasPrevious()){
            System.out.println(personIterator.previous());
        }



    }

    private static void queues(){
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Max", 28));
        supermarket.add(new Person("Mariya", 17));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll()); //retrieves and removes the element in the head of the queue
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){

    }
}
