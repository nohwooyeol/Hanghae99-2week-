package project;

import java.security.Principal;
import java.security.PublicKey;
import java.util.Currency;
import java.util.Stack;

public class Bus extends Traffic{

    public Bus() {
        num = (int) (Math.random()*10);
        fuel = 100;
        speed = 0;
        money = 1000;
        state = "운행";
        max_people = 30;
    }

    void viewNumber(int i){
        if(this.num == i){
            System.out.println("같은번호 입니다.");
        }else {
            System.out.println("다른번호 입니다.");
        }
    }

    void inPeople(int i){
        if(max_people<i){
            System.out.println("최대 승객수 초과");
        }else {
            System.out.println("탑승 승객 수 : " +i);
            System.out.println("잔여 승객 수 : "+(max_people-i));
            System.out.println("요금 확인 : "+(money*i));
            state="차고지행";
        }
    }

    void changeFuel(int i){
        this.fuel += i;
        if(this.fuel<10){
            System.out.println("주유필요");
            this.state="차고지행";
        }
        System.out.println("주유량 : "+ this.fuel);
    }

    void changeState(){
        state = state.equals("차고지행") ? "운행중" : "차고지행";
    }




    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        bus1.viewNumber(bus2.num);
        bus1.inPeople(2);
        bus1.changeFuel(-50);
        bus1.changeFuel(10);
        System.out.println("상태 : "+ bus1.state);
        System.out.println("주유량 : "+ bus1.fuel);
        bus1.inPeople(45);
        bus1.inPeople(5);
        bus1.changeState();
        bus1.changeFuel(-55);
        System.out.println("상태 : "+ bus1.state);




















    }
}
