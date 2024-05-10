public class SingleTon1 {
  // (1)eager pattern 饿汉式
  // 1) private constructor
  // 2) create the instance within the class
  // 3) create a public static method
  // 在类加载时创建 Singleton 实例。这种方式线程安全，
  // 但即使不使用 Singleton 实例也会初始化。资源浪费
  private static final SingleTon1 girlfriend = new SingleTon1("yujin");

  private String name;

  private SingleTon1(String name){
    System.out.println("the constructor runs");
    this.name = name;
  }

  public static SingleTon1 getInstance(){
    return girlfriend;
  }

}

class testSingleTon1{

  public static void main(String[] args) {
      SingleTon1 a = SingleTon1.getInstance();
      SingleTon1 b = SingleTon1.getInstance();
      System.out.println(a == b);
  }


}