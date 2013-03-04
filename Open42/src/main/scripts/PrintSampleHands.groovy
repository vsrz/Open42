package open42

public class Open42 {
	/**
	 * @param args
	 */
	public static void main(def args) {
		def my42Game = new game.FourtyTwoGame()

		(1..5).each {
			println "This hand: "
			my42Game.shuffleDominos()
			my42Game.drawHands()
			my42Game.players.each {
				println it.getHand().toString() + " - " + it.getHand().getBasicBid()
			}
		}
	}
}