package com.github.white555gamer.playersdc.assets.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import java.util.List;

import static com.github.white555gamer.playersdc.assets.messages.TemplateMsg.MissingArg;
import static com.github.white555gamer.playersdc.assets.parse.Location2StringParser.Location2StringWithWorldParser;
import static org.bukkit.Bukkit.getCommandAliases;
import static org.bukkit.Bukkit.getPlayer;

public class PlayerSDCC implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0 || args.length == 1) {

            sender.sendMessage(MissingArg);
            return true;

        } else if (args.length == 2) {

            if (getPlayer(args[0]) != null) {

                Player player = getPlayer(args[0]);

                switch (args[1]) {

                    case "playerexp":
                        sender.sendMessage("Player Exp(" + args[0] + "):\n" +
                                "  Player Total Experience: " + player.getTotalExperience() + "\n" +
                                "  Player Exp: " + player.getExp() + "\n" +
                                "  Player Level: " + player.getLevel() + "\n" +
                                "  Player Exp To Level: " + player.getExpToLevel());
                        break;

                    case "playername":
                        sender.sendMessage("Player Name(" + args[0] + "):\n" +
                                "  Player Name: " + player.getName() + "\n" +
                                "  Player Custom Name: " + player.getCustomName() + "\n" +
                                "  Player Display Name: " + player.getDisplayName() + "\n" +
                                "  Player List Name: " + player.getPlayerListName());
                        break;

                    case "playerhealth":
                        sender.sendMessage("Player Health(" + args[0] + "):\n" +
                                "  Player Health: " + player.getHealth() + "\n" +
                                "  Player Health Scale: " + player.getHealthScale() + "\n" +
                                "  Player Food Level: " + player.getFoodLevel() + "\n" );
                        break;

                    case "playerlocation":
                        String CurrentLocData = Location2StringWithWorldParser(player.getLocation());
                        String BedLocData = Location2StringWithWorldParser(player.getBedLocation());
                        String BedSpawnLocData = Location2StringWithWorldParser(player.getBedSpawnLocation());
                        String LastDeathData = Location2StringWithWorldParser(player.getLastDeathLocation());

                        Vector PlayerVec = player.getVelocity();
                        String PlayerVecData = PlayerVec.getX() + "/" + PlayerVec.getY() + "/" + PlayerVec.getZ();

                        sender.sendMessage("Player Location(" + args[0] + "):\n" +
                                "  Player Location: " + CurrentLocData + "\n" +
                                "  Player Bed Location: " + BedLocData + "\n" +
                                "  Player Bed Spawn Location: " + BedSpawnLocData + "\n" +
                                "  Player Last Death Location: " + LastDeathData + "\n" +
                                "  Player Weather: " + getPlayer(args[0]).getPlayerWeather() + "\n" +
                                "  Player Vehicle: " + player.getVehicle().getName() + "\n" +
                                "  Player Velocity: " + PlayerVecData);
                        break;

                    case "playertime":
                        sender.sendMessage("Player Time(" + args[0] + "):\n" +
                                "  Player Locale: " + player.getLocale() + "\n" +
                                "  Player Time: " + player.getPlayerTime() + "\n" +
                                "  Player Time Offset: " + player.getPlayerTimeOffset());
                        break;

                    case "playerflight":
                        sender.sendMessage("Player Flight(" + args[0] + "):\n" +
                                "  Player Allow Filght: " + player.getAllowFlight() + "\n" +
                                "  Player Flight Speed: " + player.getFlySpeed() + "\n" +
                                "  Player is Flying: " + player.isFlying());
                        break;











                    case "playernetwork":
                        sender.sendMessage("Player NetWork(" + args[0] + "):\n" +
                                "  Player Address: " + player.getAddress().toString() + "\n" +
                                "  Player Locale: " + player.getLocale() + "\n" +
                                "  Player Ping: " + player.getPing());
                        break;





                    case "playerlastdamage":
                        sender.sendMessage("Player Last Damage(" + args[0] + "):\n" +

                                getPlayer(args[0]).getLastDamage() +
                                getPlayer(args[0]).getLastDamageCause()
                                );

                    case "playerdata":
                        sender.sendMessage("Player Data(" + args[0] + "):\n" +
                                "  Player Name: " + player.getName() + "\n" +
                                "  Player Hash Code: " + player.hashCode() + "\n" +
                                "  Player UUID: " + player.getUniqueId() + "\n" +
                                "");

                    case "playerentity":
                        sender.sendMessage("Player Entity(" + args[0] + "):\n" +
                                "  ");

                    case "playerallocation":
                        sender.sendMessage("Player Allocation(" + args[0] + "):\n" +
                                "  ");


                    case "playerwalk":
                        sender.sendMessage("Player Walk(" + args[0] + "):\n" +
                                "  Player Walk Speed: " + player.getWalkSpeed() + "\n" +
                                "  Player is Sneaking: " + player.isSneaking() + "\n" +
                                "  Player is Sprinting: " + player.isSprinting() + "\n" +
                                "  Player is In Water: " + player.isInWater() + "\n" +
                                "  Player is Swimming: " + player.isSwimming());

                    case "playergamemode":
                        sender.sendMessage("Player Game Mode(" + args[0] + "):\n" +
                                "  Player Game Mode: " + player.getGameMode().name() + "\n" +
                                "  Player Previous Game Mode: " + player.getPreviousGameMode().name() + "\n" +
                                "  Player Spectator Target: " + player.getSpectatorTarget());
                        break;


                }





            }

        }


        getPlayer(args[0]).getClientViewDistance();
        getPlayer(args[0]).getCompassTarget();
        getPlayer(args[0]).getPreviousGameMode();
        getPlayer(args[0]).getScoreboard();
        getPlayer(args[0]).getAbsorptionAmount();
        getPlayer(args[0]).getActivePotionEffects();
        getPlayer(args[0]).getArrowCooldown();
        getPlayer(args[0]).getArrowsInBody();
        getPlayer(args[0]).getBoundingBox();
        getPlayer(args[0]).getCanPickupItems();
        getPlayer(args[0]).getCategory();
        getPlayer(args[0]).getCollidableExemptions();
        getPlayer(args[0]).getDeathSound();
        getPlayer(args[0]).getDiscoveredRecipes();
        getPlayer(args[0]).getEnderChest();
        getPlayer(args[0]).getEntityId();
        getPlayer(args[0]).getEquipment();
        getPlayer(args[0]).getEyeHeight();
        getPlayer(args[0]).getEyeLocation();
        getPlayer(args[0]).getFacing();
        getPlayer(args[0]).getFallDistance();
        getPlayer(args[0]).getFireTicks();
        getPlayer(args[0]).getFirstPlayed();
        getPlayer(args[0]).getFreezeTicks();
        getPlayer(args[0]).getHeight();
        getPlayer(args[0]).getInventory();
        getPlayer(args[0]).getLastPlayed();
        getPlayer(args[0]).getLeashHolder();
        getPlayer(args[0]).getMainHand();
        getPlayer(args[0]).getMaxFireTicks();
        getPlayer(args[0]).getMaxFreezeTicks();
        getPlayer(args[0]).getMaximumAir();
        getPlayer(args[0]).getMaximumNoDamageTicks();
        getPlayer(args[0]).getNoDamageTicks();
        getPlayer(args[0]).getOpenInventory();
        getPlayer(args[0]).getPlayerProfile();
        getPlayer(args[0]).getPortalCooldown();
        getPlayer(args[0]).getServer();
        getPlayer(args[0]).getSleepTicks();
        getPlayer(args[0]).getTicksLived();
        getPlayer(args[0]).getType();
        getPlayer(args[0]).getWidth();
        getPlayer(args[0]).hasAI();
        getPlayer(args[0]).hasGravity();
        getPlayer(args[0]).hasPlayedBefore();
        getPlayer(args[0]).isPlayerTimeRelative();
        getPlayer(args[0]).isHealthScaled();
        getPlayer(args[0]).isAllowingServerListings();
        getPlayer(args[0]).isSleepingIgnored();
        getPlayer(args[0]).isSleeping();
        getPlayer(args[0]).isBanned();
        getPlayer(args[0]).isBlocking();
        getPlayer(args[0]).isClimbing();
        getPlayer(args[0]).isCollidable();
        getPlayer(args[0]).isCustomNameVisible();
        getPlayer(args[0]).isDead();
        getPlayer(args[0]).isFrozen();
        getPlayer(args[0]).isGliding();
        getPlayer(args[0]).isGlowing();
        getPlayer(args[0]).isConversing();
        getPlayer(args[0]).isHandRaised();
        getPlayer(args[0]).isInsideVehicle();
        getPlayer(args[0]).isInvisible();
        getPlayer(args[0]).isInvulnerable();
        getPlayer(args[0]).isLeashed();
        getPlayer(args[0]).isOnline();
        getPlayer(args[0]).isOp();
        getPlayer(args[0]).isPersistent();
        getPlayer(args[0]).isRiptiding();
        getPlayer(args[0]).isSilent();
        getPlayer(args[0]).isValid();
        getPlayer(args[0]).isVisualFire();
        getPlayer(args[0]).isWhitelisted();
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        return null;
    }
}
