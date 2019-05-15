import java.util.*;  
  
public class pre {  
  
   
 public static class TreeNode  
 {  
  int data;  
  TreeNode left;  
  TreeNode right;  

  TreeNode(int data)  
  {  
   this.data=data;  
  }  
 }  
    
 public void preorder(TreeNode root) {  
    if(root !=  null) {      
      System.out.printf("%d ",root.data);  
      preorder(root.left);  
      preorder(root.right);  
    }  
  }  

 public void postOrder(TreeNode root) {  
  if(root !=  null) {  
   postOrder(root.left);  
   postOrder(root.right);      
   System.out.printf("%d ",root.data);  
  }  
 }
  
 public void inOrder(TreeNode root) {  
  if(root !=  null) {  
   inOrder(root.left);      
   System.out.printf("%d ",root.data);  
   inOrder(root.right);  
  }  
 }    
   
 public static void main(String[] args)  
 { 
 Scanner inp=new Scanner (System.in); 
  pre bi=new pre();  
  // Creating a binary tree  
  TreeNode rootNode=createBinaryTree();  
  System.out.println("postorder:");  
  bi.postOrder(rootNode);
  System.out.println("\npreorder:");
  bi.preorder(rootNode);
  System.out.println("\ninorder:");
  bi.inOrder(rootNode);
 
 }  
   
 public static TreeNode createBinaryTree()  
 {  
  TreeNode rootNode =new TreeNode(4);

  TreeNode node5=new TreeNode(5);  
  TreeNode node6=new TreeNode(6);  
  TreeNode node4=new TreeNode(4);  
  TreeNode node7=new TreeNode(7);  
  TreeNode node8=new TreeNode(8);  
  TreeNode node10=new TreeNode(10);
  TreeNode node12=new TreeNode(12);
    
  rootNode.left=node5;  
  rootNode.right=node6;  
    
  node5.left=node4;  
  node5.right=node7;  
    
  node6.left=node8;  
  node6.right=node10;

  node10.left=node12;  
    
  return rootNode;
  
 }  
}  
