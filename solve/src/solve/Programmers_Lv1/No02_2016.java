package Programmers_Lv1;
/*
■■■ NO.02 2016년 ■■■
[풀이일자] 2020.04.17

[문제 설명]
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다. 
예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.

[제한 조건]
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. 
(13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

[입출력 예]
a	b	result
5	24	TUE
*/
public class No02_2016
{
	 public String solution(int m, int d) {
	      
	      String [] weeks = {"THU","FRI","SAT","SUN","MON","TUE","WED"}; 
	      int[] days = { 31,29,31,30,31,30,31,31,30,31,30,31};
	      int sum = 0;
	      
	      // 2016년 1월 1일은 금요일 
	      // sum += days[m-1] 
	      // sum += d 
	      // days[m-1] 은 입력받은 달의 이전 달까지 반복 
	      // 2월 입력하면 days[0] 만 더해지도록 
	      
	      for(int i = 0; i < m-1 ; i++)
	      {
	          sum += days[i];
	      }
	      sum += d;
	     
	      String answer = weeks[sum%7]; // 요일로 맞추기   
	    
	      return answer;
	  }
}
