package com.conaxgames.api.callbacks;

import com.conaxgames.api.interfaces.IGrant;

public interface CreateGrantCallback {

    void complete(String target, IGrant grant);

}
