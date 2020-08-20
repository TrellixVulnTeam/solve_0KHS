package programmers;

import java.util.Arrays;

/*
■■■ 나누어 떨어지는 숫자 배열 ■■■
[풀이일자] 2020.04.20
[문제 설명]
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

[제한사항]
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.

[입출력 예]
arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]
*/
public class Lv1_No05_DividedNumArray
{
	public int[] solution(int[] arr, int divisor) {
	     
	      int count = 0;
	    
	    // 배열의 인덱스만큼 반복 
	    for(int i=0; i<arr.length; i++)
	    {
	        // divisor로 나누어 떨어지는 값이라면 
	        if(arr[i]%divisor==0)
	           ++count;
	    }
	      
	    // 반환할 배열칸 선언 
	   int[] answer = new int[count];
	      
	   // 나누어 떨어지는 수가 없다면 [-1] 반환 
	   if(count==0)
	   {
	       int[] zero = {-1};
	       return zero;
	   }
	   else
	   {    
	       for(int i=0, j=0; i<arr.length; i++)
	       {
	           if(arr[i]%divisor==0)
	           { 
	               answer[j]= arr[i];
	                j++;
	           }
	       }
	   }             
	    // 정렬
	   Arrays.sort(answer);
	   return answer;
	  }
}
