package LinkedList.Problems;

public class problem148 {
    ListNode head;
    ListNode tail;
    int size;



    public class ListNode {

      int val;
        public ListNode get() {
            return val;
        }
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val; }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next; }
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

    // second approach
    public void bubbleSort(){
          bubbleSort(size-1 , 0);
    }
    private void bubbleSort(int row , int coll){
          if(row == 0){
              return;
          }
          if(coll < row){
              ListNode first = get(coll);
              ListNode second  = get(coll+1);

              if(first.val > second.val){
                  // swap
                  if(first == head){
                      head = second;
                      first.next = second.next;
                      second.next = first;
                  }
                  else if(second == tail){
                      ListNode prev = get(coll -1);
                      prev.next = second;
                      tail = first;
                      first.next = null;
                      second.next = tail;
                  }
                  else{
                      ListNode prev = get(coll -1);
                      prev.next = second;
                      first.next = second.next;
                      second.next = first;
                  }
              }
                bubbleSort(row, coll + 1);
          }
          else{
              bubbleSort(row-1 , 0);
          }
    }

}
