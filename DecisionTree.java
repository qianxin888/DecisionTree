package com.dataMiningAlgorithms.DecisionTree;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DecisionTree {

    public TreeNode createDT(List<ArrayList<String>> data,List<String> attributeList){
        
    	// 显示数据
        System.out.println("###############当前的DATA为###############");
        // System.out.println(data);
        for(int i=0;i<data.size();i++){
            ArrayList<String> temp = data.get(i);
            for(int j=0;j<temp.size();j++){
                System.out.print(temp.get(j)+ "\t");
            }
            System.out.println();
        }
        System.out.println("########################################");
        // 显示属性
        System.out.println("###############当前的ATTR为###############"); 
        for(int i=0;i<attributeList.size();i++){
            System.out.print(attributeList.get(i)+ "\t");
        }
        System.out.println();
        System.out.println("########################################");
        
        // 声明一个树节点
        TreeNode node = new TreeNode();
        
        String result = InfoGain.IsPure(InfoGain.getTarget(data));
        // System.out.println("result=%%%%%%%%%%%%%%"+result);
        if(result != null){
            node.setNodeName("leafNode");
            node.setTargetFunValue(result);
            return node;
        }
        if(attributeList.size() == 0){
            node.setTargetFunValue(result);
            return node;
        }else{
        	// 计算信息增益率
            InfoGain gain = new InfoGain(data,attributeList);
            double maxGainRatio = 0.0;
            int attrIndex = -1;
            for(int i=0;i<attributeList.size()-1;i++){
                double tempGainRatio = gain.getGainRatio(i);
                if(maxGainRatio < tempGainRatio){
                	maxGainRatio = tempGainRatio;
                    attrIndex = i;
                }
            }
            System.out.println("选择出的最大增益率属性为： " + attributeList.get(attrIndex)+", 增益率为"+maxGainRatio);
            node.setAttributeValue(attributeList.get(attrIndex));
            List<ArrayList<String>> resultData = null;
            Map<String,Long> attrvalueMap = gain.getAttributeValue(attrIndex);
            for(Map.Entry<String, Long> entry : attrvalueMap.entrySet()){
                resultData = gain.getData4Value(entry.getKey(), attrIndex);
                TreeNode leafNode = null;
                System.out.println("当前为"+attributeList.get(attrIndex)+"的"+entry.getKey()+"分支。");
                if(resultData.size() == 0){
                    leafNode = new TreeNode();
                    leafNode.setNodeName(attributeList.get(attrIndex));
                    leafNode.setTargetFunValue(result);
                    leafNode.setAttributeValue(entry.getKey());
                }else{
                    for (int j = 0; j < resultData.size(); j++) {
                        resultData.get(j).remove(attrIndex);
                    }
                    ArrayList<String> resultAttr = new ArrayList<String>(attributeList);
                    resultAttr.remove(attrIndex);
                    leafNode = createDT(resultData,resultAttr);
                }
                node.getChildTreeNode().add(leafNode);
                node.getPathName().add(entry.getKey());
            }
        }
        return node;
    }
    
    class TreeNode{
        
    	// 节点属性值
        private String attributeValue;
        // 子节点
        private List<TreeNode> childTreeNode;
        // 
        private List<String> pathName;
        // 
        private String targetFunValue;
        // 节点名称
        private String nodeName;
        
        public TreeNode(String nodeName){
            
            this.nodeName = nodeName;
            this.childTreeNode = new ArrayList<TreeNode>();
            this.pathName = new ArrayList<String>();
        }
        
        public TreeNode(){
            this.childTreeNode = new ArrayList<TreeNode>();
            this.pathName = new ArrayList<String>();
        }

        public String getAttributeValue() {
            return attributeValue;
        }

        public void setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
        }

        public List<TreeNode> getChildTreeNode() {
            return childTreeNode;
        }

        public void setChildTreeNode(List<TreeNode> childTreeNode) {
            this.childTreeNode = childTreeNode;
        }

        public String getTargetFunValue() {
            return targetFunValue;
        }

        public void setTargetFunValue(String targetFunValue) {
            this.targetFunValue = targetFunValue;
        }

        public String getNodeName() {
            return nodeName;
        }

        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
        }

        public List<String> getPathName() {
            return pathName;
        }

        public void setPathName(List<String> pathName) {
            this.pathName = pathName;
        }
        
    }
}