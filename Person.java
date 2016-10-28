// represen the person dto(also called pojo)
//some more comments
public class Person{

  private String name;
  private int age;
  
  public void setName(String name){
  	this.name  = name;
  }

  public void setAge(int age){
  	this.age = age;
  }

  public int getAage(){
  	return this.age;
  }
  
  public String getName(){
  	return this.name;
  }
  
  @Override
  public String toString(){
  	return this.name+this.age;
  }

}
