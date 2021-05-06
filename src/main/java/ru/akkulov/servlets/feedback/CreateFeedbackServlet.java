package ru.akkulov.servlets.feedback;

import ru.akkulov.model.Feedback;
import ru.akkulov.service.FeedbackService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CreateFeedbackServlet", urlPatterns = "/feedback/create")
public class CreateFeedbackServlet extends HttpServlet {
    FeedbackService feedbackService;
    List<Feedback> feedbacksList;

    @Override
    public void init() throws ServletException {
        feedbackService = new FeedbackService();
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        feedbacksList = feedbackService.getAll();

        req.setAttribute("feedbacks", feedbacksList);
        req.getRequestDispatcher("/view/feedback/feedback_create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");
        Feedback feedback = new Feedback();

        String description = req.getParameter("description");
        String date = req.getParameter("date");
        int employee_id = Integer.parseInt(req.getParameter("employee_id"));

        feedback.setDescription(description);
        feedback.setDate(date);
        feedback.setEmployee_id(employee_id);

        feedbackService.create(feedback);

        doGet(req, resp);
    }
}
