package spring.test.soumen.controllers.model;

import javax.persistence.*;

@Entity
@Table(name = "emp")
public class Users
{
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_address")
    private String address;
    @Column(name = "user_blocked")
    private Integer userBanned;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserBanned() {
        return userBanned;
    }

    public void setUserBanned(Integer userBanned) {
        this.userBanned = userBanned;
    }
}