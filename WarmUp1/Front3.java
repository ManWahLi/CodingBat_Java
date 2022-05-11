/*
Given a string, we'll say that the front is the first 3 chars of the string. 
If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
*/

public String front3(String str) 
{
  int front = 3;
  String newString = "";
  
  if(str.length() > 3)
  {
    for(int i = 0; i < front; i++)
    {
      newString += str.substring(0, front);
    }
  }
  else
  {
    for(int i = 0; i < front; i++)
    {
      newString += str.substring(0, str.length());
    }
  }
  
  return newString;
}
