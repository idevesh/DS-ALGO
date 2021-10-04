// Java code to find cycle in a linked list.
// https://leetcode.com/problems/linked-list-cycle/

/* APPROACH NUMBER 1 - No extra space ( Floyd Circle Finding Algorithm )*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        if(slow == null) return false;
        while(slow.next != null && slow.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}

/* APPROACH NUMBER 2 - Extra Space*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hash = new HashSet<ListNode>();
        while(head != null){
            if(hash.contains(head))
                return true;
            hash.add(head);
            head = head.next;
        }
        return false;
    }
}
