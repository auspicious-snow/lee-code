package org.snow.auspicious.leecode.solution;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一个 N 叉树，找到
 * 其最大深度。
 *
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 *
 * N 叉树输入按层序遍历序列化表示，每组子节点由空值分隔
 */
public class maxDepth {
    public static void main(String[] args) {

    }
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int max = 0;
        for(Node node : root.children){
            max = Math.max(maxDepth(node),max);
        }
        return max + 1;
    }

    public int maxDepth2(Node root) {
        if(root == null)
            return 0;
        if(root.children.size() == 0)
            return 1;
        int depth = 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            //如果不为空
            depth++;
            //获取当前queue的长度
            int size = queue.size();
            //循环是要将这一层的node 全部消费完
            while(size>0){
                Node node = queue.poll();
                if(node.children.size()>0){
                    queue.addAll(node.children);
                }
                size --;
            }



        }
        return depth;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

}
