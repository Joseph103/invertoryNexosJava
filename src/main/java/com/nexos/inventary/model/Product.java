package com.nexos.inventary.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private UserNexos userId;

    @Column(name = "entry_date")
    private Date entryDate;

    @Column(name = "modification_date")
    private Date modificationDate;

    public Product() {
    }

    public Product(Long id, Integer amount, String name, UserNexos userId, Date entryDate, Date modificationDate) {
        this.id = id;
        this.amount = amount;
        this.name = name;
        this.userId = userId;
        this.entryDate = entryDate;
        this.modificationDate = modificationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserNexos getUserId() {
        return userId;
    }

    public void setUserId(UserNexos userId) {
        this.userId = userId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }
}
