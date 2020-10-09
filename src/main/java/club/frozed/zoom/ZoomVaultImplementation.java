package club.frozed.zoom;

import club.frozed.zoom.vault.ZoomVaultImplementationChat;
import club.frozed.zoom.vault.ZoomVaultImplementationPermission;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Ryzeon
 * Project: Zoom-Vault
 * Date: 1/10/2020 @ 22:03
 */

public class ZoomVaultImplementation extends JavaPlugin {

    @Getter private static ZoomVaultImplementation instance;

    private ZoomVaultImplementationPermission permission;

    private ZoomVaultImplementationChat chat;

    @Override
    public void onEnable() {
        instance = this;
        permission = new ZoomVaultImplementationPermission();
        permission.register();
        chat = new ZoomVaultImplementationChat(permission);
        chat.register();
        Bukkit.getConsoleSender().sendMessage("§7[§eZoom§7] §aSuccessfully enabling vault support.");
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
