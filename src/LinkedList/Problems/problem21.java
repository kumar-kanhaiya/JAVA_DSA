package LinkedList.Problems;

public class problem21 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2){
          ListNode f = list1;
          ListNode s = list2;
          ListNode ans = new ListNode();
          while(f!= null && s != null){
              if(f.val < s.val){
                  ans = new ListNode(f.val);
                  f= f.next;
                  ans = ans.next;

              }
              if(s.val < f.val){
                  ans = new ListNode(s.val);
                  s= s.next;
                  ans = ans.next;
              }
              if(s.val == f.val){
                  ans = new ListNode(f.val);
                  f = f.next;
                  ans = ans.next;
              }
              ans = ans.next;
          }
          // checking
        while(f!= null){
            ans = new ListNode(f.val);
            f = f.next;

        }
        while (s!= null){
            ans = new ListNode(s.val);
            s = s.next;

        }
        return ans;
    }

}
