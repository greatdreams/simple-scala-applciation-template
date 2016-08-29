import org.scalatest._

import scala.collection.mutable

class HelloSpec extends FlatSpec with Matchers {
  "Hello" should "have tests" in {
    true should === (true)
  }

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new mutable.Stack[Int]

    stack.push(1)
    stack.push(2)
    stack.pop should be (2)
    stack.pop should be (1)
  }

  it should "throw NoSuchElementException if an empty stack is popped " in {
    val emptyStack = new mutable.Stack[Int]
    a [NoSuchElementException] should be thrownBy {
      emptyStack.pop()
    }
  }
}
