public String deFront(String str) {    
  String result = "";
  if (str.substring(1,2).equals("b") && str.substring(0,1).equals("a")) {
    result = str;
    return result;
  }
    if (str.substring(1,2).equals("b") && !str.substring(0,1).equals("a")) {
    result = str.substring(1);
    return result;
  }
    if (!str.substring(1,2).equals("b") && str.substring(0,1).equals("a")) {
    result = "a" + str.substring(2);
    return result;
  }
  result = str.substring(2);
  return result;
}
/*

Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"


*/
