#include <stdio.h>

int main(){

   long n,r,a,b=1L,c=1L,d;

   printf("nCrの計算を行う\n\nnの値を入力(n>r)");
   scanf("%ld",&n);
   printf("rの値を入力");
   scanf("%ld",&r);

   for(a = 0L; a <= r-1L; a++){
      b = b * (n - a);
   }

   for(a = 0L; a <= r-1L; a++){
      c = c * (r - a);
   }

   d = b / c;

   printf("求められる式は%ld/%ldとなる\n答えは\n%ld\nとなる",b,c,d);

   return 0;
}
