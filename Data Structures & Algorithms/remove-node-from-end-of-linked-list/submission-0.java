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

    public int findLength(ListNode head){
        if(head == null){
            return 0;
        }

        return 1 + findLength(head.next);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = findLength(head);

        // remove head
        if(length == n){
            return head.next;
        }

        int steps = length - n - 1;

        ListNode temp = head;

        while(steps > 0){
            temp = temp.next;
            steps--;
        }

        temp.next = temp.next.next;

        return head;
    }
}