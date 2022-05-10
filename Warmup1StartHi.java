public boolean startHi(String str) 
{
  boolean isMatch = false;
  String start = "hi";
  
  if(str.length() >= start.length())
  {
    if(start.equals(str.substring(0, start.length())))
    {
      isMatch = true;
    }
  }
  
  return isMatch;
}
