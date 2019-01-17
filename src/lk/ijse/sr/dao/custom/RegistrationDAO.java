package lk.ijse.sr.dao.custom;

import lk.ijse.sr.dao.CrudDAO;
import lk.ijse.sr.entity.Registration;

public interface RegistrationDAO extends CrudDAO<Registration, String> {

    int count() throws Exception;

}
