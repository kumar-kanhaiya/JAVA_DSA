package LinkedList.Problems;

public class problem234 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reReversed = headSecond;
        // comparing the halfs
        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(reReversed);
        if(head == null || headSecond == null){
            return true;
        }
        return false;
    }
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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow =slow.next;

        }
        return slow;


    }
}
