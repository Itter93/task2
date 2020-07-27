import java.util.Scanner;
public class multiplication { public static void main(String[] args){
  for (int i = 2; i < 10; i++) {
    for (int j = 2; j < 10; j++) {
      System.out.print(j + "*" + i + "=" + i * j + "\t");
      if (j == 9)
        System.out.println();
    }
  }

}
    }


