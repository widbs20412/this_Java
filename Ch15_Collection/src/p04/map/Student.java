package p04.map;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public String toString() {
	return name+" : "+sno;
	}
	
	@Override
	public int hashCode() {
		return (name+sno).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student p = (Student) obj;
			return this.name.equals(p.name) && this.sno == p.sno;
		}
		return super.equals(obj);
	}
	
	
}
