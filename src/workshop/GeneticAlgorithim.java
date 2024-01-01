package workshop;

import java.util.ArrayList;
import java.util.Random;
import sandbox.Bot;


public class GeneticAlgorithim {

	public ArrayList<Bot> population = new ArrayList<Bot>();

	public final int populationSize = 200;
	Random random = new Random();

	public void initPopulation() {
		/*
		* Fill the population list with some random bots ( use the static createBot method from SandboxSettings)
		* Remember the weights from the neural network that are returned from the createBot method all start at 0 
		* If you want a faster start for the algorithim you need to randomize all the weights here
		*/
	}


	
	public void evaluateBot(Bot b) {
		
		/*
	 	* Gets called for every Bot in every frame of the simulation
		* Find some kind of metric, that rates how good the bot is at doing what you want it to do
		* In this implementation a lower score is BAD!!!
		* Remember the botGoalPosition is in SandboxSettings you NEED it for this
		* SandboxSettings.botGoalPosition
		* The Bot and Vector2 object has a lot of methods you can use so look for something usefull!
	 	*/
	}

	public void calculateNextPopulation(int genNumber) {
		
		// The current population is inside the list: population.
		// IT IS SORTED FOR YOU (high to low | best to worst)
		// At the end of this method the population list should be filled with the next generation

		/*
		 * General Approach:
		 * Delete the worst ones 
		 * Create slightly altered copies of the best ones
		 * ( Mutations, Crossover or Both?)
		 * Add the best ones and the new ones to a list
		 * replace population list with your list
		 */

		 /*
		 * genNumber tells you which generation this algorithm is at, if you want you
		 * can use this to alter the chance and power of
		 * mutations, so they start of strong but get weaker with time
		 * 
		 * Alternatively you could put the mutation power values inside the bot and make it part of its gene pool
		 * therefore the algorithim would choose the mutation rates by itself ( bot.mutationPower | bot.mutationChance are 
		 * unused fields you can use for this ) 
		 * 
		 * Or you could just set the power of the mutations to one value and see how far you get with a simple approach
		 */

	}



}
