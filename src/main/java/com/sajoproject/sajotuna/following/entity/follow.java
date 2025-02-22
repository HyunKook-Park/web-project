package com.sajoproject.sajotuna.following.entity;

import com.sajoproject.sajotuna.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "follow")
@NoArgsConstructor
public class follow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "follow_id")  // 컬럼 이름 명시
    private Long followId;

    @ManyToOne
    @JoinColumn(name = "following_id", nullable = false)
    private User following;

    @ManyToOne
    @JoinColumn(name = "followed_id", nullable = false)
    private User followed;
}
