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
        ListNode head = new ListNode();
        while(list1 != null  || list2 != null){
            if(list1.val == list2.val){
                ListNode node = new ListNode(list1.val);
                node.next = head;
                head = node;
                ListNode node2 = new ListNode(list2.val);
                node2.next = head;
                head = node2;
                list1 = list1.next;
                list2 = list2.next;
            }
             if(list1.val > list2.val){
                ListNode node = new ListNode(list1.val);
                node.next = head;
                head = node;
                list1 = list1.next;
            }
            if(list2.val > list1.val){
                ListNode node2 = new ListNode(list2.val);
                node2.next = head;
                head = node2;
                list2 = list2.next;
            }
        }
        return head;
    }
    public  void insertElement( ListNode head ,int val ){
          ListNode node  = new ListNode(val);
          node.next = head;
          head = node;

    }

}
