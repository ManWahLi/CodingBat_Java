/*
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. 
The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String theEnd(String str, boolean front) 
{
  String result = "";
  
  result = front ? result + str.charAt(0) : result + str.charAt(str.length() - 1);
  
  return result;
}
