/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. 
This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String withoutX2(String str) 
{
  String result = "";
  
  if(str.length() > 0 && str.charAt(0) != 'x')
  {
    result = result + str.charAt(0);
  }
  
  if(str.length() > 1)
  {
    result = str.charAt(1) != 'x' ? 
             result + str.substring(1) : result + str.substring(2);
  }
           
  return result;
}
