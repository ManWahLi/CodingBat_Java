/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". 
If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String lastChars(String a, String b) 
{
  String result = "";
  
  result = a.length() == 0 ? "@" : result + a.charAt(0);
  result = b.length() == 0 ? result + "@" : result + b.charAt(b.length() - 1);
  
  return result;
}
