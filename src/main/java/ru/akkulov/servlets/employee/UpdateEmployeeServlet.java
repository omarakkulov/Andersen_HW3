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

@WebServlet(name = "UpdateEmployeeServlet", urlPatterns = "/employee/update")
public class UpdateEmployeeServlet extends HttpServlet {
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
        req.getRequestDispatcher("/view/employee/employee_update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");
        Employee employee = new Employee();

        int id = Integer.parseInt(req.getParameter("id"));
        String first_name = req.getParameter("first_name");
        String last_name = req.getParameter("last_name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        int experience = Integer.parseInt(req.getParameter("experience"));
        String date_of_birth = req.getParameter("date_of_birth");
        String date_of_employment = req.getParameter("date_of_employment");
        String skill_level = req.getParameter("skill_level");
        String eng_level = req.getParameter("eng_level");
        String skype = req.getParameter("skype");

        employee.setId(id);
        employee.setFirst_name(first_name);
        employee.setLast_name(last_name);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setDate_of_birth(date_of_birth);
        employee.setExperience(experience);
        employee.setDate_of_employment(date_of_employment);
        employee.setSkill_level(skill_level);
        employee.setEng_level(eng_level);
        employee.setSkype(skype);

        employeeService.updateOne(employee, id);

        doGet(req, resp);
    }
}
