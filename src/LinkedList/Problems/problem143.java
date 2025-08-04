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
          if(head == null || head.next == null){
              return;
          }
        ListNode mid = middleNode(head);
        // we get the middle element then reverse the node
        ListNode hs = reverese(mid);
        ListNode hf = head;
        while(hs!= null && hf != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;


        }
        if(hf != null){
            hf.next = null;
        }

    }
    public ListNode reverese(ListNode head){
          if(head ==null){
              return head;
          }
          ListNode present = head;
          ListNode prev = null;
          ListNode next = present.next;

          while (present != null ){
              present.next = prev;
              prev = present;
              present = next;
              if(next != null){
                  next = next.next;
              }
          }
          return prev;
    }
    public ListNode middleNode(ListNode head) {
          ListNode fast = head;
        ListNode slow = head;


        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
