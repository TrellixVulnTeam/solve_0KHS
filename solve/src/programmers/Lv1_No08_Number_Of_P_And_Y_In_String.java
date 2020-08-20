package programmers;
/*
■■■ 문자열 내 p와 y의 개수 ■■■
[풀이일자] 2020.04.22

[문제 설명]
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
예를 들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.

[제한사항]
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.

[입출력 예]
s	answer
pPoooyY	true
Pyy	false
*/
public class Lv1_No08_Number_Of_P_And_Y_In_String
{
	 public boolean solution(String s) 
	 {
	        boolean answer = true;
	        int countP=0,countY = 0;
	        
	        for(int i=0; i< s.length(); i++)
	        {
	           if(s.substring(i,i+1).equals("p")||s.substring(i,i+1).equals("P")) // i 번째 문자가 p 나 P 이면
	              countP+=1;
	            else if(s.substring(i,i+1).equals("y")||s.substring(i,i+1).equals("Y"))
	              countY+=1;
	        }
	        
	        if(countP==countY || countP==0 && countY==0)
	            answer = true;
	        else
	            answer = false;
	            
	        return answer;
	    }
}
