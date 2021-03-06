package com.iiitb.spe.market_place_v1.User;

import javax.persistence.*;

@MappedSuperclass
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int uid;
    @Column(length = 100,nullable = false)
    private String firstname;
    @Column(length = 100,nullable = false)
    private String lastname;
    @Column(length = 10,nullable = false)
    private String contactno;

    @Column(length = 15,unique = true, nullable = false)
    private String username;

    @Column(length = 15,nullable = false)
    private String password;

    //role  ROLE_CUSTOMER ROLE_MANAGER ROLE_ADMIN

    public User() {
    }

    public User(int uid, String firstname, String lastname, String contactno, String username, String password) {
        this.uid = uid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactno = contactno;
        this.username = username;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int cid) {
        this.uid = cid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
