public boolean startHi(String str) {
  if (str.length() < 2) {
    return false;
  }
  if (str.substring(0,2).equals("hi")) {
    return true;
  }
  return false;
}
/*

Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
*/
