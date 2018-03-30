## Threads and Synchronization

This lab illustrates the problem of synchronization when many threads are operating on a shared object.  The general issue is called "thread safety", and it is a major cause of errors in computer software.

## Assignment

To the problems on the lab sheet and record your answers here.

1. Record average run times.
2. Write your explanation of the results.  Use good English and proper grammar.  Also use good Markdown formatting.

## ThreadCount run times

These are the average runtime using 3 or more runs of the application.
The Counter class is the object being shared by the threads.
The threads use the counter to add and subtract values.

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  | 10,000,000         | 0.014275        |
| Using ReentrantLock     | 10,000,000         | 1.243944        |
| Syncronized method      | 10,000,000         | 0.594831        |
| AtomicLong for total    | 10,000,000         | 0.304868        |

## 1. Using unsynchronized counter object <br>
**1.1,1.3** A result should be zero but it didn't be zero and it didn't have a same value every time because threads can access and change a data at a same time change a resource at a same time you don't know the order which threads will access to a data.

## 2. Implications for Multi-threaded Applications
  For example if we have 20 baht in account and I want to withdraw 20 baht at the same time. It may have a conflict because 2 threads work at the same time that make it didn't update balance so you can get 40 baht from withdraw.

## 3. Counter with ReentrantLock
**3.1,3.2** It's always be zero because lock is prevent another process to use this resource another process can use it until this resource is unlock moreover you can specify where did you want to lock.<br>
**3.3** From last question reentrantlock is prevent another process to use this resource we use lock when it have more than one processes running at the same time to avoid race conditon.<br>
**3.4** Because we need to free this resource for another processes to used it.

## 4. Counter with synchronized method
**4.1,4.2** It's always be zero because lock is prevent another process to use this resource another process can use it until previous process is finished.<br>
**4.3** From last question synchronized is prevent another processes to use this resource we use synchronized when it have more than one processes running at the same time to avoid race conditon.

## 5. Counter with AtomicLong
**5.1** Because when use AtomicLong it will keep an old reference in memory and check wheter after operation it have been changed by another processes or not if not it will write a new result to memory so it will still fixes and error.<br>
**5.2** Because it's a fastest method when we use for a numeric attribute but if we don't use it for numeric attribute we should use another thread safe solution.

## 6. Analysis of Results
**6.1** Atomic method is fastest,ReentrantLock is slowest.<br>
**6.2** I think I should use synchronized because it can use for every data type and faster than lock method.
