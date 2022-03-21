package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Treenode <Integer> root = new Treenode<>(1);
        Treenode<Integer> node1 = new Treenode<>(2);
        Treenode<Integer> node2 = new Treenode<>(3);
        Treenode<Integer> node3 = new Treenode<>(4);
        Treenode<Integer> node4 = new Treenode<>(5);
        Treenode<Integer> node5 = new Treenode<>(6);
        Treenode<Integer> node6 = new Treenode<>(7);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node1.children.add(node4);
        node2.children.add(node5);
        node3.children.add(node6);
        printAtK(root,2);

    }

     public static void printAtK(Treenode<Integer> root,int k){
        if(k<0){
            return;
        }
        if(k==0){
            System.out.println(root.data);
        }
        for(int i=0;i<root.children.size();i++){
            printAtK(root.children.get(i),k-1);
        }
    }


}
