/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false

@author Man Wah Li [limanwah0924@gmail.com]
*/

public boolean mixStart(String str) 
{
  boolean isMix;
  
  isMix = (str.length() >= 3) && (str.substring(1, 3).equals("ix")) ? true : false;
  
  return isMix;
}
