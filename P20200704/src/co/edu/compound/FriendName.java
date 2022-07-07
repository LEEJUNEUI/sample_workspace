package co.edu.compound;

public class FriendName {
	public static void main(String[] args) {

		Friend f1 = new Friend();
//		f1.fullName = "홍길동";
		f1.setfullName("김민수");
		System.out.println("이름 : " + f1.getfullName());
//		f1.num = "010-3012-9377";
		f1.setPhone("010-3012-9377");
		System.out.println("전화번호 : " + f1.getNum());
//		f1.email = "mk26640@naver.com";
		f1.setEmail("mk26640@naver.com");
		System.out.println("이메일 : " + f1.getEmail());
//		f1.brith = "1994-11-16";
		f1.setBrith("1994-11-16");
		System.out.println("생일 : " + f1.getBrith());
//		f1.height = 190.1;
		f1.setHeight(190.1);
		System.out.println("키 : " + f1.getHeight() + "cm");
//		f1.whgith = 88.4;
		f1.setWeight(88.4);
		System.out.println("몸무게 :  " + f1.getWeight() + "kg");
//		System.out.println(new Friend());
//		
	}
}
