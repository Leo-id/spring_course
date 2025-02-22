package TASKS;

public class Test {
    public static void main(String[] args) {
        String str="abc";
        String ending="bc";


        System.out.println(solution(str,ending));
        }




    public static boolean solution(String str, String ending) {

    return str.endsWith(ending);

    }


}
