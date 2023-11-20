for i in [1, 2, 3, 4, 5]:
    print("와 첫눈이 내렸습니다.")

for i in [9, 8, 7, 6, 5]:
    print("i = ", i)

for i in range(5):  # 0, 1, 2, 3, 4가 생성됨
    print("와 첫눈이 내렸습니다.")

for i in range(1, 6, 1):
    print(i, end=" ")

print("_" * 20)

for i in range(1, 16, 2):
    print(i, end=" ")


print("_" * 20)
# 10 9 8 7 6 5 4 3 2 1
for i in range(10, 0, -1):
    print(i, end=" ")

print("_" * 20)
# 1부터 10까지 합을 range() 활용해서 구하시오
sum = 0
n = 10
for i in range(1, n+1):
    sum += i
print("1부터 10까지의 합 = ", sum)

# for문을 이용해서 팩토리얼을 계산하기
'''            i 값              fact 값
1번째 반복        1                1 * 1 
2번째 반복        2                1 * 1 * 2                      
3번째 반복        3                1 * 1 * 2 * 3                     
4번째 반복        4                1 * 1 * 2 * 3 * 4                     
5번째 반복        5                1 * 1 * 2 * 3 * 4 * 5                     
'''
n = int(input("정수를 입력하세요 : "))
fact = 1
for i in range(1, n+1):
    fact = fact * i
print(n, "!은 ", fact, "이다.")