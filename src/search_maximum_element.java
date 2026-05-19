public class search_maximum_element {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int max=Integer.MIN_VALUE;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("The value of the maximum element in this array is :"+max);
    }
}
