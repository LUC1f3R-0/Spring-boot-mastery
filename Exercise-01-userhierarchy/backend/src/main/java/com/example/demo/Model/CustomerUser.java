package com.example.demo.Model;

public class CustomerUser extends User{
    private String membershipType;

    public CustomerUser(long _id, String _name, String _membershipType) {
        super(_id, _name);
        this.membershipType = _membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}
