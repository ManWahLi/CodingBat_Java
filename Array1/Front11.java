/*
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. 
If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]

@author Man Wah Li [limanwah0924@gmail.com]
*/

public int[] front11(int[] a, int[] b) 
{
  int[] result;
  
  if (a.length == 0 && b.length == 0)
  {
    result = new int[0];
  }
  else if (a.length == 0 || b.length == 0)
  {
    result = new int[1];
    result[0] = a.length == 0 ? b[0] : a[0];
  }
  else
  {
    result = new int[] {a[0], b[0]};
  }
  
  return result;
}
