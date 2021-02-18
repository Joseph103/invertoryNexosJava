package com.nexos.inventary.model.dto;
import com.nexos.inventary.model.JobTitle;

import java.util.Date;



public class UserDto {

    private Long id;

    private String name;

    private Integer age;

    private JobTitle idCargo;

    private Date entryDate;

    public UserDto() {

    }

    public UserDto(Long id, String name, Integer age, JobTitle idCargo, Date entryDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.idCargo = idCargo;
        this.entryDate = entryDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public JobTitle getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(JobTitle idCargo) {
        this.idCargo = idCargo;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

}
