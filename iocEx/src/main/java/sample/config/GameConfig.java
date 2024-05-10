package sample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import sample.bean.Dice;
import sample.bean.Game;
import sample.bean.Player;

import java.util.List;

//@ComponentScan(basePackages = "sample.bean.")
@PropertySource({"classpath:game.properties"}) // classpath ->
public class GameConfig {

    @Bean
    public Dice dice(@Value("${face}") int face) {
        return new Dice(face);
    }

    @Bean
    public Player jung(Dice dice) {
        Player player = new Player();
        player.setDice(dice); //dice를 주입하고 있는 코드 - 설정자 방식으로 주입
        player.setName("jung");
        return player;
    }
    @Bean
    public Player hong(Dice dice) {
        Player player = new Player();
        player.setDice(dice); //dice를 주입하고 있는 코드 - 설정자 방식으로 주입
        player.setName("hong");
        return player;
    }
    @Bean
    public Player kim(Dice dice) {
        Player player = new Player();
        player.setDice(dice); //dice를 주입하고 있는 코드 - 설정자 방식으로 주입
        player.setName("kim");
        return player;
    }
    @Bean
    public Player lee(Dice dice) {
        Player player = new Player();
        player.setDice(dice); //dice를 주입하고 있는 코드 - 설정자 방식으로 주입
        player.setName("lee");
        return player;
    }


    @Bean
    public Game game(List<Player> players) {
//        return new Game(players); // 생성자 주입
        Game game = new Game(); // 설정자 주입
        game.setList(players);
        return game;
    }
}
