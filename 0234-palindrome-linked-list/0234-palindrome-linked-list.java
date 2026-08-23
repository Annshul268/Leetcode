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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode firstHead = head;
        ListNode secondHead = reverse(slow);

        while(firstHead.next != null){
            if(firstHead.val != secondHead.val) return false;
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }

        return true;

    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;

            if(next != null) next = next.next;
        }

        return prev;
    }
}