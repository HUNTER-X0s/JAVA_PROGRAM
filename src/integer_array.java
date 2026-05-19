public class integer_array {
    public static void main(String[] args) {
        float arr[]={23.4f,34.6f,67.f,56.8f,90.0f};
        float num=23.4f;
        boolean isinarray=false;
        for(float element:arr){
            if(num==element){
                isinarray=true;
                break;
            }
        }
        if(isinarray){
        System.out.println("The given integer is in array");
        }
        else{
            System.out.println("The given integer is not in array");
        }
    }
}
