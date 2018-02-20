package OopsClass;

public class Employee {
	int id;
	String name;
	String department;
  final static String s="Bebo";
  
	public static void main(String[] args) {
		
		Employee e1=new Employee();
	e1.id=123;
	e1.name="xyz";
	System.out.println("name "+e1.name);
	System.out.println("id "+e1.id);
	System.out.println("company "+Employee.s);
	
	Employee e2=new Employee();
	e2.id=321;
	e2.name="abc";
	System.out.println("name "+e2.name);
	System.out.println("id "+e2.id);
	System.out.println("company "+Employee.s);
	
		
	}

}
