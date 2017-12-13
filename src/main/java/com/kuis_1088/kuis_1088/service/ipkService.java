/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1088.kuis_1088.service;

import com.kuis_1088.kuis_1088.entity.ipk_1088;
import com.kuis_1088.kuis_1088.repo.ipkRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC320-04
 */
@Service("ipkService")
@Transactional
public class ipkService {

    @Autowired
    private ipkRepo repo;

    public ipk_1088 insert(ipk_1088 komentar) {
        return repo.save(komentar);
    }
    
    public ipk_1088 update(ipk_1088 komentar) {
        return repo.save(komentar);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public ipk_1088 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<ipk_1088> getAll(){
        return repo.findAll();
    }
}
