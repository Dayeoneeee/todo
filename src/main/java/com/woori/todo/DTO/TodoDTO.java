package com.woori.todo.DTO;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
//Builder 변수들을 DTO로 만드는 작업
//ToString DTO를 변수로 출력할 때 사용
public class TodoDTO {
    private Integer id;     //일련번호
    private String title;   //제목
    private String todo;    //해야할일
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate datetodo; //날짜 날짜전송 -> 날짜시간
    private String importance;  //중요도
    private String status;  //상태
    private LocalDateTime regdate;
    private LocalDateTime moddate;
}
