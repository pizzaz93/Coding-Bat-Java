public boolean hasBad(String str) {
  if (str.length() < 3){
    return false;
  }
  if (str.length() == 3) {
    if (str.equals("bad")) {
      return true;
    }
    return false;
  }
  String indexOne = str.substring(0,3);
  String indexTwo = str.substring(1,4);
  if (indexOne.equals("bad") || indexTwo.equals("bad")) {
    return true;
  }
  return false;
}
/*

Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
*/
