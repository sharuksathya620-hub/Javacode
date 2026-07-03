class Student {
    String name;
    String rollno;
    Student(){
        name="default name";
        rollno=001;
    }
    Student(string name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}
class ClassEx{
    public static void main(String [] args){
        Student student1=new Student();
        Student student2=new Student();
        System.out.println(student1.name);
        System.out.println(student2.rollno);       
    }
}
