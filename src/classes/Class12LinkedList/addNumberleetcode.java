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


 /*

Question  : https://leetcode.com/problems/add-two-numbers/

Solution

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode ansHead = null;
            ListNode temp = ansHead;
            int carry = 0;
            while(l1 != null || l2 != null || carry != 0 ){
                int data = 0;
                if(l1 != null){
                    data = data + l1.val;
                    l1 = l1.next;
                }
                if(l2 != null){
                    data = data + l2.val;
                    l2 = l2.next;
                }
                data = data + carry;
                if(ansHead == null){
                    ansHead = new ListNode(data%10);
                    temp = ansHead;
                }
                else{
                    temp.next = new ListNode(data%10);
                    temp = temp.next;
                }
                carry = data/10;

            }

            return ansHead;

        }
    }

  */

