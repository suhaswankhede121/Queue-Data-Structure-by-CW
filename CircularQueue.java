class CQ{
    int []arr=new int[50];
    int r=-1;
    int f=-1;
    int size=0;
    int n=arr.length;
     
    void add(int val) throws Exception{
        if(size==n){
           throw
            new Exception("Here is full Queue");
        }
        if(size==0){
          f=r=0;
           arr[r]=val;
        }
        if(r<n-1){  //normal case
         arr[r]=val;
         r++;
        }
        if(r==n-1){
            r=0;
            arr[0]=val;
        }
        size++;
    }

    int remove(){
        if(size==0){
            System.out.println("Empty");
            return -1;
        }
        else{
           int val=arr[f];
           if(f==n-1) f=0;
           else f++;
           size--;
           return val; 
        }
    }

    int peek(){
         if(size==0){
            System.out.println("Empty");
            return -1;
        }
        return arr[f];
    }

    boolean isEmpty(){
        if(size==0) return true;

        return false;
    }

    void display(){
         if(size==0){
            System.out.println("Empty");
        }else if(f<=r){
          for(int i=f;i<r;i++){
            System.out.println(" "+arr[i]);
          }
        }else{
            for(int i=f;i<arr.length;i++){
                System.out.print(" "+arr[i]);
            }
            for(int i=0;i<=r;i++){
                System.out.print(" "+arr[i]);
            }
        }
        System.out.println();
    }
}

public class CircularQueue {
    public static void main(String[] args) throws Exception{
        CQ list=new CQ();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
        list.remove();
        list.display();
        System.out.println(list.peek());

    }
}
