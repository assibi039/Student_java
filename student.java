class Student
{
    private 
     String name;
     int rn;
     double ph,add;
    public
     void setname(String name)
    {
        this.name=name;
    }
     void setrn(int rn)
    {
        this.rn=rn;
    }
     void setph(double ph)
    {
        this.ph=ph;
    }
     void setadd(double add)
    {
        this.add=add;
    }
     String getname()
    {
        return name;
    }
     int getrn()
    {
        return rn;
    }
     double getph()
    {
        return ph;
    }
     double getadd()
    {
        return add;
    }
    
}
 public class student
{
     public static void main(String[] args) {
        Student s1= new Student();
        s1.setname("Jhon");
        s1.setrn(2);
        s1.setph(95545);
        s1.setadd(855588);
        System.out.println(s1.getname()+" "+s1.getrn()+" "+s1.getph()+" "+s1.getadd());
        Student s2= new Student();
        s2.setname("sam");
        s2.setrn(3);
        s2.setph(87878);
        s2.setadd(254565);
        System.out.println(s2.getname()+" "+s2.getrn()+" "+s2.getph()+" "+s2.getadd());
    }
}
