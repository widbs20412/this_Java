package p06_array;

public class Person_Main {

	public static void main(String[] args) {
		int a;
		String str;
		Person p; // 선언
		p = new Person();
		p = new Person();

		Person p2 = new Person();
		Person p3 = new Person();
		System.out.println("-------1. 변수 사용한 방법1----------");
		Person[] pa;
		pa = new Person[10];

		pa[0] = new Person();
		pa[0].age = 30;
		pa[0].name = "홍길동0";

		pa[1] = new Person();
		pa[1].age = 31;
		pa[1].name = "홍길동2";

		pa[2] = new Person();
		pa[2].age = 32;
		pa[2].name = "홍길동3";

		System.out.println("------2. 변수 사용한 방법2(일반 for)-------");
		for (int i = 0; i < pa.length; i++) {
			pa[i] = new Person();
			pa[i].age = 30 + i;
			pa[i].name = "홍길동0" + i;
			System.out.println(pa[i].age + " : " + pa[i].name);

		}
		System.out.println("------3. 변수 사용한 방법3(향상된 for)-------");
		int i = 0;
		for (Person pp : pa) {
			pp = new Person();
			pp.age = 30 + i;
			pp.name = "홍길동" + i;
			System.out.println(pp.age + " : " + pp.name);
			i++;
		}
		System.out.println("------4. 변수 사용한 방법4(for : 생성자)-------");
		for (int k = 0; k < pa.length; k++) {
			pa[k] = new Person(30 + k, "홍길동0"+k);
			System.out.println(pa[k].age + " : " + pa[k].name);

		}
		System.out.println("------5. 변수 사용한 방법5(향상된 for,toString())-------");
		int i2 = 0;
		for (Person pp : pa) {
			pp = new Person();
			pp.age = 30 + i2;
			pp.name = "홍길동" + i2;
			System.out.println(pp);
			i2++;
		}

	}
}
