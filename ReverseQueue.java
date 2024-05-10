import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ReverseQueue{
    static void reverse(Queue<Integer> q){
       Stack<Integer> st=new Stack<>();
       while(q.size()>0){
          st.push(q.remove()); 
       }
       while(st.size()>0){
        q.add(st.pop());
       }
      
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        reverse(q);
        System.out.println(q);

    }
}