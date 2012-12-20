import collection.parallel.ThreadPoolTaskSupport
import java.util.concurrent.ScheduledThreadPoolExecutor

def time[A](f: => A) = {
  val start = System.nanoTime
  val retVal = f
  println("time: "+(System.nanoTime - start)/1e6 + " ms")
  retVal
}

val list = (1 to 1000000).toList.par
val result = time { list.map(_ + 42) }

list.tasksupport = new ThreadPoolTaskSupport(new ScheduledThreadPoolExecutor(1))
val resultSingleThreaded = time { list.map(_ + 42) }
