###
What is Multitasking
- do multiple tasks simultaneously

###
1. Process Based Multitasking
   allows multiple process (i.e. programs) to run concurrently

###
2. Thread Based Multitasking
   allows multiple parts of same program to run concurrently

###
Thread vs Process
- Thread is basic lightweight unit of execution within process VS Process is basic unit of execution within program.
- Threads within the same process share the same memory space and resources - can intercommunicate easily VS
  Each process has its own address space and cannot directly access the memory or resources of other processes.
- Context switching bet threads is usually less expensive than bet processes.
- The cost of communication bet threads is relatively lower than bet processes.

###
Single Threaded Environment
- tasks run sequentially (one after another)

###
Multithreading Environment
- tasks run concurrently (one with another)             //Idle CPU time to be put to good use

###
How to create Thread
- implement java.lang.Runnable interface
- extend Thread class