package programmers;
/*
■■■ 가운데 글자 가져오기 ■■■
[풀이일자] 2020.04.17

[문제 설명]
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

[제한사항]
s는 길이가 1 이상, 100이하인 스트링입니다.

[입출력 예]
s	return
abcde	c
qwer	we
*/
public class Lv1_No03_GetCenterString
{
	 public String solution(String s) 
	 {
	      String answer = "";
	       if(s.length()%2 == 0)
	       {
	           answer = s.substring(s.length()/2-1, s.length()/2+1); // a부터  b전까지
	       }
	       else if(s.length()%2 == 1)
	       {
	           answer = s.substring(s.length()/2,s.length()/2+1);
	       }
	      return answer;
	  }
}
