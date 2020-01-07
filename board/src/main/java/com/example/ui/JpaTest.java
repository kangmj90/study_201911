package com.example.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.lang.reflect.Member;

/**
 * @author kangminjeong
 * @since 2019. 12. 11.
 */
public class JpaTest {

    public void setting() {
//        엔티티 매니저 관리
//        JDBC Connection 객체
//        엔티티 CRUD 관련 모든 일 처리
//        DB 하나당 factory 하나
        final EntityManagerFactory entityManagerFactory = null;

//        특정 작업을 위해 데이터베이스에 액세스 하는 역할
//        엔티티를 데이터베이스에 CRUD 작업
//        엔티티 관리
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

//        비영속성
        final Member member = new Member();

//        영속성
        entityManager.persist(member);
        entityManager.find(Member.class, 1L);

//        준영속성
//        해당 객체의 영속성만 제외
        entityManager.detach(member);
//        모든 영속성 객체 초기화
        entityManager.clear();
//        영속성 종료
        entityManager.close();

//        삭제
        entityManager.remove(member);

        entityManager.flush();

//        JPQL Query
        entityManager.createQuery("select * from member");
    }

    class Member {
        private Long id;
        private String name;
    }
}
