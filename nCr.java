import java.util.Scanner;

public class nCr{
 
  public static void main(String[] args){

     int c,d=1,e=1,n,r;  
     double answer;
  
     System.out.printf("\nnCrの計算を行う(n>r)\n\nnの値を入力\n");
     
     Scanner scan = new Scanner(System.in);

     n = scan.nextInt();
     System.out.println("rの値を入力");
     r = scan.nextInt();
     int a[] = new int[r];
     int b[] = new int[r];

     for ( c = 0; c <= r-1; c++){
        a[c] = n - c;
        d = d * a[c];
     }
      
     for ( c = 0; c <= r-1; c++){
        b[c] = r - c;
        e = e * b[c];
     }

     answer = (double)d/e;

     System.out.printf("答えは %d/%d で %f となる\n",d,e,answer);
  }
}
