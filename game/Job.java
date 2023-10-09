public class Job{
  public static void main(String[] args){
    String キャラ名 = "勇者：セノ";
    int キャラ名の長さ = キャラ名.length();
    int 名前が始まる位置 = キャラ名.indexOf("：")+1;
    String 名前 = キャラ名.substring(名前が始まる位置,キャラ名の長さ);
    String 肩書 = キャラ名.substring(0,キャラ名.indexOf("："));

    if(名前.equals ("セノ")){
      System.out.println(肩書 + "：" + 名前 + "は、" + 肩書.replace(肩書,"賢者：") + 名前 + "になった");
    }else{
      System.out.println("セノではありません");
    }
  }
}