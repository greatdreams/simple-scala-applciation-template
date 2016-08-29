import org.scalatest.FunSuite
import org.scalatest.Assertions._
/**
  * Created by greatdreams on 8/28/16.
  */
class SetSuite extends FunSuite {
  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException]{
      Set.empty.head
    }
  }
}
