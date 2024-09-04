package com.conaxgames.api.redis;


import com.conaxgames.libraries.redis.message.MessageTypeInterface;

public enum MessageType implements MessageTypeInterface {
    UNKNOWN,

    // Xenon
    REQUEST_ADD,
    REQUEST_REMOVE,
    SUCCESS_ADD,
    SUCCESS_REMOVE,
    FORCE_REMOVE,

    // Essentials
    HEARTBEAT,
    BROADCAST,
    SEND_MESSAGE,
    SEND_CLICKABLE,
    BROADCAST_CLICKABLE,
    SOCIAL_SPY,
    KICK_PLAYER,
    KICK_PLAYER_NAME,
    KICK_IP,
    EXECUTE_COMMAND,
    RELOAD_NETWORK_CONFIG,

    // Scopes
    SCOPE_CREATE,
    SCOPE_DELETE,
    SCOPE_EDIT,

    // Ranks
    RANK_CREATE,
    RANK_DELETE,
    RANK_PERMISSION_ADD,
    RANK_PERMISSION_REMOVE,
    RANK_PERMISSION_CLEAR,
    RANK_SCOPED_PERMISSION_ADD,
    RANK_SCOPED_PERMISSION_REMOVE,
    RANK_SCOPED_PERMISSION_CLEAR,
    RANK_INHERITANCE_ADD,
    RANK_INHERITANCE_REMOVE,
    RANK_EDIT_NAME,
    RANK_EDIT_PREFIX,
    RANK_EDIT_COLOR,
    RANK_EDIT_WEIGHT,

    // Bungee
    RANK_BUNGEE_PERMISSION_ADD,
    RANK_BUNGEE_PERMISSION_REMOVE,
    RANK_BUNGEE_PERMISSION_CLEAR,
    BUNGEE_PLAYER_PERMISSIONS,
    BUNGEE_SEND_MESSAGE,
    BUNGEE_STAFF_SERVER_SWITCH,

    // Chat Tags
    TAG_CREATE,
    TAG_DELETE,
    TAG_EDIT,
    TAG_EDIT_NAME,
    TAG_EDIT_STYLE,
    TAG_EDIT_DESCRIPTION,
    TAG_EDIT_STORE_STATUS,
    TAG_EDIT_SUFFIX,
    TAG_EDIT_PRIVATE,

    // Guilds
    GUILD_CREATE,
    GUILD_DELETE,
    GUILD_CHAT,
    GUILD_MEMBER_CREATE,
    GUILD_MEMBER_DELETE,
    GUILD_MEMBER_PROMOTE,
    GUILD_MEMBER_DEMOTE,
    GUILD_MEMBER_RANK_CHANGE,
    GUILD_INVITE_CREATE,
    GUILD_DESCRIPTION_CHANGE,
    GUILD_CHAT_MUTE_TOGGLE,
    GUILD_KILLS_UPDATE,
    GUILD_POINTS_UPDATE,
    GUILD_WINS_UPDATE,
    GUILD_RENAME,
    GUILD_RETAG,
    GUILD_TAG_SET_COLOR,
    GUILD_LEADER_CHANGE,
    GUILD_OPEN,
    GUILD_CLOSE,

    // Guilds Admin
    GUILD_ADMIN_TAG_COLOR_UNLOCK,
    GUILD_ADMIN_TAG_COLOR_LOCK,
    GUILD_ADMIN_SET_MAX_MEMBERS;
}
