/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
*/

public int sumDouble(int a, int b) 
{
  int sum;
  
  sum = a == b ? (a + b) * 2 : a + b;
  
  return sum;
}