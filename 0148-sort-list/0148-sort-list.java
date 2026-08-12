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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode mid = getMid(head);

        // left part start from head and right part start from mid 
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        // merge sorted left and right
        return merge(left,right);
    }

    public ListNode merge(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 != null) temp.next = list1;
        else temp.next = list2;

        return dummy.next;
    }

    // return the mid part of list
    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        ListNode temp = head;

        while(fast != null && fast.next != null){ //when this breaks, slow will be the mid node so return slow
            temp = slow; 
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;  //breaking the list into half, i.e., the list breaks just before mid
        return slow;
    }
}