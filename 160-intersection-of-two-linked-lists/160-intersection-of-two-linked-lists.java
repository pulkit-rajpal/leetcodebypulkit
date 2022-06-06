/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/* Check this for the visualisation
https://leetcode.com/problems/intersection-of-two-linked-lists/discuss/49785/Java-solution-without-knowing-the-difference-in-len!/165648

*/


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 = headB;
        return helper(t1,t2);
    }

    // the aim is to iterate till both the linked list become null and if one become null i.e one iteration is completed then assign again the same 
    // instead of recursion we will use the iterative approach 
    public ListNode helper(ListNode t1, ListNode t2) {
    
        ListNode a = t1;    
        ListNode b = t2;

        while (t1 != t2) {
            if (t1 == null) {
                t1 = b;
            }
            else {
                t1 = t1.next;

            }
             if (t2 == null) {
                t2 = a;
            }
            else 
            {
                            t2 = t2.next;

            }
            if (t1 == null && t2 == null) return null;

        }
        return t1;
    }

}