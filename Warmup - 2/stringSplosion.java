public String stringSplosion(String str) {
     String result = "";
     String prefix = "";
     for(int i = 0; i < str.length(); i++) {
       
       result += prefix + str.substring(i,i+1); 
       prefix += str.substring(i,i+1);
    }
     
  return result;

}
/*

Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/
