package com.conaxgames.api.managers;

import com.conaxgames.libraries.acf.PaperCommandManager;

public interface ICommandRegistry {

    void loadContexts(PaperCommandManager paperCommandManager);

    void loadCompletions(PaperCommandManager paperCommandManager);

}
