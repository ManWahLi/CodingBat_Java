/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String withoutX(String str) 
{
  String result = str;
  
  if(str.length() > 0 && str.charAt(0) == 'x')
  {
    result = str.substring(1);
  }
  
  if(result.length() > 0 && result.charAt(result.length() - 1) == 'x')
  {
    result = result.substring(0, result.length() - 1);
  }
  
  return result;
}
