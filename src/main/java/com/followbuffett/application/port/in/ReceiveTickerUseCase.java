package com.followbuffett.application.port.in;

import com.followbuffett.domain.Ticker;

import java.util.List;

public interface ReceiveTickerUseCase {
    int saveTickers(String batchId, List<Ticker> tickers);
}
