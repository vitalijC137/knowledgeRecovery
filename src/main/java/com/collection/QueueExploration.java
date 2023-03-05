package com.collection;

import java.util.PriorityQueue;

public class QueueExploration {
    public void priorityQueueMaster() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(3);
        for (int i : priorityQueue) {
            System.out.println(i);
        }

        System.out.println("");

        PriorityQueue<String>priorityQueue1 = new PriorityQueue<String>();
        priorityQueue1.add("b");
        priorityQueue1.add("a");
        priorityQueue1.add("c");
        for (String s : priorityQueue1) {
            System.out.println(s);
        }

        System.out.println("");

        System.out.println("upper element in priorityQueue is:" + priorityQueue.peek());
        System.out.println("upper element in priorityQueue is:" + priorityQueue.element());
        System.out.println("the size of priorityQueue is:" + priorityQueue.size());
        priorityQueue.remove();
        System.out.println("the size of priorityQueue is:" + priorityQueue.size());
        priorityQueue.poll();
        System.out.println("the size of priorityQueue is:" + priorityQueue.size());

        System.out.println("");

        System.out.println("the size of priorityQueue1 is:" + priorityQueue1.size());
        System.out.println("upper element in priorityQueue1 is:" + priorityQueue1.peek());
        priorityQueue1.remove("a");
        System.out.println("upper element in priorityQueue1 is:" + priorityQueue1.peek());
        System.out.println("the size of priorityQueue1 is:" + priorityQueue1.size());
        System.out.println("");
        priorityQueue1.offer("h");
        System.out.println("the size of priorityQueue1 is:" + priorityQueue1.size());
        for (String s : priorityQueue1) {
            System.out.println(s);
        }
    }
}
