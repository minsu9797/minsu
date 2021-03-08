package com.victolee.board.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table()
public class BoardEntity extends TimeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(length = 225, nullable = false )
    private String content;

    @Builder
    public BoardEntity(Long id, String title, String writer, String content) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.content = content;
    }

}

