package LinkedList.Problems;

public class problem148 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode sortList(ListNode head) {
        //first this question is done by the help of merge short
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left , right);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ans = new ListNode();
        ListNode tail = ans;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            }
            else{
                tail.next = list2;

                list2 = list2.next;
                tail = tail.next;
            }

        }
        while(list1 != null){
            tail.next = list1;
            list1 = list1.next;
            tail = tail.next;
        }
        while(list2 != null){
            tail.next = list2;
            list2 = list2.next;
            tail = tail.next;
        }
        return ans.next;
    }
    public ListNode middleNode(ListNode head) {
        ListNode prev = null;
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = null; // Important: break the list into two parts
        }


        return slow;


    }
}
