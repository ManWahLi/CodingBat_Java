/*
Given a string, return a version without the first 2 chars. 
Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String deFront(String str) 
{    
  String result = "";
  int length = str.length();
  
  result = length > 0 && str.charAt(0) == 'a' ? "a" : result;
  result = length > 1 && str.charAt(1) == 'b' ? result + "b" : result;
  result = length > 2 ? result + str.substring(2) : result;
  
  return result;
}
