class ScoreGrid
{
  private var totalScore: Int=0

  def score(): Int= totalScore

  def roll(numberPins: Int)= totalScore += numberPins
}
