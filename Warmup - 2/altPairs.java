public String altPairs(String str) {
  String stri = "";
  for (int i = 0; i < str.length(); i ++) {
    if (str.substring(i).length() < 2){
      stri += str.substring(i);
      return stri;
    } 
    stri += str.substring(i,i+2);
    i = i +3;
  }
  return stri;
}
/*

Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"

*/
