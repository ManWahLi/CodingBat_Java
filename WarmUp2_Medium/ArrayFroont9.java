/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
The array length may be less than 4.

arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false

@author: Man Wah Li [limanwah0924@gmail.com]
*/

public boolean arrayFront9(int[] nums) 
{
  boolean hasNine = false;
  int runtime = nums.length >= 4 ? 4 : nums.length;
  
  for(int i = 0; i < runtime; i++)
  {
    if(nums[i] == 9)
    {
      hasNine = true;
    }
  }
  
  return hasNine;
}
