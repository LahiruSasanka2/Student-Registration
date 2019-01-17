package lk.ijse.sr.dao.custom.impl;

import lk.ijse.sr.dao.custom.RegistrationDAO;
import lk.ijse.sr.entity.Registration;

import java.util.List;
import java.util.Optional;

public class RegistrationDAOImpl implements RegistrationDAO {
    @Override
    public int count() throws Exception {
        return 0;
    }

    @Override
    public Optional<Registration> find(String key) throws Exception {
        return Optional.empty();
    }

    @Override
    public Optional<List<Registration>> findAll() throws Exception {
        return Optional.empty();
    }

    @Override
    public boolean save(Registration entity) throws Exception {
        return false;
    }

    @Override
    public boolean update(Registration entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String key) throws Exception {
        return false;
    }
}
