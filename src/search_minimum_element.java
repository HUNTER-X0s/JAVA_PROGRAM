public class search_minimum_element {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int min=Integer.MAX_VALUE;
        for(int e:arr){
            if(e<min){
                min=e;
            }
        }
        System.out.println("The value of the minimum element in this array is :"+min);
    }
}
