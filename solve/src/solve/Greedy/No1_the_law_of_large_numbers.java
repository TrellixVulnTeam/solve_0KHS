package Greedy;

/*
■■■ 큰 수의 법칙 ■■■
다양한 수로 이루어진 배열의 수를 M번 더하여 가장 큰 수를 만드는 법칙이다.
단, 배열의 특정한 인덱스에 해당하는 수가 "연속해서" K번을 초과해서 더해질 수 없다.
서로 다른 인덱스에 해당하는 수가 같은 경우에도 서로 다른 것으로 간주한다.
배열의 크기 N, 숫자가 더해지는 횟수 M, 그리고 K 가 주어질 때 큰 수의 법칙에 따른 결과를 출력하시오.
*/

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class No1_the_law_of_large_numbers
{
    public static void main(String[] args)
    {

        int result = 0; // 결과값

        // 공백을 기준으로 세 정수(N, M, K)를 입력받는다.
        Scanner scanner = new Scanner(System.in);
        String threeNums =  scanner.nextLine();
        String[] numsStr = threeNums.split(" ");
        int N = Integer.parseInt(numsStr[0]);
        int M = Integer.parseInt(numsStr[1]);
        int K = Integer.parseInt(numsStr[2]);

        // N 개의 정수로 이루어진 배열을 만든다.
        // 이때 정수는 1 이상 100,000 이하의 수이다.

        // N 개의 정수로 이루어진 배열을 만들기 위해서
        // N 크기의 배열을 선언하고 N번 반복해서 랜덤 수를 생성한다.

        Random random = new Random();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++)
        {
            int randomNum = random.nextInt(100000)+1;
            nums[i] = randomNum;
            System.out.println("randomNum : " + randomNum);
        }

        // N,M,K 의 값과 배열은 주어지므로 여기부터 시간을 측정한다.
        // 시간 측정을 위한 변수
        long beforeTime = System.currentTimeMillis();

        // 배열을 오름차순으로 정렬한다.
        Arrays.sort(nums);

        // N-1번째 칸에 가장 큰 수가, N-2번째 칸에 두번째로 큰 수가 담겨있다.
        // 같은 인덱스에 있는 수는 "연속해서" K 번을 초과해서 더할 수 없다.
        // 가장 큰 수를 K 번 반복해서 더해준 뒤 두번째로 큰 수를 한번 더해준다.

        int count = 0; // 총 더한 횟수를 담는 변수

        while(true)
        {
            // 가장 큰 수를 K 번 반복해서 더한다.
            for (int i = 0; i < K ; i++)
            {
                // 총 더한 횟수가 M 보다 작을 때만 반복한다.
                if(count!=M)
                {
                    result += nums[N-1];
                    count++;
                }
                else
                {
                    break;
                }
            }

            // 총 더한 횟수가 M 보다 작을 때만 반복한다.
            if(count!=M)
            {
                // 두번째로 큰 수를 한번 더한다.
                result += nums[N-2];
                count++;
            }
            else
            {
                break;
            }
        }

        System.out.println("result : " + result);

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("시간차이(m) : "+secDiffTime);
    }

}
