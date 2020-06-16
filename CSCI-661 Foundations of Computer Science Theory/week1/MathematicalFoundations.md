## sets
S1 = {12,3232,323}
s2 = {apple, pear, banana, grape}
s3 = {x: x∈ s5 and x has 31 days}
{j : j >= 0 , and j = 2k for some k >=0}
j 可以是6， 不可以是7

###  cardinality

|S| 就是set里有多少元素

a natural number (if S is finite)
countably infinite (if S has the same number of elements as there are integers)
uncountably infinite (if S has more elements than there are integers)

### Set representations

∅ = { }
S ∪ ∅ = S
S ∩ ∅ = ∅
S - ∅ = S
∅ - S = ∅
¬∅ = U (the Universal Set)

### power set

a set of sets

S = {a,  b , c}

2^S = { ∅, {a}, {b}, {c}, {a,b}, {a,c}, {b,c}, {a,b,c} }
|2^s| = 2^|S|
 |2^S| = 2^3 = 8

### partition
s = {1,2,3}
no element of  Π is empty
all pairs of elements of  Π are disjoint
the union of all elements of  Π equals s

{{1},{2,3}} {{2},{1,3}} {{3},{2,1}} 

### set complement
¬¬S = S
Let U = {1, …, 7}
Let S = { 1, 2, 3 } , then ¬S = { 4, 5, 6, 7 }

### set operations

union A ∪ B
intersecion A ∩ B
difference A- B: A独有的

### disjoint sets
A = { 1, 2, 3 } B = { 5, 6 }
A and B are disjoint: A ∩ B = ∅

A = {3，4，5}， |A| = 3

### cartesian product
A × B
If A and B are finite, the cardinality of their
Cartesian product is |A × B| = |A|⋅|B|

A = {2, 4} B = {2, 3, 5}
A × B = { (2, 2), (2, 3), (2, 5), (4, 2), (4, 3), (4, 5) }
 |A × B| = |A|⋅|B|


Let A be: {Dave, Sara, Billy}
Let B be: {cake, pie, ice cream}

 A × B = { (Dave, cake), (Dave, pie), (Dave, ice cream),
 (Sara, cake), (Sara, pie), (Sara, ice cream),
 (Billy, cake), (Billy, pie), (Billy, ice cream) }

 B × A = { (cake, Dave), (cake, Sara), (cake, Billy),
 (pie, Dave), (pie, Sara), (pie, Billy),
 (ice cream, Dave), (ice cream, Sara), (ice cream, Billy) }

## relations
A relation R is a set of ordered elements

a R b 是  { (a1, b1), (a2, b2), (a3, b3), …}

Relation R = { (a1, b1), (a2, b2), (a3, b3), …}
• This is equivalent to: a R b
• Example: Let R be the relation on the set of
integers such that a R b iff a < b
– Then R = { …, (1, 2), (2, 3), (3, 4), … }
• Example: Let R be the relation on the set of
integers such that a R b iff a = −b
– Then R = { …, (1, -1), (2, -2), (3, -3), … }

### binary relations
a binary relation over two sets A and B is a subset of te cartesian product A × B
 { (Dave, cake), (Dave, icecream), (Sara, pie), (Sara, ice cream)}

inverse of a binary relation R is R^-1, 
 { (cake, Dave), (ice cream,Dave), (pie, Sara), (ice cream, Sara)}


### composing relations
The composition of R1 ⊆ A × B and R2 ⊆ B × C,
written R2
° R1 , is
{(a, c) : ∃b ((a, b) ∈ R1 ∧ ((b, c) ∈ R2)}

– Likes = {(Dave, cake), (Dave, ice cream), (Sara, pie),
(Sara, ice cream)}
– Fatgrams = {(cake, 30), (pie, 25), (ice cream, 15)}
– Fatgrams ° Likes = {(Dave, 30), (Dave, 15), (Sara,
25), (Sara, 15)} 

### properties
reflexive ∀x ∈ A ((x, x) ∈ R), 对于所有A中的x，(x,x) 都在R中
symmetric ∀x, y ((x, y) ∈ R → (y, x) ∈ R) 对于所有的x, y，(x,y) 在R 中， (y,x) 就在R中
transitive， ∀x, y, z (((x, y) ∈ R ∧ (y, z) ∈ R) → (x, z) ∈ R)
对于所有 x y z ， 只要(x,y) (y,z) 在R中， 那么(x, z ) 就在R中

### equivalence relations
A relation R ⊆ A × A is an equivalence relation iff it is:
• reflexive
• symmetric
• transitive 

### equivalence classes

for an equivalence relation R, an equivalence class of a is  {b: a R b}

For example, let R = { (1, f), (2, g), (1, h), (2, i),
(3, j), (4, k), (3, l), (4, m) }
– The equivalence class [1] = {f, h}
– The equivalence class [2] = {g, i}
– The equivalence class [3] = {j, l}
– The equivalence class [4] = {k, m}


## functions

## closures

## proof techniques

## alphabets, strings and languages