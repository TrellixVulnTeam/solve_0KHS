package programmers;
/*
■■■ 문자열 다루기 기본 ■■■
[풀이일자] 2020.04.22

[문제 설명]
문자열 s의 길이가 4 혹은 6이고, 
숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

[제한 사항]
s는 길이 1 이상, 길이 8 이하인 문자열입니다.

[입출력 예]
s	return
a234	false
1234	true
*/
public class Lv1_No10_BasicStringHandling
{
	 public boolean solution(String s) {
		  /*
		      boolean answer = true;
		      int count = 0;  
		     
		    if(s.length()==4||s.length()==6)
		    {
		        for(int i=0; i < s.length(); i++)
		        {
		           if('0'<=s.charAt(i)&& s.charAt(i)<='9')
		           {
		               ++count;
		               System.out.println(count);
		           }
		        }
		        
		        if(count == s.length())
		        {answer=true;}
		        else if(count!=s.length())
		        {answer=false;}
		        
		        return answer;
		    }
		    else
		    {
		        answer = false;
		        return answer;
		    }
		    */
		      
	       if(s.length() == 4 || s.length() == 6)
	       {
	          try
	          {
	              int x = Integer.parseInt(s);
	              return true;
	          } 
	          catch(NumberFormatException e)
	          {
	              return false;
	          }
	      }
	      else return false;
	 }
}
