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
@Table(name = "ipk_1088")
public class ipk_1088 implements Serializable{
     @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
     @Column(length = 30, nullable = false)
    private String nim;
    @Column(length = 6, nullable = false)
    private int tahun ;
    private int ip;

 @ManyToOne
    private identitas_1088 identitas;
 
 
public Long getId(){
    return id;
}

public void setId(Long id){
    this.id=id;
}

public String getNim(){
    return nim;
}

public void setNim(String nim){
    this.nim=nim;

}


public int getTahun(){
    return tahun;
}

public void setTahun(int tahun){
    this.tahun=tahun;
}

public int getIp(){
    return ip;
}

public void setIp(int ip){
   this.ip=ip;
   
}
public identitas_1088 getIdentitas(){
    return identitas;
}

public void setIdentitas(identitas_1088 identitas){
    this.identitas=identitas;
}
}

