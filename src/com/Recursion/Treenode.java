package com.Recursion;
import java.util.ArrayList;

public class Treenode <T>{
    public T data;
    ArrayList<Treenode<T>> children;

    public Treenode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}
