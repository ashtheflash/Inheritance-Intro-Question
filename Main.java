class Main {
  public static void main(String[] args) {
    Parent obj = new Parent();
    obj.setName(" Charles");
    obj.setAge(46);
    obj.setAddress(" Pleasanton, CA");
    obj.setNumber(" 999-999-9999");
    Child cObj = new Child();
    cObj.setName(" Ashwin");
    cObj.setAge(15);
    //cObj.setAddress("sanramon ");
    //cObj.setNumber("5101112222");
    cObj.getAddress();
    cObj.getNumber();
  }
}
/*4 set and 4 get for parent
2 set and 2 get for parent
address, name, phone, age*/