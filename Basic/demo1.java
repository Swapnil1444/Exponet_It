class demo1{
 public demo1(){
   System.out.println("hello");
}
  public static void main(String [] args){
  new demo1();
  System.out.println(add(10,20));
}

  public static  int add(int a,int b){ return (a+b);}
}