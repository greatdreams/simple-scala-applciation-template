import org.scalatest.{FlatSpec, GivenWhenThen}

/**
  * Created by greatdreams on 8/30/16.
  */
class Set1Spec extends FlatSpec with GivenWhenThen {
  "A mutable Set" should "allow an element to be added" in {
    Given("an empty mutable Set")
    var set = Set.empty[String]

    When("an element is added")
    set += "clarity"

    Then("the Set should have size 1")
    assert(set.size == 1)

    And("the Set should contain the added element")
    assert(set.contains("clarity"))

    info("That's all folks")
  }
}
