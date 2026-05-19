public class average_numbers_functions {
    static int average(int ...arr){
        int sum=0,avg=0;
        for(int e:arr){
            sum=sum+e;
            avg=sum/arr.length;
        }
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(average(5,4,6));
    }
}
