import java.util.*;
import java.io.*;
import java.lang.*;
class stack1
{
    int top=-1;
    int data[];
   public stack1(int n)
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
    public static void Qsort(int arr[],int left,int right)
    {
        int i,j;
       // stack1 st;
        int pivot,k,temp;
		k=arr[(left+right)/2];
		pivot=k;
       /* st=new stack1(pivot);

        st.push(left);
        st.push(right);


        i=st.pop;
        j=st.pop;*/
        
        i=left;
        j=right;

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
                {
                }

                if(left<j)
                    Qsort(arr,left,j);
                if(right>i)
                    Qsort(arr,i,right);
            }


        }

    }
}
class quick
{
    public static void main(String args[])
    {
        int n,ca;
        //Quick_sort Q=new Quick_Sort();
        System.out.println("enter the no of elements");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        int arr[]=new int [n];
        float arrf[]=new float[n];
        String arrs[]= new String [n+1];
        System.out.println("1.Integer/Float");
        System.out.println("2.String/Character");
        System.out.println("enter the no of element");
       // Scanner scanner = new Scanner(System.in);
        ca=scanner.nextInt();

        switch(ca)
        {

        case 1:
            System.out.println("enter elements");
            for(int i=0; i<n; i++)
            {
               
                arr[i]=scanner.nextInt();
            }
            
            
            Quick_sort.QSort(arr, 0 , (arr.length-1));
            System.out.print("\n Sorted Array: ");
            for (int c = 0 ; c < arr.length  ; c++)
            {
                System.out.print(" " + arr[c]);
            }

            break;

        case 2:
            break;
        default:
            System.out.println("wrong choise");
        }






    }





}
