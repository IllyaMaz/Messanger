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

    @OneToOne
    @JoinColumn(name = "user_id_first")
    private Users userFirst;

    @OneToOne
    @JoinColumn(name = "user_id_second")
    private Users userSecond;
}
