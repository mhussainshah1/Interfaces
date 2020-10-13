package oop;
interface Walk{
    public default int getSpeed(){
        return 10;
    }
}
interface Read {
    public default int getSpeed(){
        return 2;
    }
}
public class Bob implements Walk, Read{

    @Override
    public int getSpeed() {
        return 0;
    }

    public int getWalkSpeed(){
        return Walk.super.getSpeed();
    }

    public static void main(String[] args) {
        System.out.println(new Bob().getSpeed());
        System.out.println(new Bob().getWalkSpeed());
    }
}
