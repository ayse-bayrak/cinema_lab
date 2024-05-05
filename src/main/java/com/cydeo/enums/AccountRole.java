package com.cydeo.enums;

public enum AccountRole {

    REGULAR_USERS("Regular Users"),
    ADMIN_USERS("Admin Users");

    private final String roleName;

    AccountRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
