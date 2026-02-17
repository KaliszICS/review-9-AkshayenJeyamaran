public class PracticeProblem {

   public static void main(String args[]) {

   }
   public static int lettersToFive (String word, char c) {
       int count =0;
       int z=0;
       int a=word.length();
           while (count<5) {
               if (z<a) {
                   if (c==word.charAt(z)) {
                   count=count+1;
                   }
               }
               else {
                   z=-2;
                   count=6;
               }
               z=z+1;
           }
   return z;
   }


   public static int countLetter (String y, char x) {
       int loop=0; 
       int z=0; 
       int a=y.length();
           while (loop<a) {
               if (x==y.charAt(loop)) {
                   z=z+1;
               }
               loop=loop+1;
           }
   return z;
   }
   public static int oddSum (int x, int y) {
       int a=Math.min(x,y);
       int b=Math.max(x,y);
       int sum=0;
       while (a<=b) {
           if (a%2!=0) {
               sum=sum+a;
               a=a+2;
           }
           else{
               a=a+1;
           }
       }
       return sum;
   }
}