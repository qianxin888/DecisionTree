package com.dataMiningAlgorithms.DecisionTree;

import com.dataMiningAlgorithms.DecisionTree.DecisionTree.TreeNode;

/**
 * 
 * ���һ���ˣ�������
 * 
 * */

public class TestDecisionTree {

    public static void main(String args[]){
        
        DecisionTree dt = new DecisionTree();
        // ����������
        TreeNode node = dt.createDT(Data.getData(), Data.getAttribute());
        System.out.println();
    }

}
