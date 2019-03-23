Ασκηση 4
θα εμφανίσει -4-6-h

ΆΣΚΗΣΗ 6 a)
public class Employee{
	public String employeeName;
	public int salary;
	public String address;

	public Employee(){
		this("Bob Day");
	}

	public Employee(String name){
		this(name,1200);
	}
	public Employee(String name, int salary) {
 	this(name, salary, "Patission 76");
 }
 	public Employee(String name, int salary, String address) {
 	this.employeeName=name;
 	this.salary=salary;
 	this.address=address;
 }

 	void disp() {
 	System.out.println("Employee Name: "+ employeeName);
 	System.out.println("Employee Salary: "+salary);
 	System.out.println("Employee Address: "+address);
 }
 public static void main(String[] args) {
 Employee obj = new Employee();
 obj.disp();
 } 

}

b)Καλούνται κατά αύξουσα σειρά των παραμέτρων που παίρνουν ως ορίσματα στις μεθόδους που υλοποιούν το αντικείκενο obj
Δηλαδή πρώτα καλείται η
public Employee(){
		this("Bob Day");
	}
Μετά η 
public Employee(String name){
		this(name,1200);
	}

Μετά
 public Employee(String name, int salary) {
 	this(name, salary, "Patission 76");
 }


Και τέλος

public Employee(String name, int salary, String address) {
 	this.employeeName=name;
 	this.salary=salary;
 	this.address=address;
 }

 γ Το τελευταίο this δεν είναι απαραίτητο καθώς έχουν ήδη δημιουργηθέι τρία instances??από τον constructor 

 public Employee(String name, int salary) {
 	this(name, salary, "Patission 76");
 }
