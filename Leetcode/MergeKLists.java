/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.*;
class Solution {
    public ListNode mergeKListsWithHeap(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(5, new Comparator<ListNode>() {
           @Override
            public int compare(ListNode l1, ListNode l2) {
                return (l1.val - l2.val);
            }
        });
        
        for(int i = 0; i < lists.length; i++) {
            while(lists[i] != null) {
                ListNode l = new ListNode(lists[i].val);
                pq.add(l);
                lists[i] = lists[i].next;
            }
        }
        ListNode head = new ListNode(0);
        ListNode op = head;
        while(pq.size() > 0) {
            ListNode l = pq.poll();
            op.next = l;
            op = op.next;
        }
        
        return head.next;
    }
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