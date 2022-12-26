public class queue1 {
        int capacity = 10;
        int arr[] = null;
        int front = 0;
        int rear = -1;

        public queue1() {
            this.arr = new int[capacity];
        }

        public queue1(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
        }

        public void enqueue(int data) {
            if(isFull()) {
                System.err.println("Queue is full can't insert");
                return;
            }
            arr[++rear] = data;
            System.out.println(data+ " equeued into Queue");
        }

        public void dequeue() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            int data = arr[front];
            for(int i=front;i<rear;i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            System.out.println(data+ " dequeued from Queue");
        }

        public int rear() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return Integer.MIN_VALUE;
            }
            return arr[rear];
        }

        public int queueFront() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return Integer.MIN_VALUE;
            }
            return arr[front];
        }

        public boolean isFull() {
            return size() == capacity;
        }

        public boolean isEmpty() {
            return size() == front;
        }
        public int size() {
            return rear+1;
        }

        public static void main(String[] args) {
            queue1 q = new queue1();
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);
            q.enqueue(5);
            System.out.println("After inserting data's");
            System.out.println("Rear Item is :" + q.rear());
            q.dequeue();
            q.enqueue(6);
            System.out.println("After inserting 60 into Queue");
            System.out.println("Rear Item is :" + q.rear());
            q.dequeue();
            q.dequeue();
            q.dequeue();
            q.dequeue();
            q.dequeue();
            System.out.println("queue is empty?" + q.isEmpty());
            System.out.println("Front Item is :" + q.queueFront());
            System.out.println("size of the" +"queue array"+q.size());
        }

    }
