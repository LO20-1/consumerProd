package com.service.ConsumerProd.converter;

import com.service.ConsumerProd.entity.ConsumerEntity;
import com.service.ConsumerProd.model.Consumer;

public class ConsumerConverter {

    public static Consumer convertToModel(ConsumerEntity source){
        Consumer target = new Consumer();

        target.setId(source.getId());
        target.setNama(source.getNama());
        target.setAlamat(source.getAlamat());
        target.setKota(source.getKota());
        target.setProvinsi(source.getProvinsi());
        target.setTglRegistrasi(source.getTglRegistrasi());
        target.setStatus(source.getStatus());

        return target;
    }

    public static ConsumerEntity convertToEntity(Consumer source) {
        ConsumerEntity target = new ConsumerEntity();

        target.setId(source.getId());
        target.setNama(source.getNama());
        target.setAlamat(source.getAlamat());
        target.setKota(source.getKota());
        target.setProvinsi(source.getProvinsi());
        target.setTglRegistrasi(source.getTglRegistrasi());
        target.setStatus(source.getStatus());

        return target;
    }
}
