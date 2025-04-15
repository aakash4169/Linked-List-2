/*
*
*
*
* */


public class IntersectionOf2LinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //return Solution1(headA,headB);
        //return Solution2(headA,headB);
        ListNode currA=headA;
        ListNode currB=headB;

        while(currA!=currB)
        {
            currA=currA.next;
            currB=currB.next;

            if(currA==null && currB==null)
                return null;
            if(currA==null)
                currA=headB;
            if(currB==null)
                currB=headA;

        }
        return currA;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
