
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 
class MergingTwoLkists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode op = new ListNode(0);
        ListNode head = op;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                ListNode l = new ListNode(l1.val);
                op.next = l;
                op = op.next;
                l1 = l1.next;
            } else {
                ListNode l = new ListNode(l2.val);
                op.next = l;
                op = op.next;
                l2 = l2.next;
            }
        }
        
        while(l1 != null) {
            ListNode l = new ListNode(l1.val);
            op.next = l;
            op = op.next;
            l1 = l1.next;
        }
        
        while(l2 != null) {
            ListNode l = new ListNode(l2.val);
            op.next = l;
            op = op.next;
            l2 = l2.next;
        }
        return head.next;
    }
}