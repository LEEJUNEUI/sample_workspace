package co.edu;

public class Example02 {
public static void main(String[] args) {
	double myHeight = 178.5;
	double yourHeight = 175.8;
	
	double theDifference = myHeight-yourHeight;
	
	if(myHeight > yourHeight) {
		theDifference = myHeight-yourHeight;
		System.out.println("나의 키가 " + theDifference + " 더 큽니다.");
	} else {
		theDifference = yourHeight-myHeight;
		System.out.println("나의 키가 " + theDifference + " 더 작습니다.");	
	} 
	
	
    }
	
}
