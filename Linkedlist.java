public class Linkedlist {
    Node head;

    public void insert(int data){
        Node node=new Node();
        node.value=data;
        if (head==null){
            head=node;
        }
        else {
            Node n2=head;
            while (n2.next!=null){
                n2=n2.next;
            }
            n2.next=node;
        }

    }
    public void insertAtStart(int value){
        Node node=new Node();
        node.value=value;
        node.next=head;
        head=node;
    }
    public void insertAtAnywhere(int index,int value){
        Node node=new Node();
        node.value=value;
        if (index==0){
            insertAtStart(value);
        }
        Node n3=head;
        for (int i=0;i<index-1;i++){
            n3=n3.next;
        }
        node.next=n3.next;
        n3.next=node;

    }
    public void show(){
        Node node=head;
        while (node.next!=null) {
            System.out.println(node.value);
            node=node.next;

        }
        System.out.println(node.value);
    }


    @Override
    public String toString() {
        return "Linkedlist";

    }

}
