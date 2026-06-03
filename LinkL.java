import java.util.*;

public class LinkL {
    private int i ;
    private LinkL next ;

    public LinkL(){}
    public LinkL(int i){
        this.i = i;
    }

    public static void printMain(LinkL head){
        if(head == null){
        return;
        }
        
        while(head != null){
        System.out.print(head.getI()+" ----->");
        head = head.getNext();
        }
    }

    public int getI() {
        return i;
    }public void setI(int i) {
        this.i = i;
    }

    public LinkL getNext() {
        return next;
    }public void setNext(LinkL next) {
        this.next = next;
    }

}
