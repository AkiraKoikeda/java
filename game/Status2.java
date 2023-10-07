public class Status2{
  public static void main(String[] args){
    String[][] 道具箱 = new String[2][3];

    道具箱[0][0] = "するどい剣";
    道具箱[0][1] = "木の杖";
    道具箱[0][2] = "防具";
    道具箱[1][0] = "剣士用";
    道具箱[1][1] = "魔法使い用";
    道具箱[1][2] = "格闘家用";

    for(int i=0; i<3; i++){
      System.out.println(道具箱[0][i] + "は" + 道具箱[1][i] + "だ");
    }
  }
}