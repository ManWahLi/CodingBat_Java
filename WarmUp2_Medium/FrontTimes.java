/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. 
Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String frontTimes(String str, int n) 
{
  int frontLength = 3;
  String result = "";
  String front = "";
  
  front = str.length() > frontLength ? 
          str.substring(0, frontLength) : str.substring(0);
  
  for(int i = 0; i < n; i++)
  {
    result += front;
  }
  
  return result;
}
