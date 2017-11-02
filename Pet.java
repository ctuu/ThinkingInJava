abstract class Pet{
      private String name;
      private int health;
      private int intimacy;
      public Pet(String name,int health,int intimacy){
          this.name=name;
          this.health=health;
          this.intimacy=intimacy;
      }
      public String getName(){return name;}
      public int getHealth(){return health;}
      public int getInti(){return intimacy;}
      public void sete1(){
          health=health+3;
      }
      public void sete2(){
          health=health-10;
      }
      public void setp1(){
          intimacy=intimacy+5;
      }
      abstract public void eat();
      abstract public void play();
  }
  class Dog extends Pet{
      private String breed;
      public Dog(String name,int health,int intimacy,String breed){
          super(name,health,intimacy);
          this.breed=breed;
      }
      public void eat(){
          if (getHealth()<100){
              sete1();
              System.out.println("吃饱饭了！");
          }else {
              System.out.println("狗狗：需要多运动啊！");
          }
      }
      public void play(){
          if (getHealth()>=60){
              sete2();
              setp1();
              System.out.println("狗狗：飞碟游戏好好玩！");
          }else {
              System.out.println("生病了！");
          }
      }
  }
  class Cat extends Pet{
      private String color;
      public Cat(String name,int health,int intimacy,String color){
          super(name,health,intimacy);
          this.color=color;
      }
      public void eat(){
          if (getHealth()<100){
              sete1();
              System.out.println("吃饱饭了！");
          }else {
              System.out.println("猫咪：先别吃了吧！");
          }
      }
      public void play(){
          if (getHealth()>=60){
              sete2();
              setp1();
              System.out.println("猫咪：线球是我的最爱！");
          }else {
              System.out.println("生病了！");
          }
      }
  }
  class Others extends Pet{
      public Others(String name,int health,int intimacy){
          super(name,health,intimacy);
      }
      public void eat(){
          if (getHealth()<100){
              sete1();
              System.out.println("吃饱饭了！");
          }else {
              System.out.println("其他：再吃就撑死了！");
          }
      }
      public void play(){
          if (getHealth()>=60){
              sete2();
              setp1();
              System.out.println("其他：有主人陪好幸福");
          }else {
              System.out.println("生病了！");
          }
      }
  }
  class Petclass {
      public static void main(String[] args) {
          Dog dog=new Dog("k", 0, 0, "black");
      }
  }