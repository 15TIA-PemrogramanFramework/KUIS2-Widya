/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1088.kuis_1088.repo;


import com.kuis_1088.kuis_1088.entity.identitas_1088;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC320-04
 */
public interface identitasRepo extends CrudRepository<identitas_1088, String> {
    @Query("select c from identitas_1088 c")
    public List<identitas_1088> findAllNilai();
}

