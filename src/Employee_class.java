class employee{
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
}
public class Employee_class {
    public static void main(String[] args) {
        employee cigar = new employee();
        cigar.setname("code with harry");
        System.out.println(cigar.getname());
        cigar.salary=(450);
        System.out.println(cigar.getsalary());
    }
}
