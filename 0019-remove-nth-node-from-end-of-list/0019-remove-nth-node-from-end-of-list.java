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
    public int getSize(ListNode head){
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        int size = getSize(head);

        int move = size - n;

        // remove head if n == size , as it need to remove head;
        if(move == 0){
            return head.next;
        }

        ListNode remove = head;
        // Move to node before the one we want to remove
        for(int i = 0; remove != null && i < move-1; i++){
            remove = remove.next;
        }

        remove.next = remove.next.next;

        return head;
    }
}