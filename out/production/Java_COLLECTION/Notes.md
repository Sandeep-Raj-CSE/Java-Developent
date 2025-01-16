
- what is framework
  set of class and interface which provide the readymade architecture
  
Advantage
1. Consistent API
2. Reduce programming effort
3. increase programming spped

class
-


Exception Handling

- Run Time Exception (unchecked exception)
  - mainly due to programming error
  - Null Pointer exception - 
  - Out of bound exception
  - Dividing by zero
- Java IO exception (checked exception)
 - they checked at compile time
 - filenotfound 


Try and Catch Block

- used to handle the exception and prevent abnormal termination of 
- program


try{
}catch(){
}


Finally block - exception ho yaa naa ho hm honge run


- throw amnd throws

throws keyword in method declaration to declare the type of exception  
may be occure with in it


- throw keyword is used to explicity throw a single exception



-------Generic && Wrapper Class ------

1. Wrapper Classes 
   - is a class whose object wraps or cointains primitive data types
   - char - wrapper class Character
   - object of wrapper class in which we can store primitive data

2. AutoBoxing and Unboxing
  - automatic conversion of primitive to the object of the wrapper class 
  - int to Integer
  - unboxing reverse of auto boxing

3. Generics
   - Generics means parameterized types 
   - means that classes work with different data types
4. Java Generic method



--- COllection Frame work --

it provide the set of interface and class the data structure



1. Java collection interface 
   -  collection interfave is root of interface of collection framework
   - List set queue ( deque)
   

Methods 

1. size()
2. isEmpty
3. contains(Object o)
4. boolean add(E e)
5. remove (Object o)
6. containsAll



Java List Interface

-  List interface extends the collection interface and add method to
- specific the list

                 Collection
-                     List
-                         ArrayList   LinkedList Stack Vector






Queue - Interface extends collection interface

Queue - Array Deque , LinkedList , PriorityQue



method of queue

- add(E e)
- offer(E e) - insert the specified element  then return true or false
- remove()
- poll - return null if queue is empty
- element() - reterive element from front the queue  return null
- peek()  - reteriver does not return null


ArrayDeque class


- adding Element
- addFirst(E e)
- addLast(E e)

D

Stack and queue using arrayDeque

- push(E e) - push the element form queue
- pop() - pop the elemeny from stack

- add(E e) or offer(E e) - add end of queue
- remove() or poll () -  remove and return first element from deque
]]



-----------------------------

Java Set interface

- the set interface provide mathematical set in java
- it extend from collection framework


set - implements - EnumSets , HashSet , LinkedHashset , TreeSet


methods

- add()
- addAll()
- remove()
- removeAll()
- retainAll()
- size()
- clear()
- contains()




-- Map interface ---


map (implements) - key value pairs

1. HashMap
2. TreeMap
3. EnumMap
4. LinkedHashMap
5. WeakHashMap



Methods of Map

1. put(K,V)
2. putAll()
3. putIfAbsent(K,V)
4. get(K)
5. getOrDefault(K,defaultValue)
6. containsKey(K)
7. remove

