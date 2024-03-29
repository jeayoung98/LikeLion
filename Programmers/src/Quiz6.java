public class Quiz6 {
    public static void main(String[] args) {
        // 가위 2
        // 바위 0
        // 보 5
        StringBuilder sb = new StringBuilder();
        String rsp = "205";
        String answer = "";
        for(int i =0; i<rsp.length();i++){
            if((rsp.charAt(i)+"").equals("2")){
                sb.append("0");
            }
            else if((rsp.charAt(i)+"").equals("0")){
                sb.append("5");
            }
            else if((rsp.charAt(i)+"").equals("5")){
                sb.append("2");
            }
        }
        System.out.println(sb.toString());
    }
}
