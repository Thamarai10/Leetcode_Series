import java.util.*;
class Node{
  int data;
  Node next;
Node(int d){
  data=d;
}
}
public class merge2SortedLists{
     public void Print(Node head){
      Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        }
    public Node createLists(Scanner scan){
       Node head=null;
       Node tail=null;
       while(true){
        int n=scan.nextInt();
      
        if(n==-1){
          break;
        }
         Node newNode=new Node(n);
        if(head==null){
          head=newNode;
          tail=newNode;
        }
        else{
          tail.next=newNode;
          tail=tail.next;
        }
       
       } return head;
    }
    //Merge Two sorted Lists Logic here
    public Node mergeTwoSortedLists(Node l1,Node l2){
       Node dummy=new Node(0);
       Node tail=dummy;
       while(l1!=null && l2!=null){
        if(l1.data < l2.data){
            tail.next=l1;
            l1=l1.next;
        }
        else{
          tail.next=l2;
          l2=l1.next;
        }
        tail=tail.next;
       }
       if(l1!=null){
         tail.next=l1;
       }
       if(l2!=null){
         tail.next=l2;
       }
       return dummy.next;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     merge2SortedLists m= new merge2SortedLists();
        Node list1=m.createLists(sc);
        Node list2=m.createLists(sc);
        System.out.println("List1 :");
        m.Print(list1);
        System.out.println("\nList2 :");
        m.Print(list2);
        Node res=m.mergeTwoSortedLists(list1,list2); 
       System.out.println("\nmergeTwoSortedLists :");
        m.Print(res);
}
}