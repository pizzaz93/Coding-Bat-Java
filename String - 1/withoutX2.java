public String withoutX2(String str) {
  String result = "";
  if (str.length() < 1 || str.equals("x")) {
    return result;
  }
  if (str.substring(0,1).equals("x") && str.substring(1,2).equals("x")) {
    result = str.substring(2);
  }
    if (str.substring(0,1).equals("x") && !str.substring(1,2).equals("x")) {
    result = str.substring(1);
  }
  
    if (!str.substring(0,1).equals("x") && str.substring(1,2).equals("x")) {
    result = str.substring(0,1) + str.substring(2);
  }
    if (!str.substring(0,1).equals("x") && !str.substring(1,2).equals("x")) {
    result = str;
  }

  return result;
}
/*


Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"

*/
