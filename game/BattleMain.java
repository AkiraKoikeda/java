package sample;

public class BattleMain{
  public static void main(String[] args){
    Character c1 = new Charactor();
    Character c2 = new Charactor();
    Character c3 = new Charactor();

    c1.assign("勇者セノ", 110);
    c2.assign("魔法使いリンク", 60);
    c3.assign("剣士アカデ", 160);

    // c1.gradeSet(c1.power);
    // c2.gradeSet(c2.power);
    // c3.gradeSet(c3.power);

    c1.print();
    c2.print();
    c3.print();

  }
}