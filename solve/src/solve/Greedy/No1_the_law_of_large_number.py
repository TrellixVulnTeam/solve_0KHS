# ■■■ 큰 수의 법칙 ■■■
# 다양한 수로 이루어진 배열의 수를 M번 더하여 가장 큰 수를 만드는 법칙이다.
# 단, 배열의 특정한 인덱스에 해당하는 수가 "연속해서" K번을 초과해서 더해질 수 없다.
# 서로 다른 인덱스에 해당하는 수가 같은 경우에도 서로 다른 것으로 간주한다.
# 배열의 크기 N, 숫자가 더해지는 횟수 M, 그리고 K 가 주어질 때 큰 수의 법칙에 따른 결과를 출력하시오.

#### Solve 1 ####

# N,M,K 를 공백으로 구분하여 입력받기
n, m, k = map(int, input().split())

# N 개의 수를 공백으로 구분하여 입력받기
data = list(map(int, input().split()))

# 입력받은 수들 정렬하기
data.sort()

first = data[n - 1]  # 가장 큰 수
second = data[n - 2]  # 두번째로 큰 수

result = 0

while True:
    for i in range(k):  # 가장 큰 수를 k 번 더하기
        if m == 0:  # m 이 0이라면 반복문 탈출
            break
        result += first
        m -= 1  # 더할 때마다 1 빼기

    if m == 0:  # m 이 0이라면 반복문 탈출
        break
    result += second
    m -= 1  # 더할 때마다 1 빼기


print(result)  # 최종 결과 출력


#### Solve 2 ####

# N, M. K 를 공백으로 구분하여 입력받기
n, m, k = map(int, input().split())
# N 개의 수를 공백으로 구분하여 입력받기
data = list(map(int, input().split()))

data.sort() # 입력받은 수 정렬
first = data[n-1] # 가장 큰 수
second = data[n-2] # 두번째로 큰 수

# 가장 큰 수 가 더해지는 횟수 계산
count = int(m/(k+1))*k
count += m%(k+1)

result = 0
result += count * first # 가장 큰 수 더하기
result += (m-count) * second # 두번째로 큰 수 더하기

print(result) # 최종 결과 출력


