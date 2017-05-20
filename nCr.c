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
