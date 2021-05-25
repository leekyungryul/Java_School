import java.util.Scanner; //배영현 class

public class Tria extends Base {
   double lowerLine;
   double height;

   public Tria(String name) {
      super(name); // 부모name
   }
   @Override
   public void inputData() {
      super.inputData();
      Scanner s = new Scanner(System.in);
      System.out.println("삼각형의 밑변을 입력해주세요");
      this.lowerLine = s.nextDouble();

      System.out.println("삼각형의 높이를 입력해주세요");
      this.height = s.nextDouble();

      System.out.println("연산중...");
   }
   @Override
   public void calcArea() {
      this.area = (lowerLine * height) / 2;
      this.area = Math.round(this.area * 100) / (double) 100;
   }
}