package hello.hellospring.service;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;

public class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void BeforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService();
    }

    @AfterEach
    public void AfterEach() {
        memberRepository.clearStore();
    }

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
