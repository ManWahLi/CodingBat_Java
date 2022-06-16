/*
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String lastTwo(String str) 
{
  String result = "";
  int length = str.length();
  
  // Adding the last char to the variable.
  if(length > 0)
  {
    result = result + str.charAt(length - 1);
  }
  
  // Concatenate the front part and the second last char of string to the variable.
  if(length >= 2)
  {
    result = str.substring(0, length - 2) + result + str.charAt(length - 2);
  }
  
  return result;
}
