package sample.run;

import sample.bean.Game;
import sample.config.GameConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEx2 {
    public static void main(String[] args) {
        System.out.println("공장 생성 전");
        ApplicationContext ac = new AnnotationConfigApplicationContext(GameConfig.class);
        System.out.println("공장 생성 후");

        Game game = ac.getBean(Game.class);
        game.play();
    }
}
