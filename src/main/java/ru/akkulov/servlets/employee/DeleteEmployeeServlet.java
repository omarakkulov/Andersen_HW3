package ru.akkulov.servlets.employee;

import ru.akkulov.model.Employee;
import ru.akkulov.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DeleteEmployeeServlet", urlPatterns = "/employee/delete")
public class DeleteEmployeeServlet extends HttpServlet {
    EmployeeService employeeService;
    List<Employee> employeeList;

    @Override
    public void init() throws ServletException {
        employeeService = new EmployeeService();
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        employeeList = employeeService.getAll();

        req.setAttribute("employees", employeeList);
        req.getRequestDispatcher("/view/employee/employee_delete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");
        Employee employee = new Employee();

        int id = Integer.parseInt(req.getParameter("id"));

        employee.setId(id);

        employeeService.deleteOne(id);

        doGet(req, resp);
    }
}
