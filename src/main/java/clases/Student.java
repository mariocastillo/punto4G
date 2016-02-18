package clases;


public class Student {
    public String name;
    public String career;
    public int age;

    public Student(String name, String career, int age) {
         this.career = career;
         this.name = name;
         this.age = age;
    }

    public String getName() {
         return name;
    }
    public void setName(String name) {
	this.name = name;
    }
    public String getCareer() {
	return career;
    }
    public void setCareer(String career) {
	this.career = career;
    }
    public int getAge() {
	return age;
    }
    public void setAge(int age) {
 	this.age = age;
    }	
    
    void print() 
    { 
        System.out.println(name + " - " +career + " - " + age ); 
    }

    
}