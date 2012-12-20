import scala.language.dynamics

object JSON extends Dynamic {
  def applyDynamicNamed(name: String)(args: (String, Any)*) {
    println(s"""Creating a $name, for:\n "${args.head._1}": "${args.head._2}" """)
  }
}

JSON.node(nickname = "ktoso")