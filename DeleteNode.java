public class DeleteNode {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {

        ListNode currNode = node;
        while(currNode.next.next!=null){
            ListNode nextNode = currNode.next;
            currNode.val = nextNode.val;
            currNode = nextNode;
        }
        currNode.val = currNode.next.val;
        currNode.next=null;
    }

}
