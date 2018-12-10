package example

object FunctionsAreObjects {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def timeFlies() {
    println("time flies like an arrow...")
  }
  def main(args: Array[String]) {
    //oncePerSecond(timeFlies)

    //Timer Anonymous function
    oncePerSecond(()=> println("time flies like an arrow..."))
  }
}
