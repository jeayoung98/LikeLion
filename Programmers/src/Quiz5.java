public class Quiz5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;

        for(int i = code-1;i<=cipher.length();i+=code){
            sb.append(cipher.charAt(i));
        }


        System.out.println(sb.toString());
    }
}
