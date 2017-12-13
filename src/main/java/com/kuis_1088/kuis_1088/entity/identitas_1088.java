/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1088.kuis_1088.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PC320-04
 */

@Entity
@Table(name = "identitas_1088")
public class identitas_1088 implements Serializable{
    @Id
    private String nim;
    @Column(length = 50, nullable = false)
    private String nama;
    @Column(length = 100, nullable = false)
    private String prodi;
    private String kampus;
   
    
    
    public String getNim() {
        return this.nim;
    }

    public void setId(String nim) {
        this.nim = nim;
    }
    
    public String getNama(){
        return  nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getProdi(){
        return prodi;
    }
    
    public void setProdi(String prodi)
    {
        this.prodi=prodi;
    }    
    
    public String getKampus(){
        return kampus;
        
    }
    
    public void setKampus(String kampus){
        this.kampus=kampus;
    }
}

