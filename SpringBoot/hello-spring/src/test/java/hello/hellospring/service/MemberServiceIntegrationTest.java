package hello.hellospring.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;

/**
 * @SpringBootTest
 * 스프링 컨테이너와 테스틑 함께 실행
 * @Transactional
 * 테스트 케이스에 붙이면 DB에 저장하지 않고 rollback시켜줌
 */
@SpringBootTest
@Transactional
public class MemberServiceIntegrationTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    void testFindMembers() {
        // given
        Member member = new Member();
        member.setName("hello");

        // when
        Long saveId = memberService.join(member);

        // then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());

    }

    @Test
    void testFindOne() {
        // given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        // when
        memberService.join(member1);
        // try {
        // memberService.join(member2);
        // fail();
        // } catch (Exception e) {
        // assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        // }
        // 위 주석처럼 작성하거나 아래와 같이 작성 가능
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        assertThat(e.getMessage());
        // then

    }

    @Test
    void testJoin() {

    }
}
