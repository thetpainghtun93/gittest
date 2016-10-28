// represen the person dto
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

  public String toString(){
  	return this.name+this.age;
  }

}
