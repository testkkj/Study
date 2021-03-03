package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * 컨트롤러를 JSON을 반환하는 컨트롤러로 만듬
 * @ResponseBody를 각 메소드마다 선언하는걸 통합한 것이라고 보면 됨
 */
@RestController
public class HelloController {

    /**
    * Get 요청을 받을수 있는 API
    */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    /**
     * @RequestParam
     * 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
     * @RequestParam("name")을 String name에 저장
     */
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
