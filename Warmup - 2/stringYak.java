public String stringYak(String str) {
  String cleanup  = str;
  for (int i = 0; i < str.length(); i++) {

      if (str.substring(i,i + 3).equals("yak")) {
       
             cleanup = cleanup.replace("yak","");
             return cleanup;
      }
         
  }
  return str;
}
/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
*/