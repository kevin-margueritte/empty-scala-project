package kmargueritte

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MainSpec extends AnyWordSpec with Matchers {

  "Main" should {
    "compute correctly 1 + 1" in {
       1 + 1 shouldBe(2)
    }
  }

}
