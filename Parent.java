class Parent{
  private String address = "Pleasanton, CA: 94566;";
  private int age;
  private String number = "999-999-9999";
  private String name;
  //Setter methods
  public void setName(String name){
    System.out.println("Parent setName"+name);
    this.name = name;
  }
  public void setAge(int age){
    System.out.println("Parent setAge"+age);
    this.age = age;
  }
  public void setAddress(String add){
    System.out.println("Parent setAddress"+add);
    this.address = add;
  }
  public void setNumber(String num){
    System.out.println("Parent setNumber"+num);
    this.number = num;
  }
//Getter methods
  public String getName(){
    System.out.println("Parent getName"+this.name);
    return this.name;
  }
  public int getAge(){
    System.out.println("Parent getAge"+this.age);
    return this.age;
  }
  public String getAddress(){
    System.out.println("Parent getAddress"+this.address);
    return this.address;
  }
  public String getNumber(){
    System.out.println("Parent getNumber"+this.number);
    return this.number;
  }
}
