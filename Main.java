import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Linkedlist n=new Linkedlist();
        n.insert(9);
        n.insert(34);
        n.insert(23);
        n.insert(57);
        n.insertAtAnywhere(2,1);
        n.show();

    }
}