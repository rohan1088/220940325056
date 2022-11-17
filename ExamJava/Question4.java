package ExamJava;
class Grandparent{
    String GrandFatherName;
    String GrandMotherName;

   public Grandparent(String GFname,String GMname){
       this.GrandFatherName=GFname;
       this.GrandMotherName=GFname;
        System.out.println("Name of GrandFather:"+this.GrandFatherName);
        System.out.println("Name of GrandMotherName:"+this.GrandMotherName);
    }

}
class Parent extends Grandparent {
    String FatherName;
    String MotherName;

    public Parent(String Fname,String Mname,String GFname,String GMname) {
        super(GFname,GMname);
        this.FatherName=Fname;
        this.MotherName=Mname;
        System.out.println("Father name:" + this.FatherName);
        System.out.println("Father name:" + this.MotherName);

    }
}
class Child extends Parent{
    Child(String Fname,String Mname,String GFname,String GMname){
        super(Fname,Mname,GFname,GMname);
    }


}

public class Question4 {
    public static void main(String[] args) {
        Child chi=new Child("Ram","Divya","Mahadev","Seeta");
    }
}
