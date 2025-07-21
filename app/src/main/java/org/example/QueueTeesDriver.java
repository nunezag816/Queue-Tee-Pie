package org.example;

public class Main {
    public static void main(String[] args) {
        QueueTees queue = new QueueTees();

        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();

        System.out.println("Initial size: " + queue.size());

        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);

        System.out.println("Size after enqueue: " + queue.size());

        Cutie first = queue.dequeue();
        System.out.println("Dequeued: " + (first != null ? first.description() : "null"));

        Cutie second = queue.dequeue();
        System.out.println("Dequeued: " + (second != null ? second.description() : "null"));

        Cutie third = queue.dequeue();
        System.out.println("Dequeued: " + (third != null ? third.description() : "null"));

        System.out.println("Size after dequeue: " + queue.size());
    }
}
