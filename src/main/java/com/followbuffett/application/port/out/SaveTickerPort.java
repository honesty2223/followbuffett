package com.followbuffett.application.port.out;

import com.followbuffett.domain.Ticker;

import java.util.List;

public interface SaveTickerPort {
    int saveAll(List<Ticker> tickers);
}
