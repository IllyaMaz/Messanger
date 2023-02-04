package com.example.messanger.entity.chat;

import com.example.messanger.entity.users.Users;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "chat")
@Data
public class Chat {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id_first")
    private Users userFirst;

    @ManyToOne
    @JoinColumn(name = "user_id_second")
    private Users userSecond;
}
