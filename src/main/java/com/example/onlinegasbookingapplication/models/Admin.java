package com.example.onlinegasbookingapplication.models;

import javax.persistence.*;
// New Entity for Admin Table;
@Entity
public class Admin extends AbstractUser{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id", nullable = false)
    private Long adminId;

    public Admin() {

    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }


}
