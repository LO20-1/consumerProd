package com.service.ConsumerProd.dao;

import com.service.ConsumerProd.entity.ConsumerEntity;
import com.service.ConsumerProd.mapper.ConsumerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Repository
public class ConsumerDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ConsumerDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ConsumerEntity> getAllConsumers() {
        String sql = "SELECT * FROM consumer";
        return jdbcTemplate.query(sql, new ConsumerMapper());
    }

    public Boolean save(ConsumerEntity entity) {
        Timestamp currentTimestamp = new Timestamp(new Date().getTime());

        String sql = "INSERT INTO consumer (nama, alamat, kota, provinsi, tgl_registrasi, status) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        int rowsAffected = jdbcTemplate.update(sql,
                entity.getNama(),
                entity.getAlamat(),
                String.valueOf(entity.getKota()),
                String.valueOf(entity.getProvinsi()),
                currentTimestamp,
                'A'
        );

        return rowsAffected > 0;
    }
}
