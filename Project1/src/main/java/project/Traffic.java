package project;

import jdk.jfr.internal.tool.Main;

import java.lang.annotation.Target;

public class Traffic  {
     int num; // 번호 랜덤으로 지정
     int fuel; //  기름량
     int speed; // 속도
     int change_speed; //속도 변경
     int max_people; // 최대승객수
     int current_people; // 현재 승객수
     String state; //운행시작
     int money; // 요금

     // 이 클래스는 상속을 할거기 때문에
     // 굳이 생성자를 만들 필요가 없다
     // 생성자는 이곳에서 사용하기 위해서 필요한것!

     /*public Traffic(int speed, int change_speed, int max_people, int current_people, String state, int money) {
          this.speed = speed;
          this.change_speed = change_speed;
          this.max_people = max_people;
          this.current_people = current_people;
          this.state = state;
          this.money = money;
     }money*/

}






