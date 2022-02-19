public class Maskify {
    public static String maskify(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
       if(str.length()<=4)
        {
        return str;
      }
      else
        {
        int numCharToMask=str.length()-4;
        String maskedString="";
        for(int i=0;i<str.length();i++){
          if(i>=numCharToMask)
            {
             maskedString+=str.charAt(i);
          }
          else
            {
            maskedString+="#";
          }
          
        }
        return maskedString;
      }
    
    }
}

/* Quicker solution

public static String maskify(String str) {
        if (str.length() <= 4) return str;
        String result = "";
        for (int i = 0; i < str.length()-4; i++) {
            result += "#";
        }
        return result + str.substring(str.length()-4);
    }

    

*/