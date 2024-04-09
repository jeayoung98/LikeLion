package com.example.day10;

// Bird 클래스 정의
class Bird {
    public void makeSound() {
        // 기본적으로 아무 소리도 내지 않음
        System.out.println("No sound");
    }
}

// Parrot 클래스 정의
class Parrot extends Bird {
    @Override
    public void makeSound() {
        System.out.println("안녕");
    }
}

// Sparrow 클래스 정의
class Sparrow extends Bird {
    @Override
    public void makeSound() {
        System.out.println("짹짹");
    }
}

// Pigeon 클래스 정의
class Pigeon extends Bird {
    @Override
    public void makeSound() {
        System.out.println("구구");
    }
}

public class Test6 {
    public static void main(String[] args) {
        // 명령줄 인수가 없을 경우 기본적으로 비둘기의 소리 출력
        Bird bird = new Pigeon();

        if (args.length > 0) {
            // 첫 번째 인수에 따라 새 객체를 선택
            switch (args[0]) {
                case "앵무새":
                    bird = new Parrot();
                    break;
                case "참새":
                    bird = new Sparrow();
                    break;
                default:
                    // 인수가 없거나 다른 값이 들어온 경우 비둘기 소리 출력
                    System.out.println("인식할 수 없는 새입니다.");
            }
        }

        // 선택된 새가 소리 내도록 함
        bird.makeSound();
    }
}
