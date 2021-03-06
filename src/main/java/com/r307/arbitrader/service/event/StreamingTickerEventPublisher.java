package com.r307.arbitrader.service.event;

import com.r307.arbitrader.service.model.TickerEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class StreamingTickerEventPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    public StreamingTickerEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishTicker(TickerEvent tickerEvent) {
        applicationEventPublisher.publishEvent(tickerEvent);
    }
}
