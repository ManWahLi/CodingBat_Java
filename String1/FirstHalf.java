/*
Given a string of even length, return the first half. 
So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String firstHalf(String str) 
{
  return str.substring(0, str.length() / 2);
}
