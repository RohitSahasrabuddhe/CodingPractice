/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Add2NumbersFast {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode headCopy = head;
        int carry = 0;
        
        while (l1.next != null && l2.next != null) {
            int sum = l1.val + l2.val  + carry;
            ListNode current = new ListNode((sum%10));
            head.next = current;
            head = current;
            if (sum > 9) {
                carry = 1;
            }
            else {
                carry = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        int sum = l1.val + l2.val  + carry;
        ListNode current = new ListNode((sum%10));
        head.next = current;
        head = current;
        if (sum > 9) {
            carry = 1;
        }
        else {
            carry = 0;
        }
        // l1 is empty
        if (l1.next == null && l2.next != null) {
            //copy paste l2
            head.next = copyPasteRemaining(l2.next,carry);      
        }
        
        // l2 is empty
        if (l2.next == null && l1.next != null) {
            //copy paste l1
            head.next = copyPasteRemaining(l1.next,carry);         
        }
        
        // l1 and l2 both empty
        if (l2.next == null && l1.next == null) {
            //Carry addition
            if (carry > 0) {
                current = new ListNode(carry);
                head.next = current;
                head = current;
            }         
        }
        return headCopy.next;
    }
    
    public ListNode copyPasteRemaining(ListNode l, int carry) {
        ListNode head = new ListNode(0);
        ListNode headCopy = head;
        while (l.next != null) {
            int sum = l.val + carry;
            ListNode current = new ListNode((sum%10) );
            head.next = current;
            head = current;
            if (sum > 9) {
                carry = 1;
            }
            else {
                carry = 0;
            }
            l = l.next;
        }
        int sum = l.val + carry;
        ListNode current = new ListNode((sum%10) );
        head.next = current;
        head = current;
        if (sum > 9) {
            carry = 1;
        }
        else {
            carry = 0;
        }        
        if (carry > 0) {
            current = new ListNode(carry);
            head.next = current;
            head = current;
        }
        return headCopy.next;
    }
}