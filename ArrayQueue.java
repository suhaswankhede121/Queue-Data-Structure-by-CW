
class QueueA{
    int []arr=new int[20];
    int f=-1;
    int r=-1;
    int size=0;

    void add(int val){
        if(f==-1){
            f=r=0;
            arr[0]=val;
        }
        arr[r]=val;
        r++;
        size++;
    }

    int remove(){
        if(size==0){
            System.out.println("Queue Already Empty");
        }
        f++;
        size--;
        return arr[f-1];
        
    }
    
    int peek(){
         if(size==0){
            System.out.println("Queue Already Empty cant not peek");
        }
        return arr[f];
    }

    boolean isEmpty(){
        if(size==0) return true;

        return false;
    }
    void display(){
        for(int i=0;i<r;i++){
            System.out.print(" "+arr[i]);
        }
    }

}

class ArrayQueue{
    public static void main(String[] args) {
        QueueA q=new QueueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.display();
        //q.remove();
       System.out.println(q.peek());
       System.out.println(q.size);
       System.out.println(q.isEmpty());


    }
}