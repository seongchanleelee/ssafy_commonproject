package com.ssafy.webterview.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RequestDto {
    private String recipientPhoneNumber;
    private String title;
    private String content;

}