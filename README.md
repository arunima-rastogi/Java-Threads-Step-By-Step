# Java-Threads-Step-By-Step


## How to avoid issues with multiple threads



**1 - How to avoid deadlocks?**

i)Avoid Nested Locks:
      This is the main reason for deadlock. Deadlock mainly happens when we give locks to multiple threads. Avoid giving locks to multiple threads if you already have given to one.

ii)Avoid Unnecessary Locks:
   You should lock only those members which are required. Having unnecessary locks can lead to a deadlock. As a best practice, try to reduce the need to lock things as much as you can.



**2 - How to avoid race conditions?**

Race conditions occur within the critical section of your code. These can be avoided with proper thread synchronization within critical sections by using techniques like locks, atomic variables, and message passing.



**3 - How to avoid starvation?**
The best way to avoid starvation is to use a lock such as ReentrantLock or a mutex. This introduces a “fair” lock which favors granting access to the thread that has been waiting longest. If you wanted to have multiple threads run at once while preventing starvation, you can use a semaphore.


**4 - How to avoid livelocks?**
 Livelocks can be avoided by making use of ReentrantLock as a way to determine which thread has been waiting longer so that you can assign it a lock. As a best practice, don’t block locks; if a thread can’t acquire a lock, it should release previously acquired locks to try again later.
 
 
 
 
 
 Refer : https://www.educative.io/courses/java-multithreading-for-senior-engineering-interviews
 
 
https://www.educative.io/blog/java-multithreading-and-concurrency-what-to-know-for
