package Arrays;

public class TrappingWater {

 public static void Trapwater(int height[]){
    int waterLevel=0;
    int n = height.length;
    int trappedRainWater = 0; 
    int leftmaxBoundary[] = new int[height.length];
    int rightmaxBoundary[] = new int[height.length];

     leftmaxBoundary[0]=height[0];
  
     // To calculate The leftmost Max boundary 

    for( int i =1 ; i<height.length ; i++){
        leftmaxBoundary[i]=Math.max(leftmaxBoundary[i-1], height[i]);
    }    

//To calculae the Right most MAx Boundary 

    rightmaxBoundary[n-1]=height[n-1];
for(int i = n-2 ; i>=0 ; i--){
    rightmaxBoundary[i] = Math.max(rightmaxBoundary[i+1], height[i]);
}

for(int k =0 ; k<n ; k++){
    waterLevel = Math.min(rightmaxBoundary[k], leftmaxBoundary[k]);
    trappedRainWater += waterLevel - height[k];
}

System.out.println("The TRapped Rain WAter is :"+trappedRainWater);


 }

    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        Trapwater(arr);
    }
}
