/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

@author Man Wah Li [limanwah0924@gmail.com]
*/

public boolean endsLy(String str) 
{
  int length = str.length();
  boolean endsly = false;
  
  if(length >= 2 && str.substring(length - 2, length).equals("ly"))
  {
    endsly = true;
  }
  
  return endsly;
}
