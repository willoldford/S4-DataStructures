package LinkedList;

public class Main1 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(10);
        dll.insertDLL(20, 1);
        dll.insertDLL(30, 2);
        dll.insertDLL(40, 3);
        dll.insertDLL(50, 4);

        System.out.println("Original DLL:");
        dll.traverseDLL();

        System.out.println("Reverse Traversal:");
        dll.reverseTraverseDLL();

        System.out.println("Search for value 30:");
        dll.searchDLL(30);

        System.out.println("Deleting node at location 2:");
        dll.deleteNodeDLL(2);
        dll.traverseDLL();

        System.out.println("Deleting entire DLL:");
        dll.deleteDLL();
        dll.traverseDLL(); // Should indicate that DLL no longer exists

    }
}