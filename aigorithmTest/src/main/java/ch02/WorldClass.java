package ch02;

public class WorldClass {
    String team;
    String player;
    int winner;

    WorldClass(String team, String player, int winner) {
        this.team = team;
        this.player = player;
        this.winner = winner;
    }

    void displayInfo() {
        System.out.printf("팀 이름 : %s \n대표 선수 : %s \n챔스 우승 횟수 : %d", team, player, winner);
    }
}
