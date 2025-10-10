package Assignments.Assignment_9;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                
                current.next = current.next.next;
            } else {
               
                current = current.next;
            }
        }

        return head;
    }
}
