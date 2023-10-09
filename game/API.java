import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Date;

public class API{
  public static void main(String[] args){
    Random ランダムクラス = new Random();
    int 乱数 = ランダムクラス.nextInt(5);

    switch (乱数){
      case 0:
        System.out.println("0が出た！大吉！");
        break;
      case 1:
        System.out.println("1が出た！吉！");
        break;
      case 2:
        System.out.println("2が出た！凶！");
        break;
      default:
        System.out.println("3，4が出た！平！");
    }
  }
}