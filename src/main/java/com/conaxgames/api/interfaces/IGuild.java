package com.conaxgames.api.interfaces;

import com.conaxgames.api.managers.IGuildMember;

import java.util.List;
import java.util.UUID;

public interface IGuild {

    int getGuildID();

    String getName();

    String getLowerCaseName();

    String getTag();

    String getLowerCaseTag();

    String getDescription();

    UUID getLeader();

    String getLeaderName();

    boolean isDisableCombat();

    boolean toggleCombat();

    int getMaxMembers();

    void save();

    void delete();

    void broadcast(String message);

    List<? extends IGuildMember> getMembers();

    List<? extends IGuildMember> getOnlineMembers();

    String getTagStyled();

    double getBankBalance();

    void setBankBalance(double amount);
}
