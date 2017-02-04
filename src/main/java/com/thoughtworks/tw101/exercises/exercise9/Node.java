package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node leftNode;
    private Node rightNode;
    private static ArrayList<String> orderedNames = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        int compareResult = name.compareToIgnoreCase(nameOfNewNode);
        if (compareResult > 0) {
            if (leftNode != null) {
                leftNode.add(nameOfNewNode);
            } else {
                leftNode = new Node(nameOfNewNode);
            }
        } else if (compareResult < 0) {
            if (rightNode != null) {
                rightNode.add(nameOfNewNode);
            } else {
                rightNode = new Node(nameOfNewNode);
            }
        } else {
            System.out.println("This is the same string (not case sensitive)");
        }
    }

    public List<String> names() {
        if (leftNode != null) {
            leftNode.names();
        }
        orderedNames.add(name);
        if (rightNode != null){
            rightNode.names();
        }
        return orderedNames;
//        System.out.println("Printing out tree");
//        System.out.println("L       R");
//        System.out.println(leftNode.getName() + " <  >" + rightNode.getName());
//        return new ArrayList<String>();
    }
//
//    public String getName() {
//        return name;
//    }
}
