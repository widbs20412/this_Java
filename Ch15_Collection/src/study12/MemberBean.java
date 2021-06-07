package study12;

/* 데이터를 저장해서 전달해 주는 객체(bean = DTO = VO) */
public class MemberBean {

	String ID;
	int PW;
	String Name;

	public MemberBean(String iD, int pW, String name) {
		super();
		ID = iD;
		PW = pW;
		Name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getPW() {
		return PW;
	}

	public void setPW(int pW) {
		PW = pW;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
