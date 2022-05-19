/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

@author Man Wah Li [limanwah0924@gmail.com]
*/

public boolean doubleX(String str) 
{
  int i = str.indexOf("x");
  
  String x = i != -1 ? str.substring(i) : "";
  
  return x.startsWith("xx");
}
