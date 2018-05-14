package JavaMobile;

public class javmobWeek_1 {
  public static void main(String[] args) {
//    int x = 0;
//    switch (x) {
//      case 0:
//        System.out.println("A");
//        break;
//      case 1:
//        System.out.println("B");
//        break;
//      case 2:
//        System.out.println("C");
//        break;
//      default:
//        System.out.println("D");
//        break;
//    }
//
//    String s = "Hello";
//    System.out.println(s.length());
//    System.out.println(s.charAt(3));
//
//    String s1 = "Welcome";
//    int o = 5;
//    System.out.println(o + s1);
//    System.out.println(o + o + s1);

    String str = "siapa nama kamu";
    System.out.println(str.contains("nama"));

    String[] keyword = str.split(" ");
    for (int i = 0; i < keyword.length; i++) {
      System.out.println("+++++++++++++++");
      System.out.print(i);
      System.out.println(keyword[i]);

      if (keyword[i].equals("nama")) {
        System.out.println("GOT IT");
      } else {
        System.out.println("NO MATCH");
      }
    }
  }
}