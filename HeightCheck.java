package Array;

//import java.util.Arrays;

class Solutions {
    public int heightChecker(int[] heights) {
        int min=0;
        int counter=0;
        int[] arr = heights.clone();
        
        for(int i=0; i<heights.length; i++){
             
            min = heights[i];
            for(int j=i+1; j<heights.length; j++){
                if(heights[j]<min) {
                    min = heights[j];
                    heights[j] = heights[i];
                    heights[i] = min;
                }
                
            }
 
        }
        for(int a=0; a<heights.length; a++){
            if(arr[a]!=heights[a])
                counter++;
        }
        //System.out.println(Arrays.toString(heights));
        //System.out.println(Arrays.toString(arr));

        return counter;
    }
}

public class HeightCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] h = {1,1,4,2,1,3};
		Solutions ob = new Solutions();
		int res = ob.heightChecker(h);
		System.out.println(res);

	}

}
