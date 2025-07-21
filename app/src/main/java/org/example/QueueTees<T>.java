package example.org;

public class QueueTees<T> {
    private final int MAX_SIZE = 10;
    private Object[] queue;
    private int front;
    private int rear;
    private int count;

    public QueueTees() {
        queue = new Object[MAX_SIZE];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(T item) {
        if (count == MAX_SIZE) {
            System.out.println("Queue is full. Cannot enqueue: " + item.toString());
            return;
        }
        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = item;
        count++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty. Nothing to dequeue.");
            return null;
        }
        T item = (T) queue[front];
        front = (front + 1) % MAX_SIZE;
        count--;
        return item;
    }

    public int size() {
        return count;
    }

    public void clear() {
        front = 0;
        rear = -1;
        count = 0;
    }
}
