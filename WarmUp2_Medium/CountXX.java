/*
Count the number of "xx" in the given string. 
We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3

@author Man Wah Li [limanwah0924@gmail.com]
*/

public int countXX(String str) 
{
  int count = 0;
  
  for(int i = 0; i < str.length() - 1; i++)
  {
    count = str.substring(i, i + 2).equals("xx") ? ++count : count;
  }
  
  return count;
}
