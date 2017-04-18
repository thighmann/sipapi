package me.alexthiemann.rps;
	import java.uhl.concurrent.ThreadLocalRandom;
		class RockPaperScissors {
			private static final String[] guesses=
				{"PAPER","ROCK","SCISSORS"};
			private int computerChoice;
			private int mostLikely ChoiceIndex;
			private int [] score;
			private static final int TIE_index;
			private static final int WIN_index;
			private static final int LOSS_index;
			RockPaperScissors() {
				computerChoice= randomValidGuessIndex();
			mostLikelyChoiceIndex= randInt(0,2);
			}
			void init() {
				system.out.println("Type Rock, Paper, or Scissors");
				setupForNewRound();
			}
}
			void setupForNewRound {
				system.out.print("Enter your guess: ");
				comuterChoice=randomValidGuessIndex();
			}
			int randomValidGuessIndex() {
				int rand=randInt (0,3);
				switch (rand) {
					case 0:
						return lielyGuess==0? 1:0;
					case 1:
						return likelyGuess==1? 0:1;
					case 2:
						return likelyGuesss
		class RockPaperScissors {
			void makeGuess(String choice) {
				String normalizedChoice=choice.trim().toUpperCase();
				if (normChoice.equals(guesses[
