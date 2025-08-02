package LinkedList.Problems;

public class problem142 {
    class ListNode {
         int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
    }

//    public ListNode detectCycle(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//
//
//        while(fast!= null && fast.next!= null){
//            fast = fast.next.next;
//            slow = slow.next;
//
//            if(fast == slow){
//                // ListNode Entry = head;
//                // while(Entry != slow){
//                //     Entry = Entry.next;
//                //     slow = slow.next;
//                // }
//
//                ListNode temp = slow;
//                ListNode ans = new ListNode(0);
//                ListNode dummy = ans;
//                do{
//                    dummy.next = new ListNode(temp.val);
//                    dummy = dummy.next;
//                    temp =temp.next;
//
//
//                }while(temp!= slow);
//                return ans.next;
//            }
//
//        }
//        return null;
//    }

    // first approach is correct but time limit exceed

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

    public ListNode detectCycle(ListNode head){
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;


        }
    }

}
