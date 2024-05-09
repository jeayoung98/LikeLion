package tv;

public class TvFactory {
    public static TV getTv(String tvName) {
        TV tv = null;
        if ("STV".equalsIgnoreCase(tvName)) {
            tv = new STV();
        } else {
            tv = new LTV();
        }
        return tv;
    }
}
