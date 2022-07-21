package project;

public class Taxi extends Traffic{
    String destination; //목적지
    int distance; //목적지까지 거리
    int basic_distance; // 기본거리
    int distance_money; //거리당 요금

    int totmoney; // 누적 요금

    int payMoney;

    public Taxi() {
        this.num = (int) (Math.random()*10);
        max_people = 4;
        money = 3000;
        distance_money=1000;
        basic_distance =1;
        fuel = 100;
        state = "일반";
        speed = 0;
    }

    void viewNumber(int i){
        if(this.num == i){
            System.out.println("같은번호 입니다.");
        }else {
            System.out.println("다른번호 입니다.");
        }
    }

    void inPeople(int people,String station,int distance){
         if(max_people<people){
             System.out.println("최대승객 수 초과");
         }else {
             System.out.println("탑승 승객 수 : "+people);
             System.out.println("잔여 승객 수 : "+(max_people-people));
             System.out.println("목적지 : "+ station);
             System.out.println("목적기까지 거리 : "+distance +"km");
             payMoney = (money + distance_money*(distance-basic_distance));
             System.out.println("지불할 요금 : "+payMoney);
             this.totmoney += payMoney;
             state = "운행중";
         }
    }



    void fuelChange(int fuel){
        this.fuel += fuel;
        System.out.println("주유량 : "+this.fuel);
        if (fuel<=10){
            this.state = "운행불가";
            System.out.println("주유필요!");
        }
    }

    void pay(){
        System.out.println("누적요금 : "+totmoney);
    }



    public static void main(String[] args) {
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        taxi1.viewNumber(taxi2.num);
        System.out.println("주유량 : "+taxi1.fuel);
        System.out.println("상태 : "+ taxi1.state);
        taxi1.inPeople(2,"서울역",2);
        System.out.println("상태 : "+ taxi1.state);
        taxi1.fuelChange(-80);
        taxi1.pay();
        taxi1.inPeople(5,"",0);
        taxi1.inPeople(3,"구로디지털단지역",12);
        taxi1.fuelChange(-20);
        System.out.println("상태 : "+ taxi1.state);
        taxi1.pay();

    }
}
