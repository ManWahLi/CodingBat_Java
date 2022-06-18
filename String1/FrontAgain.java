/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true

@author Man Wah Li [limanwah0924@gmail.com]
*/

public boolean frontAgain(String str) 
{
  int length = str.length();
  boolean frontAgain;
  
  frontAgain = length >= 2 &&
               str.substring(0, 2).equals(str.substring(length - 2)) ?
               true : false;
               
  return frontAgain;
}
