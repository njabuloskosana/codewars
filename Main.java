public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    // Your code here
     // for all elements in b , remove them from a
         for(int i=0; i<b.length;i++)
         {
             int originalSize=a.length;
             int numItemsRemoved=0;
             boolean contains=false;
             //
             for(int j=0; j<a.length;j++)
             {
             if(a[j]==b[i])
             {
                 contains=true;
             }
             if(contains==true)
             {
                break;
             }
             
             }
            //
             if(contains==true)
             {

                 for(int j=0;j<a.length;j++)
                 {
                     if(a[j]==b[i])
                     {
                       numItemsRemoved++;
                     }
                 }
                 if(numItemsRemoved!=0)
                 {
                     int newArraySize=originalSize-numItemsRemoved;
                
                      int [] newArr = new int[newArraySize];
                     int index=0;
                     for(int j=0; j<a.length;j++)
                     {
                         if(a[j]!=b[i])
                         {
                             newArr[index]=a[j];
                             index++;
                         }
                         
                     }
                     a= newArr;
                 }
             }
         }
    return a;
  }

}