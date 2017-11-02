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
              System.out.println("�Ա����ˣ�");
          }else {
              System.out.println("��������Ҫ���˶�����");
          }
      }
      public void play(){
          if (getHealth()>=60){
              sete2();
              setp1();
              System.out.println("�������ɵ���Ϸ�ú��棡");
          }else {
              System.out.println("�����ˣ�");
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
              System.out.println("�Ա����ˣ�");
          }else {
              System.out.println("è�䣺�ȱ���˰ɣ�");
          }
      }
      public void play(){
          if (getHealth()>=60){
              sete2();
              setp1();
              System.out.println("è�䣺�������ҵ����");
          }else {
              System.out.println("�����ˣ�");
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
              System.out.println("�Ա����ˣ�");
          }else {
              System.out.println("�������ٳԾͳ����ˣ�");
          }
      }
      public void play(){
          if (getHealth()>=60){
              sete2();
              setp1();
              System.out.println("����������������Ҹ�");
          }else {
              System.out.println("�����ˣ�");
          }
      }
  }
  class Petclass {
      public static void main(String[] args) {
          Dog dog=new Dog("k", 0, 0, "black");
      }
  }