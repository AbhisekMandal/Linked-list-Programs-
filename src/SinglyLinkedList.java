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

}
