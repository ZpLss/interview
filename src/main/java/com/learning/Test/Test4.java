package com.learning.Test;

import com.learning.bean.ListNode;

/**
 * Author:zhangp
 * Date:2021/1/14 19:02
 * Description:
 */
public class Test4 {

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while(head != null) {
            ListNode tmp = head.next; // 暂存后继节点 cur.next
            head.next = pre;          // 修改 next 引用指向
            pre = head;               // pre 暂存 cur
            head = tmp;               // cur 访问下一节点
        }
        return pre;
    }

    public static void print(ListNode node){
        while (node.next != null){
            System.out.print(node.val + "->");
            node = node.next;
        }

        System.out.print(node.val);

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        print(node1);
        System.out.println("**********");
        ListNode node = reverseList(node1);
        print(node);

    }


}
