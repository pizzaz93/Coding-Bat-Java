public String startWord(String str, String word) {
  String nope = "";
  if (word.length() > str.length()) {
    return nope;
  }
  
  if (word.equals(str.substring(0,word.length() -1))) {
    return str.substring(0,word.length());
  }
  if(!word.substring(1).equals(str.substring(1,word.length() ))){
     return nope;
  }

  return str.substring(0,word.length());
}

/*

Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"

*/
