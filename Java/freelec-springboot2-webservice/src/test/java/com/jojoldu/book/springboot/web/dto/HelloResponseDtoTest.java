package com.jojoldu.book.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    
    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;
        
        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
        
        //then
        /**
         * assertThat
         * assertj 테스트 검증 라이브러의 검증 메소드
         * 검증하고 싶은 대상을 메소드 인자로 받음
         * 메소드 체이닝이 지원되어 isEqualTo와 같이 메소드를 이어서 사용 가능
         */
        assertThat(dto.getName()).isEqualTo(name);
        /**
         * isEqualTo
         * assertj의 동등 비교 메소드
         * assertThat의 값과 isEqualTo의 값을 비교해 같을때만 성공
         */
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
