package Queue;

public class customqueue {
    int[] data;
    private static final int Default_size=10;
    int ptr=0;
    public customqueue(){
        this(Default_size);
    }

    public customqueue(int size){
        this.data=new int[size];
    }

    boolean isFull(){
        return ptr==data.length;
    }
    boolean isEmpty(){
        return ptr==0;
    }

    boolean add(int item) throws queueexception{
        if(isFull())
            throw new queueexception("Queue is Full");
        data[ptr++]=item;
        return true;
    }

    int remove() throws queueexception{
        if(isEmpty()){
            throw new queueexception("Can't remove item from empty stack");
        }
        int temp=data[0];
        for(int i=0;i<data.length-1;i++){
            data[i]=data[i+1];
        }

        return temp;
    }

    int peek() throws queueexception{
        if(isEmpty()){
            throw new queueexception("Can't Access Elements from the empty queue");
        }

        return data[0] ;
    }
}
