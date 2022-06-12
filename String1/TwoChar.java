/*
Given a string and an index, return a string length 2 starting at the given index. 
If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.

twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String twoChar(String str, int index) 
{
  String result = "";
  
  result = index <= str.length() - 2 && index > 0 ? 
           str.substring(index, index + 2) : str.substring(0, 2);
           
  return result;
}