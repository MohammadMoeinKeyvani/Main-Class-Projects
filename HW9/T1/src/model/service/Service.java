package model.service;

import model.entity.Employee;
import model.repository.Repository;

import java.util.List;

public class Service {

    private Service () {
    }

    private static Service service = new Service ();

    public static Service getInstance () {
        return service;
    }

    public void save (Employee employee) throws Exception {
        try (Repository repo = new Repository ()) {
            employee.setName(employee.getName());
            employee.setFamily(employee.getFamily());
            employee.setFatherName(employee.getFatherName());
            employee.setNumber(employee.getNumber());
            employee.setAge(employee.getAge());
            repo.insert (employee);
            repo.commit ();
        }
    }

}
