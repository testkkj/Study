package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * ibatis / MyBatis 등에서 Dao 라고 불리는 DB Layer 접근자
 * JPA에선 Repository라고 부르며 interface로 생성
 * JpaRepository<Entity 클래스, Pk타입>을 상속하면 기본 CRUD 메소드가 자동 생성
 * @Repository를 추가할 필요도 없음
 * 주의할 점 Entity와 EntityRepository는 함께 위치해야함
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
