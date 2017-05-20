/* MIT License

Copyright (c) 2017 yamashita9

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

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
