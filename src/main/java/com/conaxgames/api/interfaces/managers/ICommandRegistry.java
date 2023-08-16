package com.conaxgames.api.interfaces.managers;

import co.aikar.commands.PaperCommandManager;

public interface ICommandRegistry {

    void loadContexts(PaperCommandManager paperCommandManager);
    void loadCompletions(PaperCommandManager paperCommandManager);
}
