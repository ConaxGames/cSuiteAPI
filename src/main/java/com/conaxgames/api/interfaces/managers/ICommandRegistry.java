package com.conaxgames.api.interfaces.managers;

import com.conaxgames.libraries.acf.PaperCommandManager;

public interface ICommandRegistry {

    void loadContexts(PaperCommandManager paperCommandManager);
    void loadCompletions(PaperCommandManager paperCommandManager);

}
