/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode prev = new ListNode(0);
        ListNode temp = prev;
        prev.next = head;
        
        while(prev.next != null && prev.next.next != null) {
            prev = swap(prev);
        }
        return temp.next;    
    }
    
    public ListNode swap(ListNode prev) {
        if(prev.next.next != null ) {
            ListNode next = prev.next.next.next;
            ListNode two = prev.next.next;
            
            prev.next.next.next = prev.next;
            prev.next.next = next;
            prev.next = two;
            
            return two.next;
        } else {
            return prev;
        }
    }
}