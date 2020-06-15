


def listsum(numList):
    sum = 0
    for i in numList:
        sum +=i
    return sum
print(listsum([1,3,5,7,9]))

def listsum1(numList):
    if(len(numList) == 1):
        return numList[0]
    else:
        return numList[0]+listsum1(numList[1:])
print(listsum1([1,3,5,7,9]))
