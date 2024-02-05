package Circularqueue;

import Queue.queueexception;

public class Circularqueue {
    int[] data;
    private static final int Default_size=10;
    int start=0,end=0,size=0;
    public Circularqueue(){
        this(Default_size);
    }

    public Circularqueue(int size){
        this.data=new int[size];
    }

    boolean add(int item) throws queueexception{
        
        if(isFull()){
            throw new queueexception("Queue is Full");
        }

        data[end%(data.length)]=item;
        end++;
        size++;
        return true;
        
    }
    boolean isFull(){
        return size==data.length;
    }
    boolean isEmpty() {
        return size==0;
    }
    int remove() throws queueexception{
        if(isEmpty()){
            throw new queueexception("Cannot delete items from empty queue");
        }
        int delitems=data[start++];
        start=start%(data.length);
        
        size--;
        return delitems;
    }

    void display(){
        int temp=start;
        for(int i=0;i<size;i++){
            System.out.print(data[temp%(data.length)]+"<-");
            temp++;
        }
        System.out.println("END");
    }
}

//Display Another Logic
// int i=start;
//         do{
//             System.out.print(data[i]+"->");
//             i++;
//             i=i%data.length;
//         }while(i!=end);
//         System.out.println("END");
