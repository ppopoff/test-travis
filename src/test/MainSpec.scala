import org.scalatest._

class MainSpec extends FunSpec with Matchers {
  describe("Simple test") {
    it ("tests arithmetic") {
      2 + 2 should be (4)
      7 * 8 should be (56)
      8 * 8 should be (64)
    }
  }
}
