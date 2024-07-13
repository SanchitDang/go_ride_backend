package com.sanapplications.goridebackend.model;

import com.sanapplications.goridebackend.enums.MessageTypeEnum;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessageModel {

    private String content;
    private String sender;
    private MessageTypeEnum type;
}
