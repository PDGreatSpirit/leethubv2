class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextNode = current.next; // 다음 노드를 임시로 저장
            current.next = prev; // 포인터 방향을 반대로 뒤집음
            prev = current; // 포인터를 한 단계 앞으로 이동
            current = nextNode;
        }
        
        return prev; // 이전 노드가 새로운 역순 리스트의 헤드가 됨
    }
}
