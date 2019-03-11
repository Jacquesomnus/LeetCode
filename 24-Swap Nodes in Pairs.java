/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode p = node;
        ListNode tmp;
        while (p.next != null && p.next.next != null) {
            tmp = p.next.next;
            p.next.next = tmp.next;
            tmp.next = p.next;
            p.next = tmp;
            p = tmp.next;
        }
        head = node.next;
        return head;
    }
}