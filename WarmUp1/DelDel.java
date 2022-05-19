/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. 
Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String delDel(String str) 
{
  String wordsToBeDeleted = "del";
  
  if(str.length() >= 4 && str.substring(1, 4).equals(wordsToBeDeleted))
  {
    str = str.substring(0, 1) + str.substring(4, str.length());
  }
  
  return str;
}
