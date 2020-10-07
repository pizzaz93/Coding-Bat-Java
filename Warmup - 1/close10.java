public int close10(int a, int b) {
  int aOrig = a;
  int bOrig = b;
  int tie = 0;
  int counterOne = 0;
  int counterTwo = 0;
  boolean changed = false;
  boolean changeb = false;
  
  if (a > 10) {
    while (a != 10){
      a--;
      counterOne++;
      changed = true;
    }
  }
  else if (a < 10 && !changed){
    while (a != 10){
      a++;
      counterOne++;
    }
  }
  
  if (b > 10){
    while (b != 10){
      b--;
      counterTwo++;
      changeb = true;
    }
  }
  else if (b < 10 && !changeb){
    while (b != 10){
      b++;
      counterTwo++;
    }
  }
  
  if (counterOne < counterTwo) {
    return aOrig;
  }
  
   if (counterOne > counterTwo) {
    return bOrig;
  }
  
   if (counterOne == counterTwo) {
    return tie;
  }
  return tie;
}
/*

Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
*/
