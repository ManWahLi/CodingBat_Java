/*
Given a string, return true if the string starts with "hi" and false otherwise.
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
*/

public boolean startHi(String str) 
{
  boolean isMatch = false;
  String start = "hi";
  
  if(str.length() >= start.length())
  {
    if(start.equals(str.substring(0, start.length())))
    {
      isMatch = true;
    }
  }
  
  return isMatch;
}
