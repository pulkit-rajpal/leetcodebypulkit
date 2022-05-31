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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // two list and we need to merge the two linked lists and reutnr the head of the merged list 
        // at this place recursion wont work so going with the iterartive approach    
    // approach is to loop until the list become null that's it
        
        ListNode list3 = new ListNode();
        // this temp will be used to store temp node while shuffling 
        ListNode temp = list3;
            

        while(list1!=null && list2!=null)
        {
            
            if (list1.val <list2.val)
            {
                // list3 is null in the start so assinging it to  the next
                list3.next = list1;
                list1 = list1.next;
            }
            else 
            {
                // 2 case 

                list3.next = list2;
                list2 = list2.next;
            
            }
            list3=list3.next;

        }
            // for the leftover case 
            while(list1!=null)
            {
                list3.next = list1;
                list1 = list1.next;
                list3=list3.next;

            }
            while(list2!=null)
            {
                list3.next = list2;
                list2 = list2.next;
                list3=list3.next;

            }
            
        return temp.next;
    }
    }
