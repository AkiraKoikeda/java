public class Delta{
  public static void main(String[] args){
    int 面積 = 0;
    int 底辺 = 5;
    int 高さ = 6;
    面積 = 三角形の面積(底辺, 高さ);
    System.out.println(面積);
  }
  static int 三角形の面積(int 底辺,int 高さ){
    int 結果 = ( 底辺 * 高さ ) / 2;
    return 結果;
  }
}