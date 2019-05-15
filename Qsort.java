import java.util.*;
import java.io.*;
import java.lang.*; 
class Qsort
{
public static void main(String args[])
{
int[] arr=new int [10];
float[] far=new float[10]
arr[0]=8;
arr[1]=6;
arr[2]=2;
arr[3]=3;
arr[4]=4;
arr[5]=5;
arr[6]=9;
arr[7]=1;
arr[8]=7;
arr[9]=0;



for (int i=0;i<arr.length;i++)
System.out.println(arr[i]);
sort(arr);
for (int i=0;i<arr.length;i++)
System.out.println(arr[i]);

far[0]=8.0;
far[1]=6.6;
far[2]=2.9;
far[3]=3.5;
far[4]=4.0;
far[5]=5.9;
far[6]=9.1;
far[7]=9.0;
far[8]=7.8;
far[9]=0.8;




System.out.println("for float");
for (int i=0;i<far.length;i++)
System.out.println(far[i]);
fsort(far);
for (int i=0;i<far.length;i++)
System.out.println(far[i]);

} 

}
public static void sort(int arr[])
{
int i,j,left,right,pivot,temp;
Stack<Integer> str=new Stack<Integer>();
Stack<Integer> stl=new Stack<Integer>();
stl.push(0);
str.push(arr.length-1);
while(!str.empty()&&!stl.empty()){
        i=stl.pop();
        j=str.pop();
        left=i;
        right=j;
		
		pivot=(i+j)/2;

 while(i<=j)
        {
            while(arr[i]<arr[pivot])
                i++;
            while(arr[j]>arr[pivot])
                j--;

            if(i<=j)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
				//System.out.println("swaping is done");
                {
                }

                if(left<j){
				                   // Qsort(arr,left,j);
stl.push(left);
str.push(j);
				
				}

                if(right>i){
                   // Qsort(arr,i,right);

stl.push(i);
str.push(right);
}
            }


        }
}
}










public static void fsort(float far[])
{
int i,j,left,right,pivot;
float temp;
Stack<Integer> str=new Stack<Integer>();
Stack<Integer> stl=new Stack<Integer>();
stl.push(0);
str.push(arr.length-1);
while(!str.empty()&&!stl.empty()){
        i=stl.pop();
        j=str.pop();
        left=i;
        right=j;
		
		pivot=(i+j)/2;

 while(i<=j)
        {
            while(far[i]<far[pivot])
                i++;
            while(far[j]>far[pivot])
                j--;

            if(i<=j)
            {
                temp=far[i];
                far[i]=far[j];
                far[j]=temp;
                i++;
                j--;
				//System.out.println("swaping is done");
                {
                }

                if(left<j){
				                   // Qsort(arr,left,j);
stl.push(left);
str.push(j);
				
				}

                if(right>i){
                   // Qsort(arr,i,right);

stl.push(i);
str.push(right);
}
            }


        }
}
}



