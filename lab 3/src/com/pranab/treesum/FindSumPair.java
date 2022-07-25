package com.pranab.treesum;

import java.util.*;

class FindSumPair {
	
	public Node insert(Node root, int key) {
		
		if (root == null)
			return new Node(key);
		if (key < root.nodeData)
			root.leftNode = insert(root.leftNode, key);
		else
			root.rightNode = insert(root.rightNode, key);
		return root;
	}
	
    public boolean findpairUtil(Node root, int sum)
    
    public void findPairWithGivenSum(Node root, int sum)
	
}