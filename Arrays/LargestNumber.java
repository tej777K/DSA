package Arrays;


public class LargestNumber {


    public static int Find(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i =0; i<num.length  ; i++){
              if(num[i]>largest){
                  largest=num[i];
              } else if (num[i]<smallest) {
                 smallest=num[i];
              }
        }
        System.out.println("THE smallest number of the array is "+smallest);
        return largest;
    }


    public static void main(String[] args) {

        int num[] = {4,7,10,23,3};
        int lar = Find(num);
        System.out.println("The Largest element in the array is "+lar);

    }

}
