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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int count=0;
        if(head.next == null) return null;
        
        // singly-linked list의 전체 길이 구하기
        while(curr != null){
            count++;
            curr = curr.next;
        }
        
        if(count == n) return head.next;
        
        ListNode prev = null;
        curr = head;
        for(int i=0; i<count-n; i++){
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = curr.next;
        return head;
    }
}