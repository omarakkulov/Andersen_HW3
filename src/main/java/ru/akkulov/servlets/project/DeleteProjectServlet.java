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

@WebServlet(name = "DeleteProjectServlet", urlPatterns = "/project/delete")
public class DeleteProjectServlet extends HttpServlet {
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
        req.getRequestDispatcher("/view/project/project_delete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");

        final int id = Integer.parseInt(req.getParameter("id"));

        projectService.deleteOne(id);

        doGet(req, resp);
    }
}
