package stack;
public class Dynamicstack extends customstack{
    
    public Dynamicstack(){
        super();
    }
    public Dynamicstack(int size){
        super(size);
    }
    
    @Override
    public boolean push(int item) throws stackexception{
        //This will take care of the size
        if(isFull()){
            //Doubling the size if stack is full
            int[] temp=new int[data.length * 2];
            for(int i=0;i<data.length;i++)
                temp[i]=data[i];
            data=temp;
        }
        return super.push(item);
    }
}
