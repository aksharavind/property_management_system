package com.example.pmsproject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vendors")
public class Vendors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vendorId;

    @Column(name = "service_type", nullable = false)
    private String serviceType;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "vendor_email", nullable = false, unique = true)
    private String vendorEmail;

    @Column(name = "vendor_phone_no", nullable = false, unique = true)
    private String vendorPhoneNo;

    @OneToOne
    @JoinColumn(name = "request_id")
    private  MaintenanceRequests maintenanceRequests;
    // Getters and Setters
    public long getVendorId() {
        return vendorId;
    }

    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorPhoneNo() {
        return vendorPhoneNo;
    }

    public void setVendorPhoneNo(String vendorPhoneNo) {
        this.vendorPhoneNo = vendorPhoneNo;
    }

    public MaintenanceRequests getMaintenanceRequests() {
        return maintenanceRequests;
    }

    public  void  setMaintenanceRequests(MaintenanceRequests maintenanceRequests)
    {
        this.maintenanceRequests=maintenanceRequests;

    }
}
