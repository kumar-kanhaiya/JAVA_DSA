package LinkedList.Problems;

public class problem143 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {

      }
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
  }
    public void reorderList(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head;
        // finding the middle node
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        // we get the middle element then reverse the node
        ListNode reversed = reverese(slow);
        ListNode start = head;
        ListNode prev = null;
        ListNode end = reversed.next;
        while(end!= null || start != slow){
            ListNode temp = start.next;
            start.next = end;
            start = temp;
            temp = end.next;
            end.next = start;
            end = temp;
            start = start.next;
            end = end.next;
            temp = temp.next;

        }
    }
    public ListNode reverese(ListNode head){
          ListNode present = head;
          ListNode prev = null;
          ListNode next = present.next;

          while (present.next != null ){
              present.next = prev;
              prev = present;
              present = next;
              if(next != null){
                  next = next.next;
              }
          }
          return prev;
    }

}
