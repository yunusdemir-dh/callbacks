package com.deliveryhero.alfred.callbacks.messages.platform;

import lombok.Data;

@Data
public class PaymentInstructionStatusChanged {
    private String status;
}
