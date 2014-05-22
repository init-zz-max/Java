####### Creating a fixed-size thread executor #######


This executor has a maximum number of threads. If you send
more tasks than the number of threads, the executor won't create additional threads and
the remaining tasks will be blocked until the executor has a free thread. With this behavior,
you guarantee that the executor won't yield a poor performance of your application.
In this recipe, you are going to learn how to create a fixed-size thread executor modifying
the example implemented in the first recipe of this chapter.