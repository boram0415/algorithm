import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int arr[] = new int[Integer.parseInt(br.readLine())];
	      StringTokenizer st = new StringTokenizer(br.readLine());
	      int i=0;
	      float nums[] = new float[arr.length];
	      float sum =0.0F;
	      while(st.hasMoreTokens()) {
	    	  arr[i++] = Integer.parseInt(st.nextToken());
	      }
	      Arrays.sort(arr);
	      for(i=0 ; i < arr.length;i++) {
	    	  nums[i]= ( ((float)arr[i]) / ((float)arr[arr.length-1]) ) * 100;
	    	  sum+=nums[i];
	      }
	      System.out.println(sum / arr.length);
	}
}