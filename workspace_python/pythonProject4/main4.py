'''
피자의 반지름을 받아서 피자의 면적을 계산하는 함수를 작성하시오
예) 20cm 피자 2개의 면적 :
    30cm 피자 1개의 면적 :
    0cm 피자 1개의 면적 : 0.0
'''

# def main():
#     result1 = get_area(20) + get_area(20)
#     result2 = get_area(30)
#
#     print("반지름이 3인 원의 면적을 = ", result1, "입니다.")
#     print("반지름이 3인 원의 면적을 = ", result2, "입니다.")

def main():
    print("20cm 피자 2개의 면적 : ", get_area(20) + get_area(20))
    print("30cm 피자 1개의 면적 : ", get_area(30))
    print("-20cm 피자 1개의 면적 : ", get_area(-20))

def get_area(radius):
    if radius > 0:
        area = 3.14 * radius **2
    else:
        area = 0.0
    return area

main()