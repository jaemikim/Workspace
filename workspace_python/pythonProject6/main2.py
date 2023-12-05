fruits = ("apple", "banana", "grace")

print(type(fruits))

#fruits[1] = "pear"     오류발생

myList = [1, 2, 3, 4]

print("-" * 30)
# tuple()는 튜플을 생성하는 함수
myTuple = tuple(myList)
print(myTuple)


# 튜플 -> 리스트
# list()는 리스트를 생성하는 함수
myList2 = list(myTuple)
print(myList2)

print("-" * 30)

# 다른 튜플에 합치는 것은 가능
fruits = ("apple", "banana", "grace")
fruits += ("pear", "kiwi")
print(fruits)


# 리스트에 튜플을 합치는 것은 가능
numbers = [10, 20, 30]
numbers += (40, 50)
print(numbers)

print("-" * 30)
t = ("apple", "banana", "grace")
(s1, s2, s3) = t
print(t)


print("-" * 30)
n1 = 10
n2 = 90

n1, n2  =(n2, n1)
print(n1, n2)


print("-" * 30)
fruits = ("apple", "banana", "grace")
for index, value in enumerate(fruits):
    print(index, value)