import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student std = new Student();
        String sttoint;
        int temp,stdid;

        while (true) {
            try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "classwork7",
                    "123")) {
                Class.forName("oracle.jdbc.driver.OracleDriver");

                System.out.print("Enter Student ID : ");
                sttoint = input.nextLine();
                temp = Integer.parseInt(sttoint);
                std.setStudentId(temp);
                System.out.print("Enter Student Name : ");
                std.setName(input.nextLine());
                System.out.print("Enter Year of entry : ");
                sttoint = input.nextLine();
                temp = Integer.parseInt(sttoint);
                std.setYear(temp);
                System.out.print("Enter Student Average : ");
                sttoint = input.nextLine();
                temp = Integer.parseInt(sttoint);
                std.setAverage(temp);

                connection.setAutoCommit(false);
                PreparedStatement preparedStatement = connection.prepareStatement("insert into student (id , name , year , average ) values (?,?,?,?)");
                preparedStatement.setInt(1, std.getStudentId());
                preparedStatement.setString(2, std.getName());
                preparedStatement.setInt(3, std.getYear());
                preparedStatement.setInt(4, std.getAverage());
                preparedStatement.executeUpdate();

                connection.commit();
                System.out.println("\n\rWhat do you want?? 1.Add another student 2.Update student information 3.Delete student (for exit enter any key) ");
                sttoint = input.nextLine();
                temp = Integer.parseInt(sttoint);
                if (temp == 1){
                    continue;
                }
                else if (temp == 2){
                    System.out.print("Enter Student ID to Update Student : ");
                    sttoint = input.nextLine();
                    stdid = Integer.parseInt(sttoint);
                    preparedStatement = connection.prepareStatement("update student set name=? , year=? , average=?  where id =? ");
                    System.out.print("Enter new name : ");
                    std.setName(input.nextLine());
                    preparedStatement.setString(1, std.getName());
                    System.out.print("Enter new Year of entry : ");
                    sttoint = input.nextLine();
                    temp = Integer.parseInt(sttoint);
                    std.setYear(temp);
                    preparedStatement.setInt(2, std.getYear());
                    System.out.print("Enter new Average : ");
                    sttoint = input.nextLine();
                    temp = Integer.parseInt(sttoint);
                    std.setAverage(temp);
                    preparedStatement.setInt(3, std.getAverage());
                    preparedStatement.setInt(4, stdid);
                    preparedStatement.execute();
                    connection.commit();
                    System.out.println("Student " + stdid + " updated.");
                    break;
                }
                else if (temp == 3) {
                    System.out.print("Enter Student ID to delete Student : ");
                    sttoint = input.nextLine();
                    stdid = Integer.parseInt(sttoint);
                    preparedStatement = connection.prepareStatement("delete from student where id = ?");
                    preparedStatement.setInt(1, stdid);
                    preparedStatement.execute();
                    connection.commit();
                    System.out.println("Student " + stdid + " deleted.");
                    break;
                }
                else
                    break;

            } catch (ClassNotFoundException e) {
                System.out.println("DB Driver Not Exist!!");
            } catch (SQLException e) {
                System.out.println("DB ERROR " + e.getMessage());
            }

        }
    }//end of mian
}//end of class