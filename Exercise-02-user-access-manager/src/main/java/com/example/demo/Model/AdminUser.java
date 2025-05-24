package com.example.demo.Model;

public class AdminUser extends User{
    private String adminLevel;

    public AdminUser(Long _id, String _name, String _adminLevel) {
        super(_id, _name);
        this.adminLevel = _adminLevel;
    }

    public String getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(String _adminLevel) {
        this.adminLevel = _adminLevel;
    }

    public String getAccessLevel(){
        return getName()+" - Full Access";
    }
}
