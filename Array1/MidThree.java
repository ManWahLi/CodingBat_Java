/*
Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. 
The array length will be at least 3.

midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]

@author Man Wah Li [limanwah0924@gmail.com]
*/

public int[] midThree(int[] nums) 
{
  int length = nums.length;
  int[] result = new int[]{nums[length / 2 - 1], nums[length / 2], nums[length / 2 + 1]};
  
  return result;
}
