package LinkedList.Problems;

import java.util.List;

public class problem83 {
    public static void main(String[] args) {

    }
    public static ListNode deleteDuplicates(ListNode node) {
        if(node == null){
            return node;
        }
        ListNode head = node;
        while(node.next != null){
            if( node.val == node.next.val){
                node.next = node.next.next;

            }
            else{
                node = node.next;
            }
        }
        return node;

    }
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {

     }
        ListNode(int val) {
            this.val = val;
     }
     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
  }
}
