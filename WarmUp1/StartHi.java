/*
Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false

@author Man Wah Li [limanwah0924@gmail.com]
*/

public boolean startHi(String str) 
{
  boolean isMatch;
  String startWith = "hi";
  
  isMatch = (str.length() >= startWith.length()) &&
            (str.substring(0, startWith.length()).equals(startWith)) ? true : false;

  return isMatch;
}
