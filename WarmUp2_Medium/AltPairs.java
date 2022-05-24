/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String altPairs(String str) 
{
  String result = "";
  
  for(int i = 0; i < str.length(); i++)
  {
    if(i % 4 == 0 || i % 4 == 1)
    {
      result += str.charAt(i);
    }
  }
  
  return result;
}
