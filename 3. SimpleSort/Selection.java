public class Selection{
    private Node head;

    public void add(int value) {
        Node temp = new Node(value);
        if (this.head == null) {
            this.head = temp;
        } else {
            temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
    }

    public static Node swap(Node head, Node curr_node1, Node curr_node2, Node prev_node){
        head=curr_node2;
        prev_node.setNext(curr_node1);

        Node temp = curr_node2.getNext();
        curr_node2.setNext(curr_node1.getNext());
        curr_node1.setNext(temp);

        return head;
    }

    public static Node selection(Node head){
        if(head.getNext()==null){
            return head;
        }
        Node minNode = head;
        Node prevMin = null;
        Node ptr;

        for(ptr = head; ptr.getNext()!=null; ptr = ptr.getNext()){
            if(ptr.getNext().getValue()<minNode.getValue()){
                minNode=ptr.getNext();
                prevMin=ptr;
                
            }
        }

        if (minNode != head){
            head = swap(head, head, minNode, prevMin);
            
        }
        System.out.println("");
        printList(head);
        System.out.println("");
        head.setNext(selection(head.getNext()));
        
        return head;
    }

    public static Node sort(Node head){
        if(head==null){
            return null;
        }

        head = selection(head);
        return head;
    }

    public static void printList( Node head){  
    while (head != null)  
    {  
        System.out.print( head.getValue() + " ");  
        head = head.getNext();  
    }  
}  
   
public static void main(String args[]){  
    Selection List = new Selection();  
   
    List.add(13);  
    List.add(4);  
    List.add(2);  
    List.add(7);  
    List.add(3); 
    List.add(9);
    
    System.out.println( "Linked list before sorting:");  
    printList(List.head);  
    System.out.print("\n\nSorting:");
   
    List.head = sort(List.head);  
   
    System.out.println( "\nLinked list after sorting:");  
    printList(List.head);  
}  
}
