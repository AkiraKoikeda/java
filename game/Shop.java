public class Shop{
  public static void main(String[] args){
    道具屋();
  }

  static void 道具屋(){
    System.out.println("道具屋に入った");
    店長();
  }

  static void 店長(){
    System.out.println("はい、いらっしゃい！");
    商品表示();
  }

  static void 商品表示(){
    String[] 商品 = {"かたい剣", "ぼろぼろの剣", "七光りの剣"};

    for(String n:商品){
      System.out.println(n);
    }
  }
}