package stack;

public class customstack {
    public int data[];
    private static final int Default_size = 10;
    int ptr = -1;

    // Calling Constructors
    public customstack() {
        this(Default_size);
    }

    public customstack(int size) {
        this.data = new int[size];
    }

    // Creating Push Function
    public boolean push(int item) throws stackexception {
        if (isFull()) {
            throw new stackexception("Stack is Full");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    // Creating Pop function

    int pop() throws stackexception {
        if (isEmpty()) {
            throw new stackexception("can't Pop  from empty stack");
        } else {
            int del = data[ptr];
            ptr--;
            return del;
        }
    }

    //Creating Peak Function

    int peak() throws stackexception{
        if(isEmpty())
            throw new stackexception("Can't get a data from empty stack");
        return data[ptr];

        
    }

    public boolean isFull() {
        return ptr == data.length - 1;

    }

    boolean isEmpty() {
        return ptr == -1;
    }
    void print(){
        if(ptr==-1)
            System.out.println("Stack is Empty");
        else{
            System.out.print("[");
            for(int i=ptr;i>0;i--){
                System.out.print(data[i]+",");
            }
            System.out.print(data[0]+"]");
            System.out.println();
        }
    }

}