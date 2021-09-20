// Java Code to populate next of every node to next of same level.
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node


class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        // Current Node Pointer
        Node curr = root;
        while(curr.left != null) {
            Node end = curr.left;
            while(curr != null){
                curr.left.next = curr.right;
                if(curr.next == null){
                    curr.right.next = null;
                } else {
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            curr = end;
        }
        return root;
    }
}
