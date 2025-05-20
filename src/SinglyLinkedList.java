class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;

    }
}


public class SinglyLinkedList {
    Node head;

    //add node at end
    public void insert(int data){
        Node node =  new Node(data);
        if(head==null){
            head=node;
        }else{
            Node temp = head;
            while (temp.next != null){
               temp = temp.next;
            }
            temp.next= node;
        }
    }

    //Display nodes
    public void display(){
        Node temp = head;
        if (head == null){
            System.out.println("There is no data empty list");
        }
        System.out.println("Singly Linked-list");
        while (temp != null){
            System.out.println(temp.data+" ->");
            temp=temp.next;

        }
        System.out.println("null");
    }
    public void delete(int value){
        if (head==null){
            System.out.println("Empty list");
            return;
        }
        if (head.data == value){
            head = head.next;
            System.out.println("Deleted value: "+value);
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data !=  value){
            temp= temp.next;
        }
        if (temp.next == null){
            System.out.println("value not found: "+ value);
        }else{
            temp.next = temp.next.next;
            System.out.println("Deleted value: "+value);
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList li = new SinglyLinkedList();
        li.insert(10);
        li.insert(20);
        li.insert(30);
        li.insert(40);
        li.insert(50);
        li.insert(60);
    }

}
