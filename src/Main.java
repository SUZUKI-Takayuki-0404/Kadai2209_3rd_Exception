import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] days = {"日", "月", "火", "水", "木", "金", "土"};
        List<String> arraysAsList = Arrays.asList(days);
        List<String> listOf = List.of(days);
        System.out.println("実験：Setメソッドで曜日を書き換えてみる");

        System.out.println("--------------------------------");
        System.out.println("<Arrays.asListメソッドで作ったリストの場合>");
        tryToSet(arraysAsList, 1, "日");

        System.out.println("--------------------------------");
        System.out.println("<List.ofメソッドで作ったリストの場合>");
        tryToSet(listOf, 5, "土");

    }

    static void tryToSet(List<String> list, int index, String youbi) {
        System.out.println("実行前： " + list);
        try {
            list.set(index, youbi);
        } catch (UnsupportedOperationException e) {
            System.out.println("例外スロー : 一度代入した値は変更不可");
        }
        System.out.println("実行後： " + list);
    }
}