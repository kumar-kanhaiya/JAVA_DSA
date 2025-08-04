package LinkedList.Problems;

public class problem61 {
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next == null || k==0){
            return head;
        }
        // first we finding the end node
        ListNode tail = head;
        int length = 0;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        ListNode start = head;
        ListNode newAns = new ListNode(0);
        ListNode newHead = tail;
        while(k != 0){
            for (int i = 1; i < k; i++) {
                newAns.next = start;
                start = start.next;
                newAns = newAns.next;
            }
            k--;
        }
        newHead.next = newAns.next;
        return newHead;
    }
}
