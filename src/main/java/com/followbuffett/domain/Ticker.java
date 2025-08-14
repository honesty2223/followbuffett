package com.followbuffett.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticker {
    private String cik;             // SEC 기업 식별 번호
    private String name;            // 기업명
    private String symbol;          // 종목코드
    private String exchange;        // 거래소
    private LocalDate createdDate;  // 적재 날짜
}
