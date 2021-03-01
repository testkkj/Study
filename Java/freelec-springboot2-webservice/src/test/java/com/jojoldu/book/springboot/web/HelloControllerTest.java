package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * JUnit에 내장된 실행자 외에 다른 실행자를 실행시킴
 * SpringRunner라는 스프링 실행자를 사용
 * 스프링 부트 테스트와 JUnit의 연결자
 */
@RunWith(SpringRunner.class)
/**
 * 테스트 어노테이션중 mvc에 집중하는 어노테이션
 * @Controller, @ControllerAdvice 사용가능
 * @Service, @Component, @Repository 사용불가
 * 지금은 컨트롤러만 사용하므로 선언
 */
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    /**
     * 스프링이 관리하는 빈을 주입 받음
     */
    @Autowired
    /**
     * 웹 API를 테스트 할때 사용
     * 스프링 MVC 테스트의 시작점
     * 이 클래스를 통해서 GET, POST 등의 API를 테스트 할수 있음
     */
    private MockMvc mvc;

    @Test
    public void hellowillreturn() throws Exception {
        String hello = "hello";

        /**
         * andExpect(status().isOk())package com.jojoldu.book.springboot.web;
         *
         * import org.junit.Test;
         * import org.junit.runner.RunWith;
         * import org.springframework.beans.factory.annotation.Autowired;
         * import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
         * import org.springframework.test.context.junit4.SpringRunner;
         * import org.springframework.test.web.servlet.MockMvc;
         * import org.springframework.test.web.servlet.ResultActions;
         *
         * import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
         * import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
         * import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
         *
         * @RunWith(SpringRunner.class)
         * @WebMvcTest
         * public class HelloControllerTest {
         *
         *     @Autowired
         *     private MockMvc mvc;
         *
         *     @Test
         *     public void hello가_리턴된다() throws Exception {
         *         //given
         *         String hello = "hello";
         *
         *         //when
         *         ResultActions perform = mvc.perform(get("/hello"));
         *
         *         //then
         *         perform
         *                 .andExpect(status().isOk())
         *                 .andExpect(content().string(hello));
         *     }
         * }
         * mvc.perform의 결과를 검증
         * HTTP Header의 Status를 검증
         * 200, 404, 500 등의 결과 검증
         * 200 = OK
         * andExpect(content().string(hello))
         * mvc.perform의 결과를 검증
         * 응답 본문의 내용을 검증
         * Controller의 리턴값이 hello가 맞는지 검증
         */
        mvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string(hello));
    }
}
