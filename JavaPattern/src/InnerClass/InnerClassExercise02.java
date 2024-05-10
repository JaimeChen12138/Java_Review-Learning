package InnerClass;

public class InnerClassExercise02 {

  public static void main(String[] args) {
    Cellphone c = new Cellphone();

    c.alarmclock(new Bell() { // runtime type is anoymous inner class type
      @Override
      public void ring() {
        System.out.println("懒猪起床了");
      }
    });

    c.alarmclock(new Bell() {
      @Override
      public void ring() {
        System.out.println("prepare for internship");
      }
    });
  }

}

interface Bell{
  void ring();
}

class Cellphone{
  public void alarmclock(Bell bell){
    bell.ring();
  }

}