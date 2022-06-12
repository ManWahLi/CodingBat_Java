/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". 
The string may be any length, including 0. Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false

@author Man Wah Li [limanwah0924@gmail.com]
*/

public boolean hasBad(String str) 
{
  boolean hasBad = false;
  
  if(str.length() >= 3)
  {
    for(int i = 0; i < 2 && i < str.length() - 2 && !hasBad; i++)
    {
      hasBad = str.substring(i, i + 3).equals("bad") ? true : false;
    }
  }
  
  return hasBad;
}