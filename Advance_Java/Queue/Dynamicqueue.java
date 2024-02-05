package Queue;

public class Dynamicqueue extends customqueue {

    public Dynamicqueue(){
        super();
    }
    
    public Dynamicqueue(int size){
        super(size);
    }

    @Override
    boolean add(int items) throws queueexception{
        //Handling if data is full
        if(isFull()){
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }

        return super.add(items);
    }

}
