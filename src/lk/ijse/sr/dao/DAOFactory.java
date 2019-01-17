package lk.ijse.sr.dao;

import lk.ijse.sr.dao.custom.impl.*;

public class DAOFactory {

    private static DAOFactory daoFactory;

    public enum DAOTypes{
        COURSE,PAYMENT,REGISTRATION,REGISTRATIONDETAILS,STUDENT,QUERY;
    }

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public <T extends SuperDAO> T getDAO(DAOTypes daoType) {
        switch (daoType) {
            case COURSE:
                return (T) new CourseDAOImpl();
            case PAYMENT:
                return (T) new PaymentDAOImpl();
            case REGISTRATION:
                return (T) new RegistrationDAOImpl();
//            case REGISTRATIONDETAILS:
//                return (T) new RegistrationDAOImpl();
            case STUDENT:
                return (T) new StudentDAOImpl();
            case QUERY:
                return (T) new QueryDAOImpl();
            default:
                return null;
        }
    }
}
