public class remove_duplicates_sorted_list {
    
    @SuppressWarnings("unused")
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        if(head.val == head.next.val) head = deleteDuplicates(head.next);
        else head.next = deleteDuplicates(head.next);
        return head;
    }

    @SuppressWarnings("unused")
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
