package com.nexos.inventary.model.dto;

import com.nexos.inventary.model.UserNexos;

import java.util.Date;

public class ProductDto {

        private Long id;

        private Integer amount;

        private String name;

        private UserNexos userId;

        private Date entryDate;

        private Date modificationDate;

        public ProductDto() {
        }

        public ProductDto(Long id, Integer amount, String name, UserNexos userId, Date entryDate, Date modificationDate) {
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
