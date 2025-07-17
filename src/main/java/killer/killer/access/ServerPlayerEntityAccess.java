package killer.killer.access;

import killer.killer.playerdata.PlayerData;
import killer.killer.playerdata.PlayerProfile;
import killer.killer.teleportation.QueuedTeleport;
import killer.killer.text.ECText;

public interface ServerPlayerEntityAccess {
    QueuedTeleport ec$getQueuedTeleport();

    void ec$setQueuedTeleport(QueuedTeleport queuedTeleport);

    QueuedTeleport ec$endQueuedTeleport();

    PlayerData ec$getPlayerData();

    void ec$setPlayerData(PlayerData playerData);

    PlayerProfile ec$getProfile();

    void ec$setProfile(PlayerProfile profile);

    ECText ec$getEcText();
}
