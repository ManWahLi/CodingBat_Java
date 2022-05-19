/*
Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3

@author Man Wah Li [limanwah0924@gmail.com]
*/

public int intMax(int a, int b, int c) 
{
  return Math.max(Math.max(a, b), Math.max(b, c));
}
