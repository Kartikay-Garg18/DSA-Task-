public class MiddleLL {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int lengthNode(ListNode head){
        int len = 0;
        ListNode currNode = head;
        while(currNode!=null){
            len++;
            currNode = currNode.next;
        }
        return len;
    }

    public ListNode middleNode(ListNode head) {
        int moves = lengthNode(head)/2;
        while(moves-->0){
            head = head.next;
        }
        return head;
    }
}
