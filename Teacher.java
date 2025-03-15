
class Teacher{

    private int teacherId;
    private String teacherName;
    private int salary;
    private String dept;

    Teacher(int teacherId,String teacherName,int salary, String dept){
        this.teacherId=teacherId;
        this.teacherName=teacherName;
        this.dept=dept;
        this.salary=salary;
    }

    public String getName(){
        return teacherName;
    }

    public int getId(){
        return teacherId;
    }

    public int getSalary(){
        return salary;
    }
}