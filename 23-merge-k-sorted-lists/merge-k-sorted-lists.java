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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        return sort(lists,0,lists.length-1);
    }
    public static ListNode sort(ListNode[] lst, int start, int end){
        if(start==end){
            return lst[start];
        }
       
        int mid=start+(end-start)/2;
        ListNode left=sort(lst,start,mid);
        ListNode right=sort(lst,mid+1,end);
        return merge(left,right);
    }
    public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(a!=null && b!=null){
            if(b.val<a.val){
                temp.next=b;
                b=b.next;
            }
            else{
                temp.next=a;
                a=a.next;
            }
            temp=temp.next;

        }
        if(a!=null){
            temp.next=a;
        }
        if(b!=null){
            temp.next=b;
        }
        return dummy.next;
    }
}