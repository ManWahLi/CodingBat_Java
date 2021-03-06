/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String extraEnd(String str) 
{
  String result = str.substring(str.length() - 2, str.length());

  result = result + result + result;
  
  return result;
}
