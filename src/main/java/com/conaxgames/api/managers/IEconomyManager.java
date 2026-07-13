package com.conaxgames.api.managers;

import java.util.UUID;

public interface IEconomyManager {

    boolean hasAccount(UUID uuid);

    double getBalance(UUID uuid);

    boolean has(UUID uuid, double amount);

    boolean deposit(UUID uuid, double amount);

    boolean withdraw(UUID uuid, double amount);

    boolean set(UUID uuid, double amount);

    double getTotalEconomy();
}
