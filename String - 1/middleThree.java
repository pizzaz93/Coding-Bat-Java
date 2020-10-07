public String middleThree(String str) {
  int beginning = str.length() / 2 - 1;
  String stringy = str.substring(beginning, beginning + 3 );
  return stringy;
}


/*

Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
*/
