/*
Given a string, return a new string where "not " has been added to the front. 
However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String notString(String str) 
{
  String beginsWith = "not";
  String message;
  
  message = (str.length() >= beginsWith.length() &&
            (str.substring(0, beginsWith.length()).equals(beginsWith))) ? 
            str : beginsWith + " " + str;
 
  return message;
}
