public class Selection{
    private Node head;

    public void add(int value){
    Node newnode = new Node(value);
    newnode.setNext(head);
    head=newnode;
    }

    public static Node swap(Node head_ref, Node curr_node1, Node curr_node2, Node prev_node){
        head_ref=curr_node2;
        prev_node.setNext(curr_node1);

        Node temp = curr_node2.getNext();
        curr_node2.setNext(curr_node1.getNext());
        curr_node1.setNext(temp);

        return head_ref;
    }

    public static Node Selection_Sort(Node head){
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
        head.setNext(Selection_Sort(head.getNext()));
        
        return head;
    }

    public static Node sort(Node head_ref){
        if(head_ref==null){
            return null;
        }

        head_ref = Selection_Sort(head_ref);
        return head_ref;
    }

    public static void printList( Node head){  
    while (head != null)  
    {  
        System.out.print( head.getValue() + " ");  
        head = head.getNext();  
    }  
}  
   
public static void main(String args[]) 
{  
    Selection oddList = new Selection();  
   
    // create linked list using addNode method  
    oddList.add(11);  
    oddList.add(1);  
    oddList.add(5);  
    oddList.add(3);  
    oddList.add(9); 
    oddList.add(7);
    //print the original list
    System.out.println( "Original Linked list:");  
    printList(oddList.head);  
    System.out.print("\nsorting");
   
    // sort the linked list  
    oddList.head = sort(oddList.head);  
   
    //print the sorted list
    System.out.println( "\nLinked list after sorting:");  
    printList(oddList.head);  
}  
}
