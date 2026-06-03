class DLL{
    private Node head ;
    private Node tail ;
    DLL(){ this.head = null; this.tail = null;}

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

    public Node addAtFirst(int value){
        Node n = new Node(value, null ,null);
        if (head == null) {
            head = tail = n;
            return head;
        }
        
        n.next = head;
        head.prev = n;
        head = head.prev;
        return head;
    } 

    public String printList(){
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