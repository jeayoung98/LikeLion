package tv;

public class TvUser {
    public static void main(String[] args) {

//        STV tv = new STV();
//        tv.powerOn();
//        tv.soundUp();
//        tv.powerOff();
//        tv.soundDown();
//        tv.powerOff();

//        LTV tv = new LTV();
//        tv.turnOn();
//        tv.volumeUp();
//        tv.volumeDown();
//        tv.turnOff();

        TV tv = new STV();

        tv.turnOff();
        tv.turnOn();
        tv.soundUp();
        tv.soundDown();
    }
}
