package by.it.senchenko.project.java.controller;

import by.it.senchenko.project.java.beans.Periodicals;
import by.it.senchenko.project.java.beans.Role;
import by.it.senchenko.project.java.beans.User;
import by.it.senchenko.project.java.dao.SingletonDAO;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.List;


public class CmdCreatePeriodicals extends Action {
    @Override
    Action execute(HttpServletRequest req) {
        SingletonDAO dao = SingletonDAO.getSingletonDAO();
        User user = (User) req.getSession().getAttribute("user");
        if (user == null)
            return Actions.LOGIN.action;
        if (user.getFk_Role() != 1) {
            Form.showMessage(req, "Недостаточно прав");
            Form.showError(req, "Ошибка");
            return Actions.LOGIN.action;
        } else {
            if (Form.isPost(req)) {
                Periodicals periodicalsFromForm = new Periodicals();
                try {
                    periodicalsFromForm.setID(Form.getInt(req, "ID"));
                    periodicalsFromForm.setName(Form.getString(req, "Name", Patterns.PASSWORD));
                    periodicalsFromForm.setAuthor(Form.getString(req, "Author", Patterns.PASSWORD));
                    periodicalsFromForm.setDate(Form.getString(req, "Date", Patterns.PASSWORD));
                    periodicalsFromForm.setFK_User(user.getId());
                    if (periodicalsFromForm.getID() > 0) {
                        //Form.showError(req, "Ошибка");
                        dao.periodicals.update(periodicalsFromForm);
                    } else if (periodicalsFromForm.getID() == 0) {
                        dao.periodicals.create(periodicalsFromForm);
                    } else {
                        periodicalsFromForm.setID(-1 * periodicalsFromForm.getID());
                        dao.periodicals.delete(periodicalsFromForm);
                    }
                } catch (ParseException e) {
                    req.setAttribute(Messages.MESSAGE_ERROR,e.toString());
                }
            }
            List<Periodicals> periodical = dao.periodicals.getAll("");
            req.setAttribute("periodical", periodical);
            List<Role> roles = dao.role.getAll("");
            req.setAttribute("roles", roles);

        }


        return null;
    }
}
