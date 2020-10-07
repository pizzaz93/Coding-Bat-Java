public String fizzString(String str) {
  String begin = str.substring(0,1);
  String end = str.substring(str.length()-1);
  String fi = "Fizz";
  String bu = "Buzz";
  String f = "f";
  String b = "b";
  
  if (begin.equals(f) && end.equals(b)) {
    return fi + bu;
  }
  
   if (begin.equals(f) && !end.equals(b)) {
    return fi;
   }
  
  if (!begin.equals(f) && end.equals(b)) {
    return bu;
  }
  
  return str;
}
/*

Given a string str, if the string starts with "f" return "Fizz". 
If the string ends with "b" return "Buzz".
If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
*/
