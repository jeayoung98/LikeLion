package lv0;

public class Quiz16 {
    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
        String answer = "";
        int id = 0;
        int pw = 0;
        for(int i = 0 ; i < db.length;i++){
            id = 0;
            pw = 0;
            if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])){
                answer = "login";
            }
            else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])){
                answer = "wrong pw";
            }
            else if(!id_pw[0].equals(db[i][0])){
                answer = "fail";
            }
        }

        System.out.println(answer);
    }
}
