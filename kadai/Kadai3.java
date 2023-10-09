public class Kadai3{
  public static void main(String[] args){
    System.out.println("問題3-1");
    int power = 50;
    int count = 1;
    System.out.println("庭を走った！");
    do{
      System.out.println(count + "周目です");
      count++;
      power = power-15;
    }while(power>0);
    System.out.println("体力が尽きた");

    System.out.println("問題3-2");
    int goal = 5;
    System.out.println("町を" + goal + "周走ります");
    for(int i=0; i<goal; i++){
      System.out.println((i+1) + "周走りました");
    }
    System.out.println("ゴールです");

    System.out.println("問題3-3");
    for(int i=20; i<26; i++){
      if(i==24){
        System.out.println("レベルが" + i + "になった");
        System.out.println("新たな技を覚えた");
        continue;
      }
      System.out.println("レベルが" + i + "になった");
      System.out.println("攻撃力が上がった");
    }
    System.out.println("育成完了です");
  }
}