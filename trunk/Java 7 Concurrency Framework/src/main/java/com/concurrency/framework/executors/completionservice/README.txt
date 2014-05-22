####### Separating the launching of tasks and the processing of their results in an executor #######

Normally, when you execute concurrent tasks using an executor, you will send Runnable
or Callable tasks to the executor and get Future objects to control the method. You can
find situations, where you need to send the tasks to the executor in one object and process
the results in another one. For such situations, the Java Concurrency API provides the
CompletionService class.

There are some cases in which performing tasks in parallel can be useful. This option is especially attractive when:
the tasks are independent of each other, but do essentially the same thing
the tasks are limited by slow operations - typically, network access or disk access
A good example of this comes from web site administration. Administrators need to monitor a set of N web sites,
so they might send a 'ping' of some sort to each site, to see if a healthy response is returned in each case.
Note that these pings fit the above criteria - each ping is independent of the others, and yet is essentially the same task.

Below is an example implementation of this idea. For purposes of comparison, this example actually has 3 different implementations:

#1 execute tasks in parallel, and report the result of each task as soon as it completes.
#2 execute tasks in parallel, but report the results of all tasks only at the end, after they have all completed.
#3 execute tasks serially, one after the other, and all within a single thread; report each task as it completes.

