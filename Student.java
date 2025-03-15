class Student{

    private int studentId;
    private String studentName;
    private int grade;
    private int feesPaid;
    private int totalFees;
    
    /**
     * @param 
     */
    Student(int studentId,String studentName,int grade){
        this.studentId=studentId;
        this.studentName=studentName;
        this.grade=grade;
        this.feesPaid=0;
        this.totalFees=30000;
    }

    public void setTotalFees(int data){
        totalFees=data;
    }

    public void setFeesPaid(int data){
        feesPaid=data;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }

    public int getTotalFees(){
        return totalFees;
    }

    public void updateFeesPaid(int fees){
        feesPaid+=fees;
    }

    public int getFeesPaid(){
        return feesPaid;
    }

}