public class Node {
   Node next;
  int value ;
  Node(){}
  public Node(int value , Node next){
    this.value = value;
    this.next = next;
  }
  
  public Node addAtFirst(Node temp , Node head){
    if(head == null) return temp;
    temp.next = head;
    head = temp;
    return head;
  }
  
  // public Node(Node head){
  //   if(head == null || head.next == null) return null;
  //   // head = head.next;
  //   // return head;
  //   return head.next;
  // }
  
  public Node addAtLast(Node temp, Node head){
    
    if(head == null) return temp;
    
    Node temp2 = head;
    
    while(head != null){
      if (head.next == null){
        head.next = temp;
        break;
      }
      head = head.next;
    }
    return temp2;
  }
  
  public Node add(int n){
    Node head = null;
    Node temp = null;
    
    while (n > 0) {
      int m = n;
      if (head == null){
        head = new Node(m,null);
        temp = head;
      } 
      else {
        Node temp2 = new Node(m,null);
        temp.next = temp2;
        temp = temp.next;
      }
      n--;
    }
    return head;
    
  }
  
  public Node deleteAtFirst(Node head){
    if(head == null || head.next == null){
      return head;
    }
    head = head.next;
    return head;
  }
  
  public Node deleteAtLast(Node head){
    Node temp = head;
    if(head == null) {
      return head;
    }
    while (head != null){
      if(head.next.next == null){
        head.next = null;
      }
      head = head.next;
    }
    return temp;
  }

  public Node deleteRandom(int position,Node head) {
    if (head == null) {
        return head;
    }
    if (position == 1) {
      head = head.next;
      return head;
    }
    int count = 1;
    Node temp = head;
    while (temp != null && count < position - 1) {
      temp = temp.next;
      count++;
    }
    if (temp == null || temp.next == null) {
      return head;
    }
    temp.next = temp.next.next;
    return head;
  }
  
  public String printList(Node head){
    if (head == null){
      return "";
    }
    String str = "";
    while(head != null){
      str += head.value +", ";
      head = head.next;
    }
    return str;
  }
} 

