package study07_interfaces;

public class SeperateVolume implements Lendable{
	String requestNo;//청구번호
	String bookTitle;//제목
	String writer;//저자
	String borrower;//대출인
	String checkOutDate;//대출일
	byte state; //대출상태 //0 : 대출하지 않은 상태 , 1: 대출상태
	
//	public SeperateVolume(String requestNo, String bookTitle, String writer) {
//		// TODO Auto-generated constructor stub
//	}
	
	public SeperateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo; //"86738개", "개미","베르베르"
		this.bookTitle = bookTitle;//"개미"
		this.writer = writer;//"베르베르"
	}

	//대출
	public void checkOut(String borrower, String date) {//"홍길여", "20180611"
		if(state !=0)
			return;
		this.borrower = borrower;//대출인
		this.checkOutDate = date;//대출일
		this.state =1;
		
		System.out.println("* " + bookTitle + "이(가) 대출되었습니다.");
		System.out.println("대출인: "+borrower);
		System.out.println("대출일: "+date);
	}
	//반납
	public void checkIn() {
		this.borrower = null;//대출인
		this.checkOutDate = null;//대출일
		this.state =0;
		
		System.out.println("* " + bookTitle + "이(가) 반납되었습니다.");
		
		
	}

}
