package LinkedList.Problems;

public class problem92 {
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
//    public ListNode reverseBetween2(ListNode head, int left, int right) {
//        if(left == right){
//            return head;
//        }
//        ListNode cureent = head;
//        ListNode present = get(head,left);
//        ListNode prev = null;
//        ListNode next = present.next;
//
//        while(present != get(head,right)){
//            present.next = prev;
//            prev = present;
//            present = next;
//            if(next != get(head,right)){
//                next = next.next;
//            }
//        }
//
//    }
    private ListNode get( ListNode head, int index){
        ListNode node = head;
        while(node.next!= null){
            if(node.val == index){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // second approach
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left-1 ; i++) {
            prev = current;
            current = current.next;

        }
        ListNode last  = prev;
        ListNode newEnd = current;

        // reveree between left and right
        ListNode next = current.next;
        for (int i = 0; current!= null && i < right - left +1  ; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
        }
        if(last != null){
            last.next = prev;

        }
        else{
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
}
