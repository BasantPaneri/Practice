public class DoubleLinkL {
    Node tail ; 
    Node head ;

    void add(int value) {
        Node n = new Node(value,null,null);
        if (head == null) { 
            head = tail = n;
            return; 
        }
        tail.next = n;
        n.prev = tail;
        tail = tail.next;
    }

    public Node addAtFirst(int value,Node head){
        Node n = new Node(value, null ,null);
        if (head == null) {
            head = tail = n;
            return head;
        }
        
        n.next = head;
        head.prev = n;
        head = n;
        
        // System.out.println("log.info----------->head"+head + head.next );
        return head;
    } 

    public Node addQuantity(int i) {
        if (i <= 0) return null;
        
        Node head = new Node(1, null, null);
        this.tail = head;
        for (int j = 2; j <= i; j++) {
            Node n = new Node(j, null, null);
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
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

    public String printReverse(Node head) {
            if (tail == null || head == null) return "";
            Node temp = tail;
            String str = "";
            while (temp != null) {
                str += temp.value + ", ";
                temp = temp.prev;
            }
            return str;
        }

    public Node addAtPosition(int value, int pos, Node head) {
        if (pos == 0) {
            addAtFirst(value, head);
            return head;
        }
        Node temp = head;
        int count = 0;
        while (temp !=null && count< pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            // System.out.println("Invalid position");
            return head;
        }
        Node n = new Node(value, temp, temp.next);
        if (temp.next != null){
            temp.next.prev = n;
        }else tail = n;
        temp.next = n;
        return head;
    }

    public Node deleteFirst(Node head) {
        if(head == null){
            return null;
        }
        if(head.next == null) {
            tail = null;
            return null;
        }
        head = head.next;
        head.prev = null;
        return head;
    }

    public Node deleteLast(Node head) {
        if (head == null){
            return null;
        }
        if (head.next == null){
            tail = null;
            return null;
        }
        Node temp= head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next=null;
        tail =temp.prev;
        return head;
    }

    public Node deleteAtPosition(int position, Node head) {
        if (head == null) {
            return null;
        }
        if (position == 0) {
            return deleteFirst(head);
        }
        Node temp = head;
        int count = 0;
        while (temp != null && count < position) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Invalid Position");
            return head;
        }
        if (temp.next == null) {
            tail = temp.prev;
            temp.prev.next = null;
            return head;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        return head;
    }

}
