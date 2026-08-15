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

    public int size(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp!= null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k < 1 || head == null) return head;

        ListNode prev = null;
        ListNode present = head;

        int size = size(head);
        while(present != null){
            ListNode last = prev;
            ListNode newEnd = present;

            if(size < k) break;

            ListNode next = present.next;
            for(int i = 0; present != null && i < k; i++){
                present.next = prev;
                prev = present;
                present = next;
                
                if(next != null) next = next.next;
                size--;
            }

            if(last != null) last.next = prev;
            else head = prev;

            newEnd.next = present;

            prev = newEnd;
        }

        return head;
    }
}