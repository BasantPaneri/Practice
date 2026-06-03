public class Main {
    public static void main(String[] args) {
      // Node next;
      Node linkL = new Node();
      Node head = linkL.add(5);
      // Node head = null;
      System.out.println(linkL.printList(head));
      
      // head = linkL.addAtFirst(new Node(8,null),head);
      // System.out.print(linkL.printList(head));
      
      // head = linkL.addAtLast(new Node(10,null),head);
      // System.out.println(linkL.printList(head));
      
      // head = linkL.deleteAtFirst(head);
      // System.out.println(linkL.printList(head));
      
      // head = linkL.deleteAtLast(head);
      // System.out.println(linkL.printList(head));
      
      head = linkL.deleteRandom(6, head);
      System.out.print(linkL.printList(head));
    }
}
