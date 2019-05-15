import java.util.*;

 
 
 
 
 public class  tre {

	  tre left;
	  tre right;
	 int  value;

	public  tre( int  v) {
	   value = v;
	  }



	 public void  preorder() { 
	  System.out.print(" ");
	   System.out.println(value);
	  
	 if (left != null ) left.preorder();
	 if (right != null ) right.preorder();
	  }




	 public void  inorder() {
		
	 if (left != null ) left.inorder();
	   System.out.println(" "+value);
	 if (right != null ) right.inorder();
	  }

	  
	  
	  
	 public void  postorder() {
		
	 if (left != null ) left.postorder();
	 if (right != null ) right.postorder();
	   System.out.println(" "+value);
	  }


	 public static void  main(String args[])
	  {
       int n=10,i,k;
       
       System.out.println("ENTER NO OF NODES:");
       Scanner scan= new Scanner(System.in);
       n=scan.nextInt();
       n++;
	   tre[] b = new  tre[n];
	   
		b[0] =new  tre(0);
	   System.out.println("KINDELY ENTER VALUES OF EACH NODE:");
	   for(i=1;i<n;i++){
	    k=scan.nextInt();   
	   	b[i] =new  tre(k);
	   }
	   for(i=1;i<(n+1)/2;i++)
	   {
		
		b[i].left=b[2*i];
		if(2*i+1<n)
		b[i].right=b[2*i+1];   
	   }
	   
	   
	   
	  

	
	   System.out.println("preorder traversal");
	   b[1].preorder();
	 
	System.out.println( "inorder traversal" );
	b[1].inorder();
	
	
	   System.out.println("postorder traversal");
	   b[1].postorder();

	  }
	}

