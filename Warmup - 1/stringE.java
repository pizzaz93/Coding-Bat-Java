public boolean stringE(String str) {
  int counter = 0;
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'e') {
      counter++;
    }
  
    
  }  
  if (counter > 0 && counter < 4) {
      return true;
    }
    
  return false;
}
/*

Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/
