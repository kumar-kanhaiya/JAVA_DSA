package LinkedList.Problems;

public class problem92 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null){
            return head;
        }

        ListNode present = get(head,left);
        ListNode prev = null;
        ListNode next = present.next;

        while(present != get(head,right)){
            present.next = prev;
            prev = present;
            present = next;
            if(next != get(head,right)){
                next = next.next;
            }
        }

    }
    private ListNode get( ListNode head, int index){
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}
