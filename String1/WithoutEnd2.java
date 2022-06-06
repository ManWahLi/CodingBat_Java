/*
Given a string, return a version without both the first and last char of the string. 
The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String withouEnd2(String str) 
{
  String result = "";
  
  if(str.length() > 2)
  {
    result = str.substring(1, str.length() - 1);
  }
  
  return result;
}
