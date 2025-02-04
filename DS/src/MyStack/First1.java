package MyStack;

import java.util.ListIterator;
import java.util.Stack;

public class First1 {
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>();
        s1.push("jack");
        s1.push("dp");
        s1.push("dk");
        s1.push("dj");
        System.out.println(s1.peek());  // top most element-->> dj
       System.out.println( s1.search("dk")); // return index 

        // Create ListIterator at the end of the stack
        ListIterator<String> itr = s1.listIterator(s1.size());

        // Iterate in reverse order
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
