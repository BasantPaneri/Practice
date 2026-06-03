public class Node {
    Node next;
    Node prev;
    int value;
    
    Node(){}
    public Node(int value , Node prev , Node next){
    this.value = value;
    this.prev = prev;
    this.next = next;

    
  }
}
