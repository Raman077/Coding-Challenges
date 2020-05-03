import java.io.*;
import java.util.*;

public class LIS {
    public static void main(String args[] ) throws Exception{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            int ma = 1;
            int p = sc.nextInt();
            int[] lis = new int[p];
            int[] arr = new int[p];
            for(int j=0;j<p;j++){
                arr[j] = sc.nextInt();
            }
            lis[0]=1;
            for(int m = 1;m<p;m++){
                lis[m]=1;
                for(int ii=0;ii<m;ii++){
                    if(arr[ii]<arr[m] && lis[ii]+1>lis[m]){
                        lis[m]=lis[ii]+1;
//                        System.out.println(arr[m]);
                        ma= Math.max(lis[m],ma);
                    }
                }
            }
            System.out.println(ma);
        }
    }


}
