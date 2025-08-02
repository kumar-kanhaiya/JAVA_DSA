package LinkedList.Problems;

import java.util.List;

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

        // finding the length of the cycle
        public int lengthCycle(ListNode head){
            ListNode fast = head;
            ListNode slow = head;

            while(fast!= null && fast.next != null){
                fast = fast.next.next;
                slow= slow.next;

                if(fast == slow){
                    ListNode temp = slow;
                    int length = 0;
                    do {
                        temp = temp.next;
                        length++;
                    }while(temp != slow);

                    return length;
                }
            }
            return -1;
        }

}
