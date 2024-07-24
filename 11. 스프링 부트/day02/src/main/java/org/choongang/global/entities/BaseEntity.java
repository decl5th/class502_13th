package org.choongang.global.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter @Setter
@MappedSuperclass
public class BaseEntity {

    @LastModifiedDate
    private LocalDateTime modifiedAt;

    @CreatedDate
    private LocalDateTime createdAt;
}
