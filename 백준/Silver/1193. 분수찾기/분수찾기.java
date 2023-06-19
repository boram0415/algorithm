import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(bf.readLine());
        int sum=0,temp =0,index=0;
        while (true){
            index++;
            sum = index*(index+1)/2;
            if (nums <= sum) {
                break;
            }
        }
        temp = nums-(index-1)*index/2 ;
        if (index % 2 != 0) {
            System.out.printf("%d/%d",index-temp+1,temp);
        }else{
            System.out.printf("%d/%d",temp,index-temp+1);
        }
    }
}