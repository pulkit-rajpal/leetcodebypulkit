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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode node = head; 
        ListNode node1 = new ListNode(); 
        ListNode node2 = new ListNode(); 
        ListNode node3 = new ListNode(); 
        ListNode node4 = new ListNode(); 
        
        int size = 0;
        while(node!=null)
        {
            if (size+1 == k)
            {   node1 = node;  
            }
            node = node.next;
            size++;
        }
        int count =1;
        node = head;
        while(node!=null)
        {
            if (count ==size+1-k)
            {
                node2 = node;  
            }
        node = node.next;
            count++;
        }
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
        return head;
    }
}