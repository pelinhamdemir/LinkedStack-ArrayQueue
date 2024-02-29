
public class LinkedStack
{
    Node first;
    int count;
    public LinkedStack() {
        first = null;
        count = 0;
    }

    public boolean isEmpty()
    { return first == null; }

    public char pop()
    {
        char data = first.getData();
        first = first.getNext();
        --count;
        return data;
    }
    public void push(char data)
    {
        Node temp = first;
        first = new Node();
        first.setData(data);
        first.setNext(temp);
        ++count;
    }
}

