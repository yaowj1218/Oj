package List;

public class ListNodereverse {
    public ListNode reverse(ListNode head) {
        // write your code here
        if(head==null) return head;
        ListNode cur=head.next;
        ListNode pre=head;
        ListNode nxt;
        while(cur!=null){
            nxt=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nxt;
        }
        // 将原链表的头节点的下一个节点置为null，再将反转后的头节点赋给head
        head.next = null;
        head = pre;
        return head;
    }
}
//口→口→口→口    -----》    口←口←口→口
//设置三个节点 当前、前一个、后一个指针
