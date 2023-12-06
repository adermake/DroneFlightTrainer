package workshop;

import sandbox.Bot;
import sandbox.ScoreSetting;
import sandbox.TargetSetting;
import sandbox.Thruster;
import utils.Vector2;

public class SandboxSettings {


	public static Vector2 botSpawnPosition = new Vector2(0,0);
	public static Vector2 botGoalPosition = new Vector2(0,-400);
	public static TargetSetting targetSetting = TargetSetting.CANT_CATCH_ME;
	public static ScoreSetting scoreSetting = ScoreSetting.AVERAGED_SCORE;
	
	public static Bot createBot() {

		Vector2 upDirection = new Vector2(0, 1);

		Bot bot = new Bot(botSpawnPosition,upDirection);
		
		// Basic drone with two thrusters
		bot.addTruster(new Thruster(new Vector2(60, 0), new Vector2(0, -1), 150, 5));
		bot.addTruster(new Thruster(new Vector2(-60, 0), new Vector2(0, -1), 150, 5));
	
		/*
		  //Cofiguration for spinning drone
		Vector2 ruler = new Vector2(0,65);
		for (int i = 360;i > 0;i -= 360/6) {
			bot.addTruster(new Thruster(Vector2.turnDeg(ruler, i), Vector2.turnDeg(ruler, i+90), 305, 5));
			
		}
	 	*/

		bot.assemble();
		return bot;

	}
}
