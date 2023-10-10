public class Kadai4{
  public static void main(String[] args){
    System.out.println("問題4-1");
    int[] score = {30, 70, 50};
    System.out.println(score[0]);

    System.out.println("問題4-2");
    int[] power = {25, 65, 40, 60, 20};
    int i = 1;
    for(int n:power){
      System.out.println("仲間" + i + "の体力：" + n);
      i++;
    }
  }
}