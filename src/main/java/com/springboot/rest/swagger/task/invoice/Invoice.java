package com.springboot.rest.swagger.task.invoice;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Invoice {
        @Id
        @GeneratedValue
        private Long id;

        @ApiModelProperty(notes="Name should have atleast 2 characters")
        @Size(min=2, message="Name should have atleast 2 characters")
        private String name;

        private String invoiceNumber;

    public Invoice() {
        super();
    }

        public Invoice(Long id, String name, String invoiceNumber) {
            super();
            this.id = id;
            this.name = name;
            this.invoiceNumber = invoiceNumber;
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

        public String getInvoiceNumber() {
            return invoiceNumber;
        }

        public void setInvoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
        }

        @Override
        public String toString() {
            return String.format("Invoice [id=%s, name=%s, invoiceNumber=%s]", id, name, invoiceNumber);
        }
    }


