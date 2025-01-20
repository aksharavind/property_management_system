package com.example.pmsproject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tenant")
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tenant_id")
    private Long tenantId;

    @Column(name = "tenant_username", nullable = false, unique = true)
    private String tenantUsername;

    @Column(name = "tenant_name", nullable = false)
    private String tenantName;

    @Column(name = "tenant_email", nullable = false, unique = true)
    private String tenantEmail;

    @Column(name = "tenant_phoneno", nullable = false, unique = true)
    private String tenantPhoneno;

    @Column(name = "permanent_address", nullable = false)
    private String permanentAddress;

    @Column(name = "tenant_password", nullable = false)
    private String tenantPassword;

    // Getters and Setters
    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantUsername() {
        return tenantUsername;
    }

    public void setTenantUsername(String tenantUsername) {
        this.tenantUsername = tenantUsername;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getTenantEmail() {
        return tenantEmail;
    }

    public void setTenantEmail(String tenantEmail) {
        this.tenantEmail = tenantEmail;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getTenantPassword() {
        return tenantPassword;
    }

    public void setTenantPassword(String tenantPassword) {
        this.tenantPassword = tenantPassword;
    }

    public String getTenantPhoneno() {
        return tenantPhoneno;
    }

    public void setTenantPhoneno(String tenantPhoneno) {
        this.tenantPhoneno = tenantPhoneno;
    }
}
