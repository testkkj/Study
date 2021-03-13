package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Getter
 * 클래스 내 모든 필드의 Getter 메소드를 자동생성
 */
@Getter
/**
 * @NoArgsConstructor
 * 기본 생성자 자동 추가
 * public Posts(){} 와 같은 효과
 */
@NoArgsConstructor
/**
 * @Entity
 * 태이블과 링크될 틀래스임을 나타냅니다.
 * 기본값으로 클래스의 카멜케이스이름을 언더스코어네이밍으로 테이블이름을 매칭
 * SalesManager.java -> sales_manager table
 */
@Entity
public class Posts extends BaseTimeEntity {

    /**
     * @Id
     * 해당 테이블의 PK필드
     */
    @Id
    /**
     * @GeneratedValue
     * PK의 생성규칙
     * 스프링 부트 2.0 에서는 GenerationType.IDENTITY 옵션을 추가해야만 Auto_increment가 됨
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * @Column
     * 테이블의 칼럼을 나타내며 선언하지 않아도 클래스의 필드는 모두 칼럼이됨
     * 기본값 외에 추가로 변경이 필요한 옵션이 있을때 사용
     * 기본길이 이상으로 주거나 타입을 변경하고 싶을때 사용
     */
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    /**
     * @Builder
     * 해당 클래스의 빌더 패턴 클래스를 생성
     * 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
     */
    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
