public String withoutX(String str) {
  String result = "";
  if (str.length() < 1 || str.equals("x")) {
    return result;
  }
  if (str.substring(0,1).equals("x") && str.substring(str.length()-1).equals("x")) {
    result = str.substring(1,str.length()-1);
  }
    if (str.substring(0,1).equals("x") && !str.substring(str.length()-1).equals("x")) {
    result = str.substring(1);
  }
  
    if (!str.substring(0,1).equals("x") && str.substring(str.length()-1).equals("x")) {
    result = str.substring(0,str.length()-1);
  }
    if (!str.substring(0,1).equals("x") && !str.substring(str.length()-1).equals("x")) {
    result = str;
  }

  return result;
}
/*


Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"

*/
