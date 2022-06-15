/*
Given two strings, append them together (known as "concatenation") and return the result. 
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String conCat(String a, String b) 
{
  String result = "";
  
  result = a.length() > 0 && 
           b.length() > 0 &&
           a.charAt(a.length() - 1) == b.charAt(0) ?
           a.substring(0, a.length() - 1) + b : a + b;
           
  return result;
}
