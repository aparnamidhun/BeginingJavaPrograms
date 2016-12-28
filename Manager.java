package Package1;

public class Manager extends Employee {

	public String department;
	public Manager(int id,String name,double salary,String department){
		super(id,name,salary);
		this.department=department;
	}
	public String getDepartment(){
		return department;
	}

}
