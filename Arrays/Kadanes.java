package Arrays;

// public class Kadanes {

// public static void Kadanes(int arr[]){
//     int currentSum =0;
//     int MaxSum = Integer.MIN_VALUE;

//     for(int i =0 ; i< arr.length ; i++){
//         currentSum+=arr[i];
//         if(currentSum<0){
//             currentSum=0;
//         }
//         MaxSum = Math.max(MaxSum, currentSum);
//     }
//     System.out.println("The max sum of the sub array is: "+MaxSum);
// }

//     public static void main(String[] args) {
//         int arr[] = {-2,-3,4,-1,-2,1,5,-3};
//         Kadanes(arr);
//     }
// }


//Q2)   // Not properlly Solved The min sum Should come ==>> -1 

// public class Kadanes{

//    public static void k(int a[]){
//          int cs =0;
//          int max =Integer.MIN_VALUE;
//           for(int i =0 ; i<a.length ; i++){
//             cs = cs + a[i];
//             if(cs>0){
//                 cs=0;
//             }
//           }
//           max =Math.min(max, cs);
//           System.out.println("The max Sun=m of thr sub array is :"+max);
//    }

//     public static void main(String[] args) {
//         int a[] = {-1,-2,-3,-4};
//         k(a);
//     }

// }