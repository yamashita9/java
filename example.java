import java.util.Scanner;

public class example {
   public static void main(String[] args){
      System.out.println("mからnまでの整数の和を求める(m<n)\n");
      
      Scanner scan = new Scanner(System.in);

      System.out.println("mの値を入力");
      int m = scan.nextInt();  
      System.out.println("nの値を入力");
      int n = scan.nextInt();

      System.out.printf("求められる式は (%d-%d+1)*(%d+%d)/2 となる\n",n,m,m,n);
      
      int answer = ((n-m+1)*(m+n))/2;

      System.out.printf("答えは %d\n",answer);
  }
}
