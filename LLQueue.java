
class Node{
    Node next;
    int val;
    Node(int val){
        this.val=val;
    }
}

class LL{
    Node head=null;
    Node tail=null;
    int size=0;
    void add(int val){
        Node newNode=new Node(val);
        if(size==0){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
          size++;
    }

    int remove(){
        if(size==0){
            return -1;
        }else{
            int x=head.val;
            head=head.next;
             size--;
            return x;
        }
    }

    int peek(){
        if(size==0){
            return -1;
        }
        return head.val;
    }

    boolean isEmpty(){
        if(size==0) return true;

        return false;
    }

    void display(){
        Node temp=head;
        if(size==0){
            System.out.println("Elements not present");
        }
        while(temp!=null){
            System.out.println(" "+temp.val);
            temp=temp.next;
        }
    }
}


public class LLQueue {
    public static void main(String[] args) {
        LL list=new LL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
       /// list.remove();
        //System.out.println();
         //list.display();
         System.out.println(list.peek());
         System.out.println(list.size);
         System.out.println(list.isEmpty());
    }
}
