/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1088.kuis_1088.service;

import com.kuis_1088.kuis_1088.entity.identitas_1088;
import com.kuis_1088.kuis_1088.repo.identitasRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC320-04
 */
@Service("identitasService")
@Transactional
public class identitasService {
    
    @Autowired
    private identitasRepo repo;

    public identitas_1088 insert(identitas_1088 komentar) {
        return repo.save(komentar);
    }
    
    public identitas_1088 update(identitas_1088 komentar) {
        return repo.save(komentar);
    }
    
    public boolean delete(String id){
        repo.delete(id);
        return true;
    }
    
    public identitas_1088 getById(String id){
        return repo.findOne(id);
    }
    
    public List<identitas_1088> getAll(){
       return repo.findAllNilai();
    }}
