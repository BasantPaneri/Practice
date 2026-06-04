class DLL{
    private Node head ;
    private Node tail ;
    DLL(){ this.head = null; this.tail = null;}

    public void add(int value) {
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
        Node temp = this.head;
        while(temp != null){
            str += temp.value +", ";
            temp = temp.next;
        }
        return str;
    }

    public void addQuantity(int i) {
        if (i <= 0) return;

        for (int j = 1; j <= i; j++) {
            Node temp = new Node(j, null, null);
            if(this.head == null && tail == null){
                this.head = this.tail = temp ;
            } else {
                this.tail.next = temp;
                temp.prev = this.tail;
                this.tail = this.tail.next;
            }
        }
    }

    public String printReverse() {
        if (tail == null || head == null) return "";
        Node temp = this.tail;
        String str = "";
        while (temp != null) {
            str += temp.value + ", ";
            temp = temp.prev;
        }
        return str;
    }

    public void addAtPosition(int value, int pos) {
        if (pos == 1) {
            addAtFirst(value);
            return;
        }
        Node temp = this.head;
        int count = 1;

        while( temp != null && count != pos ){
            temp = temp.next;
            count++;
        }

        if(temp == null ) return;

        Node n = new Node(value, temp.prev, temp);
        temp.prev.next = n;
        temp.prev = n;
    }

    public void deleteFirst() {
        if(this.head == null){
            return;
        }
        if(this.head.next == null) {
            this.tail = null;
            return;
        }
        this.head = this.head.next;
        this.head.prev = null;
    }

    public void deleteLast() {
        if (this.head == null){
            return;
        }
        if (head.next == null){
            this.tail = null;
            this.head = null;
            return; 
        }

        this.tail = this.tail.prev;
        this.tail.next = null;
    }

    public void deleteAtPosition(int position) {
        if (this.head == null) {
            return;
        }
        if (position == 0) {
            deleteFirst();
        }
        Node temp = this.head;
        int count = 1;
        while (temp != null && count < position) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        if (temp.next == null) {
            this.tail = temp.prev;
            temp.prev.next = null;
            return ;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        return ;
    }

    public int size(){
        Node temp = this.head;
        int count = 0 ;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}