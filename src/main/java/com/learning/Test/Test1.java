package com.learning.Test;

import com.learning.LinkedList.Node;

import java.util.*;

/**
 * Author:zhangp
 * Date:2020/12/29 0:10
 * Description:
 */
public class Test1 {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
//        Node node = reverList(a);
        Node cur = a;
        while (null != cur.next){
            System.out.println(cur.data);
            cur = cur.next;
        }
//        while (a.next != null){
//            System.out.println(a.next);
//        }
//        System.out.println(node.data);
//
//        List<Node> list = new ArrayList<>();
//        list.add(a);
//        list.add(b);
//        list.add(c);
//        list.add(d);
//        Iterator<Node> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next().data);
//        }

    }

    public static Node reverList(Node root){
        if(root==null)return root;
        Node newhead=null;  //反转后的新链表头结点
        Node preNode = null; //前一节点
        Node nextNode= null; //下一节点
        Node curNode=root; //当前节点
        while(curNode.next!=null) {
            nextNode=curNode.next; //保存当前节点的下一节点
            curNode.next=preNode; //使当前节点指向前一节点
            preNode=curNode;  //把前一节点往后移
            curNode=nextNode; //把当前节点往后移
        }
        newhead=curNode;
        return newhead;

    }
}
