package List;

public class countNodes {
    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        // write your code here
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}
