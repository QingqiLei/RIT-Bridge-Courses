print(2+3*4) # 14
print((2+3)*4) # 20
print(2**10) # 1024
print(6/3) #2.0
print(7/3) #2.3333
print(7//3) # 2
print(7%3) #1
print(3/6) # 0.5
print(3//6) # 0
print(3%6) # 3

## and or not < > <= >= == !=
print(not True)

# list []
myList = [0] * 5

''' 
indexing          []
concatenation     +
repetition        * 
membership        in
length            len
slicing           [:] 
'''
A = [myList] * 3
print(A)
myList[2] = 45
print(A)  

'''
append     alist.append(item)
insert     alist.insert(i,item)
pop        alist.pop()
sort       alist.sort()
reverse    alist.reverse()
del        del alist[i]
index      alist.index(item)
count      alist.count(item)
remove     alist.remove(item)
'''

myList = [1024,3,True, 6.5]
myList.append(False)
print(myList)
myList.insert(2,4.5) #[1024,3,4.5,True,6.5,False]
print(myList.pop()) # remove the rightest item
print(myList.pop(1)) # remove the second item
myList.sort()  
print(myList)
myList.reverse()
print(myList)
del myList[3]
print(myList)

print(list(range(5,10)))
print(list(range(5,10,2)))
print(list(range(10,1, -1)))


# lists are mutable, strings are immutable
str1 = "David"
print(str1[3])
print(str1 * 2)
print(str1.upper())
print(str1.center(7))
print(str1.find('v'))
print(str1.split("v"))
str1 = "0"+str1
print(str1)

# str1[0] = '1'

myTuple = (2,True, 4, 96)
print(len(myTuple))
print(myTuple[0])
print(myTuple[0:2])

# tuple is immutable

tuple1 = myTuple * 3
print(tuple1)

print(tuple1[1:3])


# set
set1 = {3,6,"cat",4,5,False}


'''
|
&
-
<=

'''

set2 = {3,6,7}
print(set1 | set2)
print(set1 & set2)
print(set1 - set2)

print(set1 >= {3})

print(set1.union(set2))
print(set1.intersection(set2))
print(set1.difference(set2))
print({3,6}.issubset(set1))
set1.add(10)
set1.remove(3)
set1.pop() # removes an arbitary element from set

capitals = {"Iowa":"DesMoines", "Wisconsin":"Madison"}
capitals['Iowa'] = 1
print(capitals["Iowa"])
capitals['Utah'] = '12'
for k in capitals:
    print(capitals[k], " is the capital of ", k)

phoneext = {"david":1410, "brad":1137}

print(phoneext.keys())
print(list(phoneext.keys()))
print(list(phoneext.values()))
print(list(phoneext.items()))
print(phoneext.get("kent","not exist"))






