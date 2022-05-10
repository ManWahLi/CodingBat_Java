/*
Given a string, return true if the string starts with "hi" and false otherwise.
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
*/

public boolean startHi(String str) 
{
  boolean isMatch = false;
  String startWith = "hi";
  
  if(str.length() >= startWith.length())
  {
    if(str.substring(0, startWith.length()).equals(startWith))
    {
      isMatch = true;
    }
  }
  
  return isMatch;
}
