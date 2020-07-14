class sample
{
   int num;
   sample()
{
   num=5;
}
  sample(int n)
{
  num=n;
}
  sample(sample obj)
{
  num=obj.num;
}
  void square()
{
  System.out.println("SQUARE="+(num*num));
}
  
}
  class test
{
  public static void main(String args[])
{
  sample s1=new sample();
  sample s2=new sample(10);
  sample s3=new sample(s1);
  s1.square();
  s2.square();
  s3.square();
}
}