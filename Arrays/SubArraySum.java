package Arrays;

public class SubArraySum {
    public static void SubarrSum(int arr[]){
        int Sum = 0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i =0 ; i< arr.length ; i++){
            int start = i;
            for (int j =i ; j< arr.length; j++){
                int end = j;
                Sum=0;
                System.out.print("SubArrays are :");
                for (int k = start ; k<=end ; k++ ){
                    System.out.print(arr[k]+" ");
                    Sum+=arr[k];
                    if(Sum>max){
                        max=Sum;
                    } else if (Sum<min) {
                        min = Sum;
                    }
                }
                System.out.print(" ==> Sum of the Sub array is: "+Sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The MAX sum of one of these array is "+max);
        System.out.println("The MIN sum of one of these array is  "+min);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        SubarrSum(arr);
    }
}


//Here the Brutforce meathod is Worst case (For calc Sum) haveing the Time Complexity of TC(n^3)==>(becoz of 3 for loops)
//Therefore WE move to optimaize solution i.e "Prefix Sum" >> TC(n^2)