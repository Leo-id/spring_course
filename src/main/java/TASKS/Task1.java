package TASKS;

public class Task1 {
    public static void main(String[] args) {
        int [] array={100, 40, 34, 57, 29, 72, 57, 88};
        double my=75.0;
        System.out.println(average(array,my));

    }

    public static boolean average (int [] array,double my){
        int sum=0;
        int count=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            count++;
        }
        if((double) sum/count<my){

            return true;
        }
        return false;
    }

}
