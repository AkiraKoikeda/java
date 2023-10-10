public class Kadai5{
  public static void main(String[] args){
    System.out.println("問題5-1");
    int count = 1;
    int[] power = new int[5];
    power[0] = 25;
    power[1] = 65;
    power[3] = 60;
    power[4] = 20;
    for(int i:power){
      System.out.println("仲間" + count + "の体力：" + i);
      count++;
    }

    System.out.println("問題5-2");
    int[][] status = new int[2][3];
    status[0][0] = 50;
    status[0][1] = 40;
    status[0][2] = 30;
    status[1][0] = 70;
    status[1][1] = 30;
    status[1][2] = 80;

    for(int i=0; i<3; i++){
      System.out.println("仲間" + (i+1));
      System.out.println("攻撃力：" + status[0][i]);
      System.out.println("防御力：" + status[1][i]);
      System.out.println("");
    }
  }
}