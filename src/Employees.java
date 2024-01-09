public class Employees extends Showroom implements utility{
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;
    @Override
    public void get_details(){
        System.out.println("ID: "+emp_id);


    }
}
