package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.Game;
import sample.config.DiceGameConfig;

public class SpringExam02 {

	public static void main(String[] args) {
		System.out.println("ApplicationContext 생성전!!");
//		ApplicationContext context = new ClassPathXmlApplicationContext("diceGame.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(DiceGameConfig.class);
		System.out.println("ApplicationContext 생성후!!");
		
		
//		Dice dice = context.getBean(Dice.class);  //DL
//		
//		System.out.println(dice.getNumber());
//		
//		Player player = context.getBean("kang",Player.class);
//		
//		player.play();
		
		Game game = context.getBean(Game.class);
		game.play();
	}

}
