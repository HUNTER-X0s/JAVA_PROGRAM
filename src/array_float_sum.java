public class array_float_sum {
    public static void main(String[] args) {
       /* float arr[]=new float [5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        float sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        System.out.println(sum);
    */
        float arr[]={23.4f,34.6f,67.f,56.8f,90.0f};
        float sum=0;
        for(float element:arr){
            sum=sum+element;
        }
        System.out.println("the sum is :"+sum);
    }
}
