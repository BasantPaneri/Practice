public class Main {
    public static void main(String[] args) {
        DoubleLinkL DoubleLL = new DoubleLinkL();
        Node head = DoubleLL.addQuantity(5);
        System.out.println(DoubleLL.printList(head));
        head = DoubleLL.addAtFirst(0,head);
        System.out.println(DoubleLL.printReverse(head));
        head = DoubleLL.addAtPosition(44, 3,head);
        System.out.println(DoubleLL.printList(head));
        head = DoubleLL.deleteLast(head);
        System.out.println(DoubleLL.printList(head));
        head = DoubleLL.deleteFirst(head);
        System.out.println(DoubleLL.printList(head));
        head = DoubleLL.deleteAtPosition(1, head);
        System.out.println(DoubleLL.printList(head));



    }
}
