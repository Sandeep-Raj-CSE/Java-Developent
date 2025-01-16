
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
8. containsKet(K)
9. containsValue(V)
10. replace(K,V)
11. replace(K,oldvalue, newValue)
12. remove(K)
13. remove(K,V)
14. keySet()
15. values()
16. entryset()



---------------------- Comprable and Comprator ---------------



/* Notes by chatgpt above things in format*/


1. Framework
   A framework in programming is a pre-built structure that provides reusable code and a foundation for developing software applications. It consists of a collection of classes, interfaces, and pre-configured structures that allow developers to focus on specific functionalities without worrying about the overall architecture.

Advantages of Frameworks:
Consistent API: Frameworks often come with a consistent set of interfaces and libraries, making it easier for developers to integrate different components of the application.
Reduced Programming Effort: Developers can use built-in components instead of reinventing the wheel, reducing coding effort.
Increased Programming Speed: Frameworks streamline the development process by providing solutions for common problems and offering tools to accelerate development.
2. 
3. Exception Handling
   Exception Handling refers to the mechanism in Java that deals with runtime errors and other exceptional events to ensure that the program doesn't terminate abruptly.

Types of Exceptions:
Run-Time Exception (Unchecked Exception): 
These exceptions occur at runtime and are not checked during compile-time.

NullPointerException: 
Occurs when you try to use a reference variable that is null.
ArrayIndexOutOfBoundsException: 
Happens when accessing an invalid index in an array.
ArithmeticException: Example: Division by zero.

Checked Exception: 
These exceptions are checked during compile-time, forcing the programmer to handle them.

IOException: When there are issues with input-output operations (e.g., reading a file that doesn't exist).
Try and Catch Block:
The try-catch block is used to handle exceptions:

java
Copy
try {
// Code that may throw an exception
} catch (ExceptionType e) {
// Code to handle the exception
}
Finally Block:
The finally block is executed no matter what, even if an exception occurs. It’s used to close resources like files or database connections.

java
Copy
try {
// Code that may throw an exception
} catch (ExceptionType e) {
// Exception handling
} finally {
// This block is always executed
}
Throw and Throws:
throws Keyword: Used in method declarations to specify the exceptions a method may throw.
java
Copy
public void someMethod() throws IOException {
// code that might throw IOException
}
throw Keyword: Used to explicitly throw an exception.
java
Copy
throw new NullPointerException("Null value encountered");
3. Wrapper Classes & Autoboxing/Unboxing
   Wrapper Classes:
   Wrapper classes are used to wrap primitive data types into objects. They provide utility methods to convert, compare, and manipulate primitive types.

int → Integer
char → Character
boolean → Boolean
Autoboxing and Unboxing:
Autoboxing: Automatically converts primitive types to wrapper class objects.
java
Copy
int num = 10;
Integer obj = num;  // Autoboxing
Unboxing: Automatically converts wrapper class objects back to primitive types.
java
Copy
Integer obj = 10;
int num = obj;  // Unboxing
4. Generics
   Generics enable types (classes, interfaces, methods) to be parameters in Java, allowing you to create classes, interfaces, and methods with type parameters.

Generic Class Example:
java
Copy
class Box<T> {
private T value;
public void setValue(T value) {
this.value = value;
}
public T getValue() {
return value;
}
}
Here, T can be any data type (e.g., Integer, String, etc.).

5. Java Collections Framework
   The Java Collections Framework provides a set of classes and interfaces for storing and manipulating collections of objects.

Key Interfaces:
Collection: Root interface for all collection classes.
List: Ordered collection that can contain duplicate elements.
Set: Collection that doesn't allow duplicate elements.
Queue: Collection designed for holding elements in a queue.
Map: A collection of key-value pairs.
Common Classes:
ArrayList: A resizable array implementation of List.
LinkedList: A doubly-linked list implementation of List.
HashSet: A set implementation using a hash table.
TreeSet: A set implementation using a red-black tree.
HashMap: A map implementation using a hash table.
6. Collection Methods
   Common methods in Collection interface:

size(): Returns the number of elements.
isEmpty(): Returns true if the collection is empty.
contains(Object o): Returns true if the collection contains the specified element.
add(E e): Adds the element to the collection.
remove(Object o): Removes a specific element.
containsAll(Collection<?> c): Returns true if all elements are present.
7. List Interface
   The List interface extends Collection and defines an ordered collection of elements, allowing duplicates.

ArrayList, LinkedList, Stack, Vector are some common implementations.
8. Queue Interface
   The Queue interface extends Collection and is designed for holding elements in a FIFO (First In, First Out) order.

Methods:
add(E e): Inserts the specified element.
offer(E e): Inserts the specified element, returns true if successful.
remove(): Removes and returns the front element.
poll(): Removes and returns the front element or returns null if empty.
peek(): Retrieves the front element without removing it.
Classes:

ArrayDeque and PriorityQueue are examples of Queue implementations.
9. Set Interface
   The Set interface represents a collection that doesn’t allow duplicate elements.

Common Implementations: HashSet, LinkedHashSet, TreeSet
Methods:

add(E e): Adds an element.
remove(E e): Removes an element.
contains(Object o): Checks if the set contains an element.
size(): Returns the number of elements.
10. Map Interface
    The Map interface represents key-value pairs, where each key is unique.

Common Implementations:
HashMap
TreeMap
LinkedHashMap
Methods:

put(K, V): Inserts a key-value pair.
get(K): Retrieves the value associated with the key.
containsKey(K): Checks if a key exists.
remove(K): Removes the key-value pair.
replace(K, V): Replaces the value associated with the key.
11. Comparable and Comparator Interfaces
    These interfaces are used for sorting objects.

Comparable:

The Comparable interface allows objects to be compared to each other.
It is used for natural ordering (e.g., sorting a list of numbers or strings).
Method: int compareTo(T o)
Example:

java
Copy
class Person implements Comparable<Person> {
String name;
int age;

    public int compareTo(Person p) {
        return this.age - p.age; // Comparing by age
    }
}
Comparator:

The Comparator interface is used to define custom ordering.
It is used when you want to sort objects in different ways, beyond natural ordering.
Method: int compare(T o1, T o2)
Example:

java
Copy
class NameComparator implements Comparator<Person> {
public int compare(Person p1, Person p2) {
return p1.name.compareTo(p2.name); // Comparing by name
}
}
Summary
Framework: Provides reusable components for faster development.
Exception Handling: Mechanism to deal with runtime and compile-time errors.
Wrapper Classes & Autoboxing: Wrapping primitive types in objects for convenience.
Generics: Enables parameterized types for flexibility.
Collections: Provide data structures like List, Set, Queue, and Map for organizing data.
Comparable/Comparator: Interfaces for defining object sorting behavior.





