package tv;

public class LTV implements TV{
    private boolean power;
    // 기능 끄다
    // 기능 켜다
    @Override
    public void turnOn() {
        this.power = true;
        System.out.println("전원을 킵니다");
    }
    @Override
    public void turnOff() {
        this.power = false;
        if(power) System.out.println("이미 꺼져있습니다.");
        else System.out.println("전원을 끕니다");

    }
    @Override
    public void soundUp() {
        if(power) System.out.println("소리를 키웁니다");
        else System.out.println("전원을 먼저 키세요");
    }
    @Override
    public void soundDown() {
        if(power) System.out.println("소리를 줄입니다.");
        else System.out.println("전원을 먼저 키세요");
    }
}
