/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String frontBack(String str) 
{
  if(str.length() > 1)
  {
    str = str.charAt(str.length() - 1) + 
          str.substring(1, str.length() - 1) + 
          str.charAt(0);
  }
  
  return str;
}
