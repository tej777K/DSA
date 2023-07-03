package Divide_and_conqure;

import java.util.Random;
import java.util.Scanner;


public class MergeLab2{

    static final int MAX =10005;
    static int a[] = new int[MAX];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******MERGE SORT******");
        System.out.println("ENter the Size of the array ");
        int n = sc.nextInt();
        // Random random = new Random();
        System.out.println("ENter the values of arrays ");
        for(int i=0 ; i<n ; i++){
            a[i]=sc.nextInt();
            // a[i]=random.nextInt(1000);     
           }
     
        long startTime = System.nanoTime();
        MergeSortAlgorithm(0,n-1);
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime ;
        System.out.println("The time complexity (ms) for n :"+n+"is :"+(double)elapsedTime/1000000);
          
        System.out.println("The Sorted Array (Mearg Sort) :");
        for( int i=0 ; i< n ; i++)
            System.out.print(a[i]+" ");
            sc.close();
        }
        
        public static void MergeSortAlgorithm(int low , int high){
            int mid ;
            if(low < high ){
                mid = (low + high)/2;
                MergeSortAlgorithm(low, mid);
                MergeSortAlgorithm(mid + 1, high);
                Merge(low , mid , high );
            }
        }

        public static void Merge(int low , int mid , int high){
            int temp[] = new int[MAX];
            int i ,j ,h , k;
            i=h=low;
            j=mid+1;

            while((h<=j)&&(j<=high))
                if(a[h]<a[j])
                    temp[i++]=a[h++];
                else
                temp[i++]=a[j++];

                if(h>mid)
                    for(k=j;k<=high;k++)
                    temp[i++]=a[k];
                else
                  for(k=low ; k<=mid ;k++)
                  temp[i++]=a[k];

                  for(k=low ; k<=high ; k++)
                    a[k]=temp[k];
                  
            
        

    }
}

