public class Status{
  public static void main(String[] args){
    String 名前;
    char 属性;
    int 体力;
    double 経験値;

    名前 = "魔法使い";
    属性 = '魔';
    体力 = 45;
    経験値 = 920.3;
    System.out.println("名前：" + 名前);
    System.out.println("属性：" + 属性);
    System.out.println("体力：" + 体力);
    System.out.println("経験値：" + 経験値);

    System.out.println("魔法で体力を回復！");
    体力 = 体力 + 15;
    System.out.println("現在の体力は" + 体力 + "です");
  }
}