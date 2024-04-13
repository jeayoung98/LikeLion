package com.example.day13;

public class SmartPhone {
    public interface Camera {
        void takePhoto();
    }

    public class BasicCamera implements Camera {
        @Override
        public void takePhoto() {
            System.out.println("사진을 찍습니다.");
        }
    }

    public void activateCamera() {
        Camera camera = new BasicCamera();
        camera.takePhoto();
    }
}
