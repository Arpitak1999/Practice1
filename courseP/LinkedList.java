public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }

        //create newNode next = head
        newNode.next= head;

        //newNode = head
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;


    }
    public void print(){
        Node temp =head;
        if (head == null){
            System.out.println("Linked list is empty");
            return;
        }
        while (temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //for list have 3 node
    public void addMiddle(int data){
        Node n = new Node(data);
        head.next = n;
        n.next = tail;
    }
    public void add(int index,int data){
        if(index == 0){
            addFirst(data);
            return;
        }

        Node n = new Node(data);
        size++;
        Node tmp = head;
        int i =0;
        while( i < index -1){
            tmp = tmp.next;
            i++;
        }
        n.next = tmp.next;
        tmp.next= n;
    }
    public int removeFirst(){
        if (size == 0){
            System.out.println("empty");
            return Integer.MAX_VALUE;
        }else if (size ==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    public int removeLast(){
        if(size == 0){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val =head.data;
            head = tail = null;
            size =0;
            return val;
        }
        Node prev = head;
        for(int i = 0 ;i <size-2; i++){
            prev =prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail= prev;
        size--;
        return val;
    }

    public static boolean detectCycle(){//floyd's cycle finding algorithm
        Node slow= head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow= head;
        Node fast = head;
        boolean isCycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        if(isCycle == false){
            return;
        }
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

    }
    public static void main(String[] args) {
//       LinkedList ll = new LinkedList();
//
//       ll.addFirst(1);
//       ll.addFirst(2);
//       ll.addLast(4);
//       ll.addLast(5);
//
//       //ll.addMiddle(88);
//        ll.add(2,88);
//        ll.print();
//        ll.removeFirst();
//
//        ll.print();
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.size);
        head = new Node(1);
        Node temp = new Node(2);
        head.next= temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(detectCycle());
        removeCycle();
        System.out.println(detectCycle());
    }
}
