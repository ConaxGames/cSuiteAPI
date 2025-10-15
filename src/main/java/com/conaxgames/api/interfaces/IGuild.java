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
    
    /**
     * Get the current guild wage amount per member
     * @return The current wage amount
     */
    default double getWageAmount() {
        return 0.0;
    }
    
    /**
     * Set the amount of money each member will receive as daily wage
     * @param amount The amount to set as wage
     */
    default void setWageAmount(double amount) {
    }
    
    /**
     * Get the timestamp of the last wage payment
     * @return The timestamp in milliseconds
     */
    default long getLastWagePayment() {
        return 0L;
    }
    
    /**
     * Calculate if there is enough money in the bank to pay wages
     * @return True if there are sufficient funds
     */
    default boolean hasEnoughFundsForWages() {
        return true;
    }
}
