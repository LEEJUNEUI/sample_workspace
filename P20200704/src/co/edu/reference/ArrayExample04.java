package co.edu.reference;

public class ArrayExample04 {
	public static void main(String[] args) {
		// a반 80, 85, 83
		// b반 79, 84, 90
		int[][] banAry = new int[2][3];

		banAry[0][0] = 80;
		banAry[0][1] = 85;
		banAry[0][2] = 83;

		banAry[1][0] = 79;
		banAry[1][1] = 84;
		banAry[1][2] = 90;

		banAry = new int[][] { { 80, 85, 83 }, { 79, 84, 90 } };
		int sum = 0;
		double avg = 0;
		int i = 0;
		int A = 0;
		int B = 0;
		for (i = 0; i < banAry.length; i++) {
			for (int j = 0; j < banAry[i].length; j++) {
				if (i == 0) {
					A += banAry[i][j];
				} else {
					B += banAry[i][j];
				}
			}
		}
		avg = (double) A / banAry[0].length;
		System.out.printf("평균 %.1f 입니다.", avg);
		
		avg = (double) B / banAry[1].length;
		System.out.printf("평균 %.1f 입니다.", avg);
	}
}
