public class Main {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    for (i=2; i<10; i++) {
      list.add("Hello World!");
    }
    printAll(list);
  }

  public static void printAll(ArrayList list) {
    for (Object obj : list) {
      System.out.println(obj);
    }
  }
}
