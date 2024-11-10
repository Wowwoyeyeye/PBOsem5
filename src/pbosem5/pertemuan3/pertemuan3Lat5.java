package pbosem5.pertemuan3;



public class pertemuan3Lat5 {
 
  public static void main(String[] args) {
   new pertemuan3Lat5() .GradeNilai() ;
   new pertemuan3Lat5() .Score();
  }

  private void GradeNilai() {
    String status = "";
    int grade = 80;

    status = (grade >= 60) ?"Passed":"Failed";
    System.out.println(status);
  }

  void Score() {
    int skor = 0;
    char jawaban = 'a';
    skor = (jawaban=='a')?10:0;
    System.out.println("Score = " + skor);
  }
}
