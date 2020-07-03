import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employees e1 = new Employees();
        String sttoint;
        int temp,ecode;

        System.out.print("Please enter Employee Code : ");
        sttoint = input.nextLine();
        temp = Integer.parseInt(sttoint);
        e1.setEmployeeCode(temp);
        System.out.print("Please enter Employee Name : ");
        e1.setName(input.nextLine());
        System.out.print("Please enter Employee MeliCode : ");
        e1.setMeliCode(input.nextLine());
        System.out.print("Please enter Employee's Father Name : ");
        e1.setFatherName(input.nextLine());
        System.out.print("Please enter Employee Side : ");
        e1.setEmployeeSide(input.nextLine());
        System.out.print("Please enter Employee Income : ");
        e1.setIncome(input.nextLine());
        System.out.print("Please enter Employee Experience : ");
        e1.setExperience(input.nextLine());

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "classwork7",
                    "123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into employee (employeeCode,name,melicode,fathername,employeeside,income,experience) values (?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, e1.getEmployeeCode());
            preparedStatement.setString(2, e1.getName());
            preparedStatement.setString(3, e1.getMeliCode());
            preparedStatement.setString(4, e1.getFatherName());
            preparedStatement.setString(5, e1.getEmployeeSide());
            preparedStatement.setString(6, e1.getIncome());
            preparedStatement.setString(7, e1.getExperience());
            preparedStatement.executeUpdate();

            connection.commit();
            System.out.println("\n\rDo you want to delete any one?? 1.NO 2.YES");
            sttoint = input.nextLine();
            temp = Integer.parseInt(sttoint);
            if (temp == 2) {
                System.out.print("Enter employee code to delete employee : ");
                sttoint = input.nextLine();
                ecode=Integer.parseInt(sttoint);
                preparedStatement = connection.prepareStatement ("delete from employee where employeecode = ?");
                preparedStatement.setInt(1, ecode);
                preparedStatement.execute();
                connection.commit();
                System.out.println("Employee "+ ecode + " deleted");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }

    }//end of mian
}//end of class