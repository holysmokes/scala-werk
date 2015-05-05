package xxx.bigsean.apps

object SeanMain extends App {

  // using a value class, you can add methods to any classes (while this implicit class is in scope)
  implicit class RicherIntVector(val vec: Vector[Int]) extends AnyVal {
    def sleepSort(): Unit = {
      vec.par.foreach { i =>
        assert(i > 0, "only positive ints")
        Thread.sleep(i * 100)
        println(i)
      }
    }
  }

  // now there is a "sleepSort" method on vectors of ints
  Vector(50, 100, 1, 2).sleepSort()
}
