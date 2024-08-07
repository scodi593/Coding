import java.util.*;
public class Test2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < 10; i++) {
            a[i] = s.nextInt();
        }
        if(k<0 || k>=n){
        int l = a[n-1];
        for(int i=n-2;i>=0;i--){
            a[i+1]=a[i];
        }
        a[0]=l;

        }
    }
}
