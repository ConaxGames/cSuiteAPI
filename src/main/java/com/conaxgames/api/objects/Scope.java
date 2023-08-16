package com.conaxgames.api.objects;

import com.conaxgames.api.interfaces.IScope;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Scope implements IScope {

    @NonNull private String id;

}
