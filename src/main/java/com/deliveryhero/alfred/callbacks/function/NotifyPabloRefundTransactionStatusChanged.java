package com.deliveryhero.alfred.callbacks.function;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Slf4j
@Component("notify-pablo-refund-transaction-status-changed")
@Lazy
public class NotifyPabloRefundTransactionStatusChanged implements Function<Message<String>, String> {

    public NotifyPabloRefundTransactionStatusChanged() {
        log.info(getClass().getName() + " initialized");
    }

    @Override
    public String apply(Message<String> paymentInstructionStatusChangedMessage) {
        log.info("{} function has been triggered", getClass().getName());
        log.info("message: {}", paymentInstructionStatusChangedMessage);
        return "";
    }
}
