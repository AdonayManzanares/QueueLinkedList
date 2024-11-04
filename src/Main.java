//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QueueStack qu = new QueueStack();
        System.out.println(qu.length());
        qu.enQueue(5);
        System.out.println(qu.length());
        qu.enQueue(10);
        System.out.println(qu.length());
        qu.deQueue();
        System.out.println(qu.length());
        qu.deQueue();
        System.out.println(qu.length());
    }
}