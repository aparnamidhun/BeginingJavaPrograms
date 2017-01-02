package package2;
import Package1.*;

public class TestManager {

	
	public static void main(String[] args) {
	Manager m = new Manager(10,"apu",10000,"it");
	System.out.println(+m.getId() + m.getName() +m.getSalary() +m.getDepartment());

	
m.setsalary(1000.0);
System.out.println(m.getSalary());

}
}