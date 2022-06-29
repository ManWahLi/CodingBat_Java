/*
Given an array of scores, return true if each score is equal or greater than the one before. 
The array will be length 2 or more.

scoresIncreasing([1, 3, 4]) → true
scoresIncreasing([1, 3, 2]) → false
scoresIncreasing([1, 1, 4]) → true

@author Man Wah Li [limanwah0924@gmail.com]
*/

public boolean scoresIncreasing(int[] scores) 
{
  boolean isIncreasing = true;
  
  for(int i = 0; i < scores.length - 1 && isIncreasing; i++)
  {
    if(scores[i] > scores[i + 1])
    {
      isIncreasing = false;
    }
  }
  
  return isIncreasing;
}
