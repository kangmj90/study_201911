package com.example.board.board.application.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BoardRegisterReq {
    private String id;

    private String name;

    private String description;

    private Long memberId;
}
