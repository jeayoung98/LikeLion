package ch04;

public class MyQueue {
    private int[] queueArray; // 저장할 배열
    private int queueCapacity; // 최대 크기
    private int front = 0; // 첫번째 인덱스
    private int top = 0; // 현재 인덱스

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(3);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.deQueue();
        myQueue.enQueue(4);
        myQueue.enQueue(5);
        myQueue.peek();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();

    }
    public MyQueue(int QueueCapacity) {
        this.queueArray = new int[QueueCapacity];
        this.queueCapacity = QueueCapacity;
    }

    public void enQueue(int item) {
        if (isFull()) {
            System.out.println("배열이 가득 찼습니다");
        }else{
            queueArray[top++] = item;
            System.out.println("입력한 값:" + item);
        }
    }
    public void deQueue() {
        if (isEmpty()){
            System.out.println("배열이 비어있습니다");
        }else {
            System.out.println("꺼낸 값: " + queueArray[front++]);
        }
    }
    public void peek() {
        if (isEmpty()){
            System.out.println("배열이 비어있습니다.");
        }else {
            System.out.println("현재 꺼낼 수 있는 값: " + queueArray[front]);
        }
    }
    public boolean isFull() {
        return top >= queueCapacity;
    }


    public boolean isEmpty() {
        return front >= top;
    }



}



