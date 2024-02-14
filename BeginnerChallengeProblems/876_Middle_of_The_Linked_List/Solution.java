public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode createListNode(int prevListNodeVal, ListNode prevlistNode) {
        prevlistNode = new ListNode(prevListNodeVal, prevlistNode);
        prevListNodeVal--;
        if (prevListNodeVal > 0) {
            // System.out.println("head val: " + prevListNodeVal);
            prevlistNode = createListNode(prevListNodeVal, prevlistNode);
            // System.out.println("tail val: " + prevListNodeVal);
        }
        return prevlistNode;
    }

    public static ListNode createListNode(int lastListNodeVal) {
        ListNode listNode = new ListNode(lastListNodeVal);
        lastListNodeVal--;

        while (lastListNodeVal > 0) {
            // System.out.println(lastListNodeVal);
            listNode = new ListNode(lastListNodeVal, listNode);
            lastListNodeVal--;
        }

        return listNode;
    }

    public static ListNode middleNode(ListNode head) {
        ListNode listNode = head;
        int count = 0;
        // System.out.println(head.next.next.next.next.val);

        while (listNode.next != null) {
            System.out.println(listNode.val);
            count++;
            listNode = listNode.next;
        }
        count++;
        System.out.println("Count: " + count);

        count = count % 2 == 0 
            ? count / 2 + 1 
            : (count + 1) / 2;
        
        listNode = head;
        for (int i = 1; i < count; i++) {
            listNode = listNode.next;
        }

        return listNode;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        // listNode = middleNode(createListNode(5, null));
        listNode = middleNode(createListNode(5));
        System.out.println(listNode.val);
    }
}
