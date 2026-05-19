class mymainemployee{
    private int id;
    private String name;
    private int salary;

 public mymainemployee(int mysalary){
     salary=mysalary;
     name="my name";
     id=23;
 }
 public int getsalary(){
     return salary;
 }
 public void setSalary(int s){
     salary=s;
 }
 public String getname(){
     return name;
 }
 public void setname(String n){
     name=n;
 }
}
public class employee_constructor {
    public static void main(String[] args) {
        mymainemployee mms=new mymainemployee(34000);
        System.out.println(mms.getsalary());
        System.out.println(mms.getname());
    }
}
