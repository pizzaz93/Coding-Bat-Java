public String seeColor(String str) {
  String result ="";
  if (str.length() < 4 && !str.equals("red") ) {
    return result;
  }
  if (str.substring(0,3).equals("red")){
    result = "red";
    return result;
  }  
   if (str.substring(0,4).equals("blue")){
    result = "blue";
    return result;
  }
  return result;
}

/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/
