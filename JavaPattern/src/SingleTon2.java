public class SingleTon2 {
  // (1)lazy pattern 懒汉式   (may have thread safe problem)
  // 1) private constructor
  // 2) create the static object but not initialize
  // 3) create a public static method, return a rabbit obj
 // 4. when user use getInstance, then return the obj, and later call
  // return the same obj,   =>   singleTon
  private String name;

  private static SingleTon2 rabbit;

  public static int v = 2;

  private SingleTon2(String name){
    System.out.println("constructor is running");
    this.name = name;
  }

  public static SingleTon2 getInstance(){
    if (rabbit == null){
      rabbit = new SingleTon2("Wonyoung");
    }
    return rabbit;
  }
}

class testSingleTon2{

  public static void main(String[] args) {
    System.out.println(SingleTon2.v); // not run constructor
    System.out.println("-------------");
    SingleTon2.getInstance();
    SingleTon2.getInstance();
  }
}