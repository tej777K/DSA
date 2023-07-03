package Divide_and_conqure;

public class MergeSort {

    public static void PrintArr(int arr[]){
        for(int m =0 ; m<arr.length ; m++){
            System.out.print(" "+arr[m]);
        }
    }

    public static void MergeSort(int arr[] , int si , int ei ){
       if(si>=ei){
        return;
       }
       int mid = si +( ei - si )/2;
       MergeSort(arr,si,mid);
       MergeSort(arr, mid+1, ei);
       Merge(arr,si,mid,ei);

    }
    public static void Merge(int arr[],int si , int mid , int ei ){
        int temp[] = new int[ei-si+1];
        int i = si; // for left parrt
        int j = mid + 1 ; //for right part
        int k = 0; // for temp arry

        while(i<=ei && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++; 
            }else{
                temp[k]=arr[j];
                 j++; 
            }
            k++;
        }
        // for left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        // for right part 
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy temp to original array 

        for(k=0 ,i = si;k<temp.length;i++, k++){
                arr[i]=temp[k];
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        MergeSort(arr ,0, arr.length-1);
        PrintArr(arr);
    }
}
 