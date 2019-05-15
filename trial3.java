import java.util.*;
import java.io.*;
import java.lang.*;
class stack1
{
int top=-1;
int data[];
stack1(int n)
{
data=new int[n];
}
int pop()
{
int x;
if(top>=0)
{
x=data[top];
top--;
return x;
}
else return -1;
}
void push(int x)
{
top++;
data[top]=x;
}
}
class Quick_sort
{
    static Scanner in = new Scanner(System.in);
    public int lowerBound, upperBound;
    static int counter = 0;
    static stack1 st;
    public static int qSortAlgo2(float[] list, int lowerLimit, int upperLimit)
	{
		int select,i,j;
		float temp=0;
		if(lowerLimit < upperLimit)
		{
			select = lowerLimit;
			int k=(((lowerLimit+upperLimit)/2)+1);
			st=new stack1(k);
			st.push(lowerLimit);
			st.push( upperLimit);
			 j=st.pop();
		                     i= st.pop();
			//System.out.println(i+"\t"+j);

			while(i < j)
			{
				counter++;
				while(list[i] <= list[select] && i < upperLimit)
					i++;
				while(list[j] > list[select])
					j--;
				if(i < j){
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				               }
			}
			temp = list[select];
			list[select] = list[j];
			list[j] = temp;
			qSortAlgo2(list, lowerLimit, j-1);
			qSortAlgo2(list, j+1, upperLimit);
		}
		return counter;
	}
	public static int qSortAlgo(int[] list, int lowerLimit, int upperLimit)
	{
		int select,i,j;
		int temp=0;
		if(lowerLimit < upperLimit)
		{
			select = lowerLimit;
			int k=(((lowerLimit+upperLimit)/2)+1);
			st=new stack1(k);
			st.push(lowerLimit);
			st.push( upperLimit);
			 j=st.pop();
		                     i= st.pop();
			//System.out.println(i+"\t"+j);

			while(i < j)
			{
				counter++;
				while(list[i] <= list[select] && i < upperLimit)
					i++;
				while(list[j] > list[select])
					j--;
				if(i < j){
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				               }
			}
			temp = list[select];
			list[select] = list[j];
			list[j] = temp;
			qSortAlgo(list, lowerLimit, j-1);
			qSortAlgo(list, j+1, upperLimit);
		}
		return counter;
	}

    public static int qSortAlgo1(String[] list, int lowerLimit, int upperLimit){
		int select,i,j;
		String temp;
		if(lowerLimit < upperLimit)
		{
			select = lowerLimit;
			int k=(((lowerLimit+upperLimit)/2)+1);
			st=new stack1(k);
			st.push(lowerLimit);
			st.push( upperLimit);
			j=st.pop();
		                    i= st.pop();
			//System.out.println(i+"\t"+j);

			while(i < j)
			{	counter++;
				while((list[i].compareTo(list[select])<=0)&&(i<upperLimit))
					i++;
				while(list[j].compareTo(list[select])>0)
					j--;
				if(i < j){
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				             }
			}
			temp = list[select];
			list[select] = list[j];
			list[j] = temp;
			qSortAlgo1(list, lowerLimit, j-1);
			qSortAlgo1(list, j+1, upperLimit);
		}
		return counter;
	}
}


class trial3
{
    public static void main(String args[]) throws IOException
    {
        int n,n1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers u want to quick sort?");
        n=scanner.nextInt();
        n1=n+1;
        int list[]= new int[n];
        String list1[]=new String[n1];
        float list2[]= new float[n];
       // System.out.println("How do u wish to Quick Sort a List?");
        System.out.println("1.Integer or Float");
        System.out.println("2.String or Character");
        int ch,counter;
        ch=scanner.nextInt();
        switch(ch)
        {
        case 1:
            for(int i=0;i<n;i++)
        {
            System.out.println("enter element"+(i+1));

            list[i]=scanner.nextInt();
        }
        counter = Quick_sort.qSortAlgo(list, 0 , list.length - 1);
         System.out.print("\n Sorted Array: ");
			 for (int c = 0 ; c < list.length  ; c++){
				 System.out.print(" " + list[c]);
			 }
			 System.out.println("\n No. of Comparisons : " + counter);
        break;

       case 2:
             System.out.println("enter string");
             for(int i=0;i<n1;i++)
        {
            list1[i]=scanner.nextLine();
        }
        counter = Quick_sort.qSortAlgo1(list1, 0 , list1.length - 1);
         System.out.print("\n Sorted Array: ");
			 for (int c = 0 ; c < list1.length  ; c++){
				 System.out.print(" " + list1[c]);
			 }
			 System.out.println("\n No. of Comparisons : " + counter);
        break;

           case 3:
          for(int i=0;i<n;i++)
        {
            System.out.println("enter element"+(i+1));

            list2[i]=scanner.nextFloat();
        }
        counter = Quick_sort.qSortAlgo2(list2, 0 , list2.length - 1);
         System.out.print("\n Sorted Array: ");
			 for (int c = 0 ; c < list2.length  ; c++){
				 System.out.print(" " + list2[c]);
			 }
			 System.out.println("\n No. of Comparisons : " + counter);
        break;

        default: System.out.println("wrong choice entered");
	   break;
        }
    }
}
