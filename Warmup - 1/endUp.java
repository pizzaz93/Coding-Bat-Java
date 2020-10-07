public String endUp(String str) {
  if (str.length() < 3){
    return str.toUpperCase();
  }
  String capital = str.substring(str.length()-3);
  capital = capital.toUpperCase();
  String regular = str.substring(0, str.length()-3);
  return regular + capital;
}
/*

Given a string, return a new string where the last 3 chars are now in upper case. 
If the string has less than 3 chars, uppercase whatever is there. 


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
*/
