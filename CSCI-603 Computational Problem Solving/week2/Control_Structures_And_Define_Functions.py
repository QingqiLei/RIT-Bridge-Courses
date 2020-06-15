import math
counter = 1
while counter <= 5:
    print("hello world")
    counter +=1

for item in range(5):
    print(item **2)


wordlist = ['cat','dog','rabbit']
letterlist = [ ]

for aword in wordlist:
    for aletter in aword:
        letterlist.append(aletter)
print(letterlist)
n = 10
if n < 0:
    print("value is negative")
else:
    print(math.sqrt(n))

score = 90


if score >= 90:
    print('A')
elif score >= 80:
    print("B")
else:
    print('C')

sqlist = []
for x in range(1,11):
    sqlist.append(x * x)
print("sqlist",sqlist)



sqlist1 = [x * x for x in range(1,11)]
print("sqlist1",sqlist1)
print([x * x for x in range(1,11)])

sqlist2 = [x*x for x in range(1,11) if x%2 != 0]
print("sqlist2",sqlist2)

print([ch.upper() for ch in "comprehension" if ch not in 'aeiou'])

def square(n):
    return n**2
print(square(3))
print(square(square(3)))



# Newton's Method
def squareroot(n):
    root = n/2
    for k in range(20):
        root = (1/2) * (root + ( n / root))
    return root

    