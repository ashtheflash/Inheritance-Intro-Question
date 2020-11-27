public class Child extends Parent{
  private String name;
  private int age;
  //Setter methods
  @Override
  public void setName(String name){
    System.out.println("Child setName"+name);
    this.name = name;
  }
  @Override
  public void setAge(int age){
    System.out.println("Child setAge"+age);
    this.age = age;
  }
  //Getter methods
  @Override
  public String getName(){
    System.out.println("Child getName"+name);
    return this.name;
  }
  @Override
  public int getAge(){
    System.out.println("Child getAge"+age);
    return this.age;
  }
   @Override
   public String toString()
   {
     return name;
   }
}