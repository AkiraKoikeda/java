public class Kadai6{
  public static void main(String[] args){
    System.out.println("問題6");
    walk();
    talk();
    walk();
    intoStore();
  }

  static void walk(){
    System.out.println("歩いた");
  }

  static void talk(){
    System.out.println("村人に話しかけた");
  }

  static void intoStore(){
    System.out.println("お店に入った");
    System.out.println("商品を買った");
  }
}