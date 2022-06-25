/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String withoutX(String str) 
{
  String result = "";
  int length = str.length();
  
  if(length > 0)
  {
    result = str.charAt(0) == 'x' ? str.substring(1) : str;
  }
  
  if(length > 1)
  {
    result = str.charAt(length - 1) == 'x' ?
             result.substring(0, result.length() - 1) : result;
  }
  
  return result;
}
