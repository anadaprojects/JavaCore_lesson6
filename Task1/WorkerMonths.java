package Task1;

public class WorkerMonths implements Salary {
    private int salaryForDay;
    private int days;

    public WorkerMonths(int days,int salaryForDay) {
        this.days = days;
        this.salaryForDay=salaryForDay;
    }

    @Override
    public void salary() {
        double salary=days*salaryForDay;
        System.out.println("Зарплатня робітника за місяць складає-"+salary+"грн.");
    }
}
