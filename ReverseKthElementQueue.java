import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKthElementQueue {
    static void reverseKth(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        int k=3;
        while(q.size()>=k){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=0;i<q.size()-k;i++){
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        reverseKth(q);
        System.out.println(q);

    }
}
