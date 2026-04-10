package com.conaxgames.api.objects;

import com.conaxgames.api.interfaces.IRank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RankWrapper {

    private String id;
    private String display;
    private int weight;
    private String prefix;
    private String suffix;
    private String color;

    public RankWrapper(IRank rank) {
        this.id = rank.getId();
        this.display = rank.getName();
        this.weight = rank.getWeight();
        this.prefix = rank.getPrefix();
        this.suffix = "";
        this.color = rank.getColor();
    }

    public RankWrapper(String id, String display, int weight, String prefix, String suffix, String color) {
        this.id = id;
        this.display = display;
        this.weight = weight;
        this.prefix = prefix;
        this.suffix = suffix;
        this.color = color;
    }

}
