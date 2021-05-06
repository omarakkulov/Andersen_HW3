package ru.akkulov.servlets.team;

import ru.akkulov.model.Team;
import ru.akkulov.service.TeamService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CreateTeamServlet", urlPatterns = "/team/create")
public class CreateTeamServlet extends HttpServlet {
    TeamService teamService;
    List<Team> teamsList;

    @Override
    public void init() throws ServletException {
        teamService = new TeamService();
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        teamsList = teamService.getAll();

        req.setAttribute("teams", teamsList);
        req.getRequestDispatcher("/view/team/team_create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");

        //create
        final String name = req.getParameter("name");
        if (!name.isEmpty()) {
            final Team team = new Team();
            team.setName(name);
            teamService.create(team);
        }
        doGet(req, resp);
    }
}
