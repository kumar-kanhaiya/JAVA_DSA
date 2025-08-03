package LinkedList.Problems;

public class problem206 {
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
    // first we done without using recursion
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode present = head;
        ListNode next = present.next;
        ListNode prev = null;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }

        }

        return prev;
    }

    // now solving using recursion



}
