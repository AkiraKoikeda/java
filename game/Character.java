package sample;

public class Character{
  String name = "";
  int power = 0;
  String grade = "";

  void assign(String n, int p){
    name = n;
    power = p;
    grade = gradeSet(power);
  }

  String gradeSet(int power){
    if(power>=150){
      grade = "強い";
      return grade;
    }else if(power>=80){
      grade = "普通";
      return grade;
    }else{
      grade = "弱い";
      return grade;
    }
  }

  void print(){
    System.out.println("名前：" + name);
    System.out.println("体力：" + power);
    System.out.println("強さ：" + grade);
  }
}