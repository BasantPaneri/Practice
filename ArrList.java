import java.util.*;

public class ArrList {
    public static void main(String[] args) {
        int arr[] = new int[6];
        for (int i = 0 ; i<arr.length ; i++){
            arr[i] = i+1 ;
            System.out.print(arr[i] + " , ");
        }System.out.println("");

        ArrayList<Integer> obj = new ArrayList<>();
        for (int i = 0 ; i<arr.length ; i++){
            obj.add(arr[i]); 
        }
        
        // LinkL Linkobj = new LinkL();
        for (int i = 0 ; i < obj.size() ; i++){
            LinkL Linkobj = new LinkL(obj.get(i));          
        }

        
        LinkL obj1 = new LinkL(1); 
        LinkL obj2 = new LinkL(2); 
        LinkL obj3 = new LinkL(3); 
        LinkL obj4 = new LinkL(4); 
        LinkL obj5 = new LinkL(5); 
        LinkL obj6 = new LinkL(6); 

        obj1.setNext(obj2);
        obj2.setNext(obj3);
        obj3.setNext(obj4);
        obj4.setNext(obj5);
        obj5.setNext(obj6);


        LinkL.printMain(obj1);
        System.out.println("");
    }
}
