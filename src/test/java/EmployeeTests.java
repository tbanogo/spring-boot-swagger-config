import controller.EmployeeController;
import model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class EmployeeTests {

    private EmployeeController employeeController;

    @Test
    public List<Employee> getAllEmployees(){
        return employeeController.getAllEmployees();
    }
}
