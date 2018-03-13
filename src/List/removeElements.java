package List;

public class removeElements {
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        if(head==null) return null;
        ListNode list=head;
        ListNode plist=new ListNode(0);
        ListNode returnList=null;
        plist.next = list;
        while(list!=null){
            if(list.val==val){
                plist.next=list.next;
                list=list.next;
            }else{
                plist=list;
                list=list.next;
                if(returnList==null)
                    returnList=plist;
            }
        }
        return returnList;
    }
}
//关键是 三个变量 一个是 preNode 一个是 nowNode 一个是 returnNode 方便很多。
//不用考虑这么麻烦，直接按照一般情况考虑，如果 nowNode.val=val 直接跳过 若果不是遍历
