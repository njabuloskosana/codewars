public class Main{

    public static void main(String []args){
       System.out.println("Hello World");
       String str="This websaite is for losers LOL!";
       String newStr="";
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)=='a' || str.charAt(i)=='A')
           {
               
           }
           else if(str.charAt(i)=='i' || str.charAt(i)=='I')
           {
               
           }
           else if(str.charAt(i)=='e' || str.charAt(i)=='E')
           {
               
           }
           else if(str.charAt(i)=='o' || str.charAt(i)=='O')
           {
               
           }
           else if(str.charAt(i)=='U' || str.charAt(i)=='u')
           {
               
           }
           else{
               newStr+=str.charAt(i);
           }
           
       }
       
       System.out.println(newStr);
       
    }
    // best practise solutions
        public static String disemvowelUsingReplaceAll(String str) {
            return str.replaceAll("[aAeEiIoOuU]", "");
        } 

        public static String disemvowelUsingSwitch(String str) {
            // Code away...
            String modified = "";
            for(int i = 0; i<str.length(); i++){
              
              char current = Character.toLowerCase(str.charAt(i));
              switch (current){
                  case 'a':
                    continue;
                  case 'e':
                    continue;
                  case 'i':
                    continue;
                  case 'o':
                    continue;
                  case 'u':
                    continue;
                  default:
                    modified += str.charAt(i);
                  
              }
            }//end of for 
          return modified;
        }
      
}