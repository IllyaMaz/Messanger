package com.example.messanger.entity.message;

import com.example.messanger.entity.chat.Chat;
import com.example.messanger.entity.users.Users;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table
@Data
public class Message {

    @Id
    private int id;

    @Column
    private String message;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;
}
