package constructors;

public class Person {
int age;
String name;
double percentage;
Person(int age,String name,double percentage)
{
	this.age=age;
	this.name= name;
	this.percentage=percentage;
}
public static void main(String[] args) {
	Person p=new Person(22,"bunny",95.5);
	Person p1=new Person(23,"mochi",90.5);
	Person p2=new Person(24,"teddy bear",97.5);
	System.out.println(p.age + " "+p.name +" "+p.percentage);
	System.out.println(p1.age + " "+p1.name +" "+p1.percentage);
	System.out.println(p2.age + " "+p2.name +" "+p2.percentage);
}
}
