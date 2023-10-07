public class Party{
  public static void main(String[] args){
    int モンスター数 = 0;
    String[] モンスター = new String[3];

    モンスター[0] = "スライム";
    モンスター[2] = "キメラ";

    for(String i: モンスター){
      if(i == null){
        continue;
      }
      System.out.println(i + "が現れた");
      モンスター数++;
    }
    System.out.println(モンスター数);
  }
}