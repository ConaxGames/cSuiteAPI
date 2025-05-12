package com.conaxgames.api.interfaces;

import com.conaxgames.api.interfaces.managers.IGuildMember;

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

    int getKills();

    int getPoints();

    int getWins();

    int getMaxMembers();

    void save();

    void delete();

    void broadcast(String message);

    List<? extends IGuildMember> getMembers();

    List<? extends IGuildMember> getOnlineMembers();

    String getTagStyled();

    IGuildTagColor getSelectedTagColor();
    
    /**
     * Get the bank balance for this guild
     * @return The current bank balance
     */
    double getBankBalance();
    
    /**
     * Set the bank balance for this guild
     * @param amount The new bank balance
     */
    void setBankBalance(double amount);
}
