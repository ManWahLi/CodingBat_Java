/*
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". 
If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"

@author Man Wah Li [limanwah0924@gmail.com]
*/

public String front22(String str) 
{
  int numberOfCharsTaken = 2;
  String addingChars;
  
  addingChars = str.length() > numberOfCharsTaken ? str.substring(0, numberOfCharsTaken) : str;
  
  return addingChars + str + addingChars;
}
