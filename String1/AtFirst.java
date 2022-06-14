/*
Given a string, return a string length 2 made of its first 2 chars. 
If the string length is less than 2, use '@' for the missing chars.

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String atFirst(String str) 
{
  String result = "";
  
  if(str.length() >= 2)
  {
    result = str.substring(0, 2);
  }
  else
  {
    result = str.length() == 0 ? "@@" : str.charAt(0) + "@" ;
  }
  
  return result;
}
