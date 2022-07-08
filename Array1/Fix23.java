/*
Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]

@author Man Wah Li [limanwah0924@gmail.com]
*/

public int[] fix23(int[] nums) 
{
 int[] result = new int[] {nums[0], nums[1], nums[2]};
 
 if(result[0] == 2 && result[1] == 3)
 {
   result[1] = 0;
 }
 
 if(result[1] == 2 && result[2] == 3)
 {
   result[2] = 0;
 }
 
 return result;
}
