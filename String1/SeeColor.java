/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String seeColor(String str) 
{
  String result = "";
  
  result = str.length() >= 3 && str.substring(0, 3).equals("red") ? "red" : result;
  result = str.length() >= 4 && str.substring(0, 4).equals("blue") ? "blue" : result;
  
  return result;
}
