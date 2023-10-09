import java.util.Random;

public class Kadai2{
  public static void main(String[] args){
    System.out.println("問題2-1");
    int money = 99;
    if(money < 100){
      System.out.println("お金が足りません");
    }

    System.out.println("問題2-2");
    int power = 50;
    if(power < 80){
      power = 100;
      System.out.println("パワーが" + power + "になりました");
    }else{
      System.out.println("体力を回復する必要はありません");
    }

    System.out.println("問題2-3");
    Random randomClass = new Random();
    int attack = 0;
    attack = randomClass.nextInt(4);
    switch(attack){
      case 0:
        System.out.println("剣で攻撃！");
        break;
      case 1:
        System.out.println("こぶしで攻撃！");
        break;
      default:
        System.out.println("空振り！");
        break;
    }

    System.out.println("問題2-4");
    int defense = 0;
    defense = randomClass.nextInt(4);
    switch(defense){
      case 0:
        System.out.println("相手の攻撃をかわした！");
        break;
      case 1:
        System.out.println("攻撃を受けた！");
        break;
      default:
        System.out.println("仲間がやられた！");
        break;
    }
  }
}