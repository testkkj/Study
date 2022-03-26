package hello.hellospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;

@Controller
public class MemberController {

    // 필드 주입
    // @Autowired
    // private MemberService memberService;

    // 생성자 주입
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 세터 주입
    // private MemberService memberService;

    // @Autowired
    // public void setMemberService(MemberService memberService) {
    // this.memberService = memberService;
    // }

    /**
     * java 소스에서 등록하는 방법은 SpringConfig.java를 사용해서 등록
     * 아래는 컴포넌트 스캔을 이용한 방식
     * dependency injection DI에는 3가지 방법을 사용할수 있음
     * 강의상 필드 / 생성자 / 세터 3가지를 작성하고
     * 강의 기준 현재 주로 사용되는 방법은 생성자 주입
     */

     @GetMapping("/members/new")
     public String createForm() {
         return "members/createMemberForm";
     }

     @PostMapping("/members/new")
     public String create(MemberForm form) {
         Member member = new Member();
         member.setName(form.getName());

         memberService.join(member);

         return "redirect:/";
     }

     @GetMapping("/members")
     public String list(Model model) {
         List<Member> members = memberService.findMembers();
         model.addAttribute("members", members);
         return "members/memberList";
     }

}
