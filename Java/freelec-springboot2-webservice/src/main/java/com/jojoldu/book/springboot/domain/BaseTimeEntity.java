package com.jojoldu.book.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
/**
 * JPA Entity 클래스들이 이 Entity를 상속하면 이 필드들도 칼럼으로 인식하도록 하는 설정
 */
@MappedSuperclass
/**
 * Auditing 기능 포함
 */
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {

    /**
     * 생성시간저장
     */
    @CreatedDate
    private LocalDateTime createdDate;

    /**
     * 수정된 시간 저장
     */
    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
