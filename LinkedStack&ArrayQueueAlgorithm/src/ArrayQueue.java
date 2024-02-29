
public class ArrayQueue {

    private char[] array;
    private int size;
    private int index=0;
    private int first=0;

    public ArrayQueue(int capacity){
        array=new char[capacity];
        size=capacity;
    }
    public void enqueue(char a){
        array[index]=a;
        index++;   }

    public char dequeue(){
        char temp;
        temp= array[first];
        first++;
        return  temp;
    }


}

