package com.service.ConsumerProd.mapper;

import com.service.ConsumerProd.entity.ConsumerEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ConsumerMapper implements RowMapper<ConsumerEntity> {

    @Override
    public ConsumerEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        ConsumerEntity entity = new ConsumerEntity();
        entity.setId(rs.getLong("id"));
        entity.setNama(rs.getString("nama"));
        entity.setAlamat(rs.getString("alamat"));
        entity.setKota(rs.getString("kota").charAt(0));
        entity.setProvinsi(rs.getString("provinsi").charAt(0));
        entity.setTglRegistrasi(rs.getTimestamp("tgl_registrasi"));
        entity.setStatus(rs.getString("status").charAt(0));

        return entity;
    }
}
