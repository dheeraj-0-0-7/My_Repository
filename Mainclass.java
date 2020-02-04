package abc;
// Encapsulation
// Collections


// Abstract classes
abstract class Aclass{
	public abstract void amethod();
}

//Interfaces
interface Maininterface{
	void displayed();
}

//Inheritance
class Imp extends Aclass implements Maininterface{
	public void amethod() {
		System.out.println("Implementation of Abstract Method of Abstract Class");
	}
	public void displayed() {
		System.out.println("Implementation of Interface");
	}
	public void poly() {
		System.out.println("method without polymorphism");
	}
	//Static Polymorphism
	public void add(int a, int b)
	    {
	         int d = a+b;
	 		System.out.println("addition is "+d);
	    }
	public void add(int a, int b, int c)  
	    {
	        int d=a+b+c;
	         System.out.println("addition is "+d);
	         
	    }	
	// Encapsulation
	private String sname;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
		
}

//Runtime Polymorphism
class Inherit extends Imp{
	public void poly() {
		System.out.println("method after polymorphism(RunTime)");
	}
}




public class Mainclass {
    public static void main(String[] args) {
	Imp i=new Imp();
	i.amethod();
	i.displayed();
	i.add(10,20,30);
	i.setSname("Pavan");  
	System.out.println(i.getSname());  
	Imp j=new Inherit();
	j.poly();
     
	}

}
