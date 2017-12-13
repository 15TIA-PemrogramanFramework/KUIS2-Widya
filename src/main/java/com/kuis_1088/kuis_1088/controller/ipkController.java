/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1088.kuis_1088.controller;

import com.kuis_1088.kuis_1088.entity.ipk_1088;
import com.kuis_1088.kuis_1088.service.ipkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC320-04
 */
@RestController
@RequestMapping("/ipk_1088")
public class ipkController {
     @Autowired
    private ipkService objk;

    @RequestMapping(method = RequestMethod.POST)
    public ipk_1088 insert(@RequestBody ipk_1088 cv_1092) {
        return objk.insert(cv_1092);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ipk_1088 update(@RequestBody ipk_1088 cv_1092) {
        return objk.update(cv_1092);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_cv}")
    public boolean delete(@PathVariable("id_cv") Long id_cv) {
        return objk.delete(id_cv);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_cv}")
    public ipk_1088 getByIdCv(@PathVariable("id_cv") Long id_cv){
        return objk.getById(id_cv);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<ipk_1088> getAll(){
        return objk.getAll();
    }
}
