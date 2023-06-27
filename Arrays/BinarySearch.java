package Arrays;

public class BinarySearch {

    public static int Search(int[] num , int key ){
        int start = 0;
        int end  = num.length -1;
        while (start<=end) {
            int mid = (start + end) / 2;
            if(num[mid]==key){
                return mid;
            }
           else if (num[mid] > key) {
                end = mid - 1;
            } else if (num[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int num[] = {2,6,8,10,12,14};
        int key = 14;
        int index = Search( num, key);
        System.out.println("The key element is found at the index : "+index);

    }
}
