public class Kadai7{
  public static void main(String[] args){
    int money = 1000;
    walk("城下町");
    System.out.println("所持金：" + money);
    System.out.println();

    money = walk(money);
    System.out.println("所持金：" + money);
    System.out.println();

    money = walk("好青年", money);
    System.out.println("所持金：" + money);
  }

  static int walk(int money){
    System.out.println("歩いたらお金を拾った");
    money = money+100;
    return money;
  }

  static void walk(String place){
    System.out.println(place + "へ歩いた");
  }

  static int walk(String target, int money){
    System.out.println(target + "に話しかけた");
    money = money - 500;
    System.out.println("お金を落とした");
    return money;
  }
}