package Task1;

public class WorkerHours implements Salary{
    private int salaryForHour;
    private int hours;
    WorkerHours(int salaryForHour,int hours){
       this.salaryForHour=salaryForHour;
       this.hours=hours;
    }
    @Override
    public void salary() {
        double salary=salaryForHour*hours;
        System.out.println("Зарплатня працівника за день складає-"+salary+"грн.");
    }
}
