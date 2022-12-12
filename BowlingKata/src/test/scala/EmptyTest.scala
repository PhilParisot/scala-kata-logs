import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

//void roll(int)
//int score()

class EmptyTest extends AnyFunSuite with Matchers{
  test("initial score should be 0") {
    val scoreGrid = new ScoreGrid()
    assert(scoreGrid.score() === 0)
  }

  test("One roll of 5 pins should score 5 total points") {
    val scoreGrid = new ScoreGrid()

    scoreGrid.roll(5)

    assert(scoreGrid.score() === 5)
  }

  test("Two rolls of 5 pins should score 10 total points") {
    val scoreGrid = new ScoreGrid()

    scoreGrid.roll(5)
    scoreGrid.roll(5)

    assert(scoreGrid.score() === 10)
  }
}