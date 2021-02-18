package com.nexos.inventary.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user_nexos")

public class UserNexos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @OneToOne
    @JoinColumn(name="id_cargo", referencedColumnName = "id")
    private JobTitle idCargo;

    @Column(name = "entry_date")
    private Date entryDate;

    public UserNexos() {

    }

    public UserNexos(Long id, String name, Integer age, JobTitle idCargo, Date entryDate) {
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
