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
                
        // singly-linked list의 전체 길이 구하기
        while(curr != null){
            count++;
            curr = curr.next;
        }
        
        // 맨 앞의 노드를 제거해야 하는 경우
        if(count == n) return head.next;
        
        ListNode prev = null;
        curr = head;
        for(int i=0; i<count-n; i++){
            prev = curr;
            curr = curr.next;
        }
        
        // 제거하는 노드인 curr의 앞 노드에 curr의 뒤 노드를 연결시킨다.
        prev.next = curr.next;
        return head;
    }
}