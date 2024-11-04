public class QueueStack {
    private Node head;
    public QueueStack(){
        head = null;
    }

    public boolean isEmpty(){
        return(head == null);
    }

    public boolean enQueue(int value){
        if(isEmpty())
        {
            head = new Node(value);
            return true;
        }
        else
        {
            Node current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = new Node(value);
            return true;
        }
        //return false;
    }

    public boolean deQueue(){
        if(!isEmpty())
        {
            head = head.next;
            return true;
        }
        return false;
    }

    public int length(){
        int count = 0;
        if(isEmpty())
        {
            return count;
        }
        else
        {
            count = 1;
            Node current = head;
            while(current.next != null)
            {
                count++;
                current = current.next;
            }
        }
        return count;
    }



}
