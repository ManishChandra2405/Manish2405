class Test3
{
  public static void main(String[] args)
  {
    String[] s={"welcome","Manish chandra"};
    for(int i=s.length-1;i>=0;i--)
     {
      for(int j=0;j<s[i].length()-1;j++)
       System.out.println(s[i].charAt(j)+"");
         System.out.println();
     }
    }
}

