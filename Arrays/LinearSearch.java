package Arrays;

// Linear Search in arrays

//1.Q)  Find the given key in the array by Linear Search

import java.util.Scanner;
public class LinearSearch {
     static Scanner k = new Scanner(System.in);  // *** we want the Scanner object in all the functions in the same class
                                                 // use ststic ==>> Where ever the staic meathods and class are there
                                                 // , WE can use there !  *****

    public static void inputt(int[] numbers){
        for (int i=0 ; i<numbers.length;i++){


            numbers[i]=  k.nextInt();
        }
    }
    public static int Search(int numbers[] , int key ){
        for (int i =0 ; i<numbers.length ; i++){
            if(numbers[i] == key ){
                return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
         int numbers[] = {2,4,6,8,10};
        //  System.out.println("Enter the key ELement");
        //  int key = k.nextInt();
        int key = 10;
         inputt(numbers);
        int index = Search(numbers , key);
        System.out.println("The key is at the index :"+index);
    }
}