/*
Start with 2 int arrays, a and b, of any length. 
Return how many of the arrays have 1 as their first element.

start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1

@author Man Wah Li [limanwah0924@gmail.com]
*/

public int start1(int[] a, int[] b) 
{
  int count = 0;
  
  for(int i = 0; i < a.length; i++)
  {
    count = a[i] == 1 ? ++count : count;
  }
  
  for(int i = 0; i < b.length; i++)
  {
    count = b[i] == 1 ? ++count : count;
  }
  
  return count;
}
