package com.example.day11;

public class bird {
    public void sing(){
        System.out.println("Put your hands in the air\n" +
                "How y'all feeling out there\n" +
                "We gon' party over here\n" +
                "모두 같이 sing it\n" +
                "Let me hear you say\n" +
                "La la la la la la la la\n" +
                "La la la la la la la la\n" +
                "La la la la la la la la\n" +
                "La la la la la la la la la\n" +
                "I am a good boy\n" +
                "I am a good good\n" +
                "I am a good boy");
    }

}
class pigeon extends bird{
    @Override
    public void sing(){
        System.out.println("lala");
    }
}

class penguin extends bird {
    @Override
    public void sing() {
        System.out.println("lalalaal");
    }
}

