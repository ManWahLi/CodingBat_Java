/*
Given 2 int values, return true if one is negative and one is positive. 
Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true

@author Man Wah Li [limanwah0924@gmail.com]
*/

public boolean posNeg(int a, int b, boolean negative) 
{
  boolean isNegative;
  
  if(negative)
  {
    isNegative = a < 0 && b < 0 ? true : false;
  }
  else
  {
    isNegative = (a < 0 && b > 0) || (a > 0 && b < 0) ? true : false;
  }
  
  return isNegative;
}
