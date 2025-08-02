package LinkedList.Problems;

public class problem141 {
    class ListNode {
          int val;
          ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
          }
      }

        public boolean hasCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;

            while(fast!= null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast== slow){
                    return true;
                }
            }
            return false;
        }

        // f

}
