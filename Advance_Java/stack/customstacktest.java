package stack;

public class customstacktest {
    public static void main(String[] args) throws stackexception {
        // customstack stack=new customstack(5);
        // stack.push(5);
        // stack.push(6);
        // stack.push(7);
        // stack.push(8);
        // stack.push(9);
        // stack.print();
        // System.out.println(stack.peak());
        
        // System.out.println(stack.pop());

        // System.out.println(stack.peak());

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // stack.print();

        Dynamicstack stack=new Dynamicstack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(10);
        stack.print();
        
    }    
}
