package Arrays;

public class SubArrays {

    public static void SubArr(int arr[]){

        for (int i =0 ; i< arr.length ; i++){
            int start = i;
            for (int j =i ; j< arr.length; j++){
                int end = j;
                System.out.print("SubArrays are :");
                for (int k = start ; k<=end ; k++ ){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        SubArr(arr);
    }
}
