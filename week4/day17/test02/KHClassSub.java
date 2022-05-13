package com.week4.day17.test02;

/**과목기준 총합 평균 석차**/
public class KHClassSub extends ScoreCalculator {
	
		int javaTotalScore;
		int htmlTotalScore;
		int oraclTotalScore;
		
		double javaAvg;
		double htmlAvg;
		double oraclAvg;
		

			@Override
			// 메소드를 재정의해서 쓸 수 있음. 
			// 재정의할 필요가 있는 메소드가 무엇인지 고민해 볼 필요가 있겠다...
			// 과목의 수에 따라 과목별 총점의 수도 다르므로 재정의 
			public void addUpScore () {
				for (int i = 0; i < student; i ++) {
					javaTotalScore = javaTotalScore + score[i][0];
					htmlTotalScore = htmlTotalScore + score[i][1];
					oraclTotalScore = oraclTotalScore + score[i][2];
				}
				System.out.println("오전반 학생들의 JAVA 점수 총합 : " + javaTotalScore);
				System.out.println("오전반 학생들의 HTML 점수 총합 : " + javaTotalScore);
				System.out.println("오전반 학생들의 ORACLE 점수 총합 : " + javaTotalScore);
			}
			
			@Override 
			public void avgScore () {
				javaAvg = (javaTotalScore / student);
				htmlAvg = (htmlTotalScore / student);
				oraclAvg = (oraclTotalScore / student);
				
				System.out.println("오전반 학생들의 JAVA 점수 평균 : " + javaAvg);
				System.out.println("오전반 학생들의 HTML 점수 평균 : " + htmlAvg);
				System.out.println("오전반 학생들의 ORACLE 점수 평균 : " + oraclAvg);
			}
			
			public void rankingScore () {
				
			}
	public static void main(String[] args) {
			KHClassSub kh9to15 = new KHClassSub();
			kh9to15.addUpScore();
			kh9to15.avgScore();
	}	
}

