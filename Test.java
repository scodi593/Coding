import java.util.*;
class Test{
    /**
     * 
     */
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] =new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int max = Integer.MIN_VALUE,result=0;
        for (int idx = 0; idx < a.length; idx++) {
            for (int j = idx+1; j < a.length; j++) {
                result = result +(a[idx]+a[j]);
                if(result>max){
                    max = result;
                    System.out.print(max);
                }
            }
            
        }
    }
}
