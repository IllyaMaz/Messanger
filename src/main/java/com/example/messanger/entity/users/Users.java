package com.example.messanger.entity.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class Users {

    @Id
    private int id;

    @Column(name = "nick_name")
    private String nickName;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String phone;
}
