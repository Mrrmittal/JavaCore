/**
 * Author: Jatin Mittal
 * Date: 04-10-2024
 */

package src.Threads.mockInterviewsOnThreading;

/*
Question: Can you explain thread safety and how you ensure it in Java multithreading?
Solution: Thread safety ensures that shared data is correctly handled when multiple threads are accessing it concurrently.
          When a resource (like a variable or a method) is thread-safe, it prevents issues like race conditions,
          data corruption, and inconsistent states. This is critical in multithreaded applications where threads might
          compete for access to shared data or resources.


          How to Ensure Thread Safety in Java?

          1.) Synchronized keyword: One of the simplest ways to ensure thread safety is by using the synchronized
              keyword to lock critical sections, ensuring only one thread accesses shared resources at a time.

          2.) Locks (ReentrantLock): As you mentioned in previous examples, locks provide more granular control over
              thread synchronization.

          3.) Volatile Keyword: This ensures visibility of changes to variables across threads. It prevents threads
              from caching variables locally.

          4.) Atomic Variables: Using classes like AtomicInteger, AtomicReference, etc., can provide thread-safe
              operations on single variables without requiring synchronization.

          5.) Immutable Objects: If a resource is immutable (cannot be changed after it's created),
              it's inherently thread-safe since its state can’t change.

          6.) Concurrent Collections: Java provides thread-safe collection classes like ConcurrentHashMap
              or CopyOnWriteArrayList that can be used safely in multithreaded environments.
 */


public class _06_Question {
}
