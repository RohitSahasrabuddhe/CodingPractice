/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Add2NumberList {
    public ListNode addTwoNumbers_NaiveApproach(ListNode l1, ListNode l2) {
        long n1 = getMeNumber(l1);
        long n2 = getMeNumber(l2);
        System.out.println(n1);
        System.out.println(n2);
        ListNode op = returnMeList(n1+n2);
        return op;
    }
    
    public long getMeNumber(ListNode l) {
        long n = 0;
        long pow = 0;
        while (l.next != null) {
            n += l.val * Math.pow(10,pow++);
            l = l.next;
        }
        n += l.val * Math.pow(10,pow++);        
        return n;
    }
    
   public ListNode returnMeList(long n) {
       if (n == 0) {
           return new ListNode(0);
       }
       ListNode head = new ListNode(0);
       ListNode headCopy = head;
       while (n != 0) {
           ListNode current = new ListNode((int)n%10);
           n = n/10;
           head.next = current;
           head = current;
       }
        return headCopy.next;
    }
}