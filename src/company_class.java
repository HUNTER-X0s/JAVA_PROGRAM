class Myemployee{
    int id;
    String name;
    public void setid(int i) {
        id = i;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
}
public class company_class {
    public static void main(String[] args) {
        Myemployee cigar = new Myemployee();
        cigar.setname("code with harry");
        System.out.println(cigar.getname());
        cigar.setid(450);
        System.out.println(cigar.getid());
    }
}
