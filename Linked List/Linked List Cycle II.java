// Java code to find out cycle in linked list and return the node which is repeating
// https://leetcode.com/problems/linked-list-cycle-ii


public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        
        while(slow != null && slow.next != null){
            try {
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    break;
                }
            } catch(Exception e){
                return null;
            }
        }
        
        if(fast == null || fast.next == null) return null;
        
        fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
