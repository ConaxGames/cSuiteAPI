package com.conaxgames.api.interfaces.managers;

import com.conaxgames.api.interfaces.IChatTag;

import java.util.List;

public interface IChatTagManager {

    List<? extends IChatTag> getChatTags();

    IChatTag getByName(String name);

    boolean addChatTag(IChatTag tag);

    boolean removeChatTag(IChatTag tag);

}
