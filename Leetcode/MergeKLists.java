/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        
        ListNode op = new ListNode(0);
        ListNode head = op;
        
        while(true) {
            // get the minimum and add to the op list break once empty
            
            int index = getMeMinimum(lists);
            
            if(index == -1) {
                break;
            }
            
            ListNode l = new ListNode(lists[index].val);
            op.next = l;
            op = op.next;
            
            lists[index] = lists[index].next;            
            
        }
        return head.next;
    }
    
    public int getMeMinimum(ListNode[] lists) {
        boolean empty = true;
        for(int i = 0; i < lists.length; i++) {
            if(lists[i] != null) {
                empty = false;
                break;
            }
        }
        if(empty) {
            return -1;
        }
        
        int min = Integer.MAX_VALUE;
        int index = 0;
        int c = 0;
        for(ListNode l : lists) {
            if(l != null && l.val < min) {
                min = l.val;
                index = c;
            }
            c++;
        }
        return index;        
    }   
    
}