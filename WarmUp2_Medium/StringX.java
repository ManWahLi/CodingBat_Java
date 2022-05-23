/*
Given a string, return a version where all the "x" have been removed. 
Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String stringX(String str) 
{
  String result = "";
  
  for(int i = 0; i < str.length(); i++)
  {
    result = !(i > 0 && 
               i < str.length() - 1 && 
               str.substring(i, i + 1).equals("x")) ? 
             result += str.substring(i, i + 1) : result;
  }
  
  return result;
}
