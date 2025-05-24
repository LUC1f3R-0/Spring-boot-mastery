package com.example.demo.Model;

public class AdminUser extends User{
    private String adminLevel;

    public String getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel;
    }

    public AdminUser(long _id, String _name, String _adminLevel) {
        super(_id, _name);
        this.adminLevel = _adminLevel;
    }
}
