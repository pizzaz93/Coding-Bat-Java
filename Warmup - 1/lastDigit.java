public boolean lastDigit(int a, int b) {
 String one = Integer.toString(a);
 String two = Integer.toString(b);
if (one.charAt(one.length()-1) == two.charAt(two.length()-1)){
  return true;
 }
 return false;
}

/*
Given two non-negative int values,
return true if they have the same last digit,
such as with 27 and 57.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
*/
