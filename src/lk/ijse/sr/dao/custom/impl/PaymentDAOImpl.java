package lk.ijse.sr.dao.custom.impl;

import lk.ijse.sr.dao.CrudUtil;
import lk.ijse.sr.dao.custom.PaymentDAO;
import lk.ijse.sr.entity.Payment;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PaymentDAOImpl implements PaymentDAO {
    @Override
    public Optional<Payment> find(String key) throws Exception {
        ResultSet rst = CrudUtil.execute("SELECT * FROM payment WHERE PID=?", key);
        Payment payment = null;
        if (rst.next()) {
            payment = new Payment(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getDouble(5),
                    rst.getDouble(6)
            );
        }
        return Optional.ofNullable(payment);
    }

    @Override
    public Optional<List<Payment>> findAll() throws Exception {
        ResultSet rst = CrudUtil.execute("SELECT * FROM payment");
        List<Payment> payments = new ArrayList<>();
        while (rst.next()) {
            Payment payment = new Payment(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getDouble(5),
                    rst.getDouble(6)
            );
            payments.add(payment);
        }
        return Optional.ofNullable(payments);
    }

    @Override
    public boolean save(Payment entity) throws Exception {
        return CrudUtil.<Integer>execute("INSERT INTO payment VALUES (?,?,?,?,?,?)",
                entity.getPid(),
                entity.getDate(),
                entity.getTime(),
                entity.getPrice(),
                entity.getPayAmount(),
                entity.getFullAmount()
        ) > 0;
    }

    @Override
    public boolean update(Payment entity) throws Exception {
        return CrudUtil.<Integer>execute(
                "UPDATE payment SET date=?,time=?,price=?,payAmount=?,FullAmount=? WHERE PID=?",
                entity.getDate(),
                entity.getTime(),
                entity.getPrice(),
                entity.getPayAmount(),
                entity.getFullAmount(),
                entity.getPid()
        ) > 0;
    }

    @Override
    public boolean delete(String key) throws Exception {
        return CrudUtil.<Integer>execute("DELETE FROM payment WHERE PID=?", key) > 0;
    }


}
