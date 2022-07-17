/*
    
Given an int array of any length, return a new array of its first 2 elements. 
If the array is smaller than length 2, use whatever elements are present.

frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]

@author Man Wah Li [limanwah0924@gmail.com]
*/

public int[] frontPiece(int[] nums) 
{
  int[] result = new int[0];
  
  if(nums.length > 0)
  {
    result = new int[]{nums[0]};
  }
  
  if(nums.length > 1)
  {
    result = new int[]{nums[0], nums[1]};
  }
  
  return result;
}
