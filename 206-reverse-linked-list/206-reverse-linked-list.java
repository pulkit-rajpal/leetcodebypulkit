/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
     /*   // bad way to do this is 
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(héad !=null)
        {
            array.add(head.val);
            
        }
        
        for (int i = array.size();i>0;i--)
        {
            new1 = new1.val;
            new1.next = 
            
        }
       */ 
        
            
        ListNode curr =  head;
        ListNode follow = head;
        ListNode prev =  null;

            
        while(curr!=null)
        {
        follow = follow.next;
        curr.next = prev;
        prev= curr ;
        curr = follow;
        }
        return prev;     
    }
}