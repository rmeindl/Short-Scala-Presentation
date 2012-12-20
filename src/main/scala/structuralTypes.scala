def using[A <: {def close(): Unit}, B](param: A)(f: A => B): B = {
  try {
    f(param)
  } finally {
    try {
      param.close()
    } catch { case _ : Throwable => () }
  }
}

val message = using(new java.io.ByteArrayInputStream("hello world".getBytes)) { in =>
  io.Source.fromInputStream(in).mkString
}

println(message)
