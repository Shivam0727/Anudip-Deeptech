class Employee
{		
	int empcode;
	String name;
	String city;
	Employee(int empcode, String name, String city)
	{
		this.empcode=empcode;
		this.name=name;
		this.city=city;
	}
	public String toString() 
	{
		return empcode+" "+name+" "+city;
	}
	public static void main(String args[])
	{
		Employee e1=new Employee(377180,"Shivam","Nagpur");
		Employee e2=new Employee(377125,"Dipali","Latur");
		System.out.println(e1);
		System.out.println(e2);
	}
}
