package ru.akkulov.servlets.project;

import ru.akkulov.model.Project;
import ru.akkulov.service.ProjectService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UpdateProjectServlet", urlPatterns = "/project/update")
public class UpdateProjectServlet extends HttpServlet {
    ProjectService projectService;
    List<Project> projectList;

    @Override
    public void init() throws ServletException {
        projectService = new ProjectService();
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        projectList = projectService.getAll();

        req.setAttribute("projects", projectList);
        req.getRequestDispatcher("/view/project/project_update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");
        Project project = new Project();

        final int id = Integer.parseInt(req.getParameter("id"));
        final String name = req.getParameter("name");
        final String customer = req.getParameter("customer");
        final int duration = Integer.parseInt(req.getParameter("duration"));
        final String methodology = req.getParameter("methodology");

        project.setName(name);
        project.setCustomer(customer);
        project.setDuration(duration);
        project.setMethodology(methodology);

        projectService.updateOne(project, id);

        doGet(req, resp);
    }
}
