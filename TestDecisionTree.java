package com.dataMiningAlgorithms.DecisionTree;

import com.dataMiningAlgorithms.DecisionTree.DecisionTree.TreeNode;

/**
 * 
 * 最后一步了，主函数
 * 
 * */

public class TestDecisionTree {

    public static void main(String args[]){
        
        DecisionTree dt = new DecisionTree();
        // 创建决策树
        TreeNode node = dt.createDT(Data.getData(), Data.getAttribute());
        System.out.println();
    }

}
