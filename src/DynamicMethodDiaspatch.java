package com.company;
class phone5{

    public void showtime(){
        System.out.println("time is 7:00 am");
    }
    public void on(){
        System.out.println("the phone is turning on");
    }
}
class smartphone extends phone5{

    @Override
    public void on(){
        System.out.println("the smartphone is turning on");
    }
    public void playmusic(){
        System.out.println("playing music");
    }

}
public class DynamicMethodDiaspatch {
    public static void main(String[] args) {
        phone5 vivo=new smartphone();
        vivo.showtime();
        vivo.on();


    }
}
