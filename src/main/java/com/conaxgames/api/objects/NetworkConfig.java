package com.conaxgames.api.objects;

import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class NetworkConfig {

    public String networkName = "ConaxGames";
    public String networkDomain = "www.conaxgames.com";
    public String networkPrimaryColor = "&6";
    public String networkSecondaryColor = "&e";
    public String networkTertiaryColor = "&7";
    public String networkDiscordLink = "https://www.discord.gg/conaxgames";
    public String networkTeamspeakDomain = "ts.conaxgames.com";
    public String networkTwitterLink = "https://www.twitter.com/conaxgames";
    public String networkStoreLink = "https://store.conaxgames.net/";

    public List<String> hubServerIdentifiers = Arrays.asList("hub", "lobby");

    public String alreadyOwnChatTagCurrency = "coins";
    public Integer alreadyOwnChatTagReplacement = 250;

    public String alreadyOwnChatTagColorCurrency = "coins";
    public Integer alreadyOwnChatTagColorReplacement = 250;

    public Integer guildDefaultMemberLimit = 50;

    public Boolean tagMentionNamesInChat = false;
    public String tagMentionNamesFormat = "&d&o%NAME%";

    public Boolean commandBlockerEnabled = true;
    public String commandBlockerBlockMessage = "&fUnknown command. Type /help for help.";
    public List<String> commandBlockerTerms = Arrays.asList("?", "bukkit:?", "bukkit:help", "/me", "/teammsg");

    public Boolean tabBlockerEnabled = true;
    public List<String> tabBlockerTerms = Arrays.asList("?", "bukkit:?", "bukkit:help", "/ver", "/version", "/?", "/about", "/help");

    public List<String> hardFilteredTerms = Arrays.asList("nigger", "niggerr", "niggerrr", "niggerrrr", "niggger", "nigggger", "niggggger", "nigga", "niggaa",
            "niggaaa", "niggaaaa", "niga", "nigaa", "nigaaa", "nigaaaa", "nigga", "niggga", "nigggga", "niggggga");
    public List<String> softFilteredTerms = Arrays.asList("nigga", "niga");
    public Boolean limitCapsInGlobalChat = true;
    public Boolean limitCharacterSpam = true;
    public Boolean useJaroFilter = true;
    public Double jaroDetectionBound = 0.85;
    public Boolean informPlayerOfFilteredMessage = true;

    public String autoSpamDetectionCommand = "tmute %PLAYER% %LENGTH% (Auto) Spamming -s";
    public List<String> autoSpamDetectionLengths = Arrays.asList("10m", "30m", "1h", "3h", "6h", "12h", "1d");
    public String autoToxicityDetectionCommand = "tmute %PLAYER% %LENGTH% (Auto) Toxicity (%REASON%) -s";
    public List<String> autoToxicityDetectionLengths = Arrays.asList("1h", "3h", "12h", "1d");

    public Field getField(String name) {
        try {
            return this.getClass().getField(name);
        } catch (NoSuchFieldException e) {
            return null;
        }
    }

    public Object getValue(Field field) {
        try {
            field.setAccessible(true);
            return field.get(this);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, Object> getValues() {
        Map<String, Object> values = new HashMap<>();
        for (Field field : this.getClass().getFields()) {
            field.setAccessible(true);
            try {
                values.put(field.getName(), field.get(this));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return values;
    }

    public void reload(Document document) {
        for (Field field : this.getClass().getFields()) {
            field.setAccessible(true);
            try {
                if (document.containsKey(field.getName())) {
                    Object savedValue = document.get(field.getName());
                    field.set(this, savedValue);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public Document toDocument() {
        Document document = new Document("type", "networkConfig");
        for (Field field : this.getClass().getFields()) {
            field.setAccessible(true);
            try {
                Object fieldValue = field.get(this);
                if (fieldValue != null) {
                    document.append(field.getName(), fieldValue);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return document;
    }

}
