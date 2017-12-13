/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1088.kuis_1088.controller;

import com.kuis_1088.kuis_1088.entity.identitas_1088;
import com.kuis_1088.kuis_1088.service.identitasService;
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
@RequestMapping("/identitas_1088")
public class identitasController {
     @Autowired
    private identitasService objk;

    @RequestMapping(method = RequestMethod.POST)
    public identitas_1088 insert(@RequestBody identitas_1088 cv_1092) {
        return objk.insert(cv_1092);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public identitas_1088 update(@RequestBody identitas_1088 cv_1092) {
        return objk.update(cv_1092);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") String id) {
        return objk.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public identitas_1088 getByIdCv(@PathVariable("id") String id){
        return objk.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<identitas_1088> getAll(){
        return objk.getAll();
    }
}
