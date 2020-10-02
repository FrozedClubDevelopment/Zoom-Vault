package club.frozed.zoom.utils;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ryzeon
 * Project: Zoom-Vault
 * Date: 1/10/2020 @ 22:18
 */

public class CC {
    public static String MENU_BAR;
    public static String CHAT_BAR;
    public static String MEDIUM_CHAT_BAR;

    public CC() {
    }

    public static String translate(String in) {
        return ChatColor.translateAlternateColorCodes('&', in);
    }

    public static List<String> translate(List<String> lines) {
        List<String> toReturn = new ArrayList();
        Iterator var2 = lines.iterator();

        while(var2.hasNext()) {
            String line = (String)var2.next();
            toReturn.add(ChatColor.translateAlternateColorCodes('&', line));
        }

        return toReturn;
    }

    public static List<String> translate(String[] lines) {
        List<String> toReturn = new ArrayList();
        String[] var2 = lines;
        int var3 = lines.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String line = var2[var4];
            if (line != null) {
                toReturn.add(ChatColor.translateAlternateColorCodes('&', line));
            }
        }

        return toReturn;
    }

    static {
        MENU_BAR = ChatColor.GRAY.toString() + ChatColor.STRIKETHROUGH.toString() + "------------------------";
        CHAT_BAR = ChatColor.GRAY.toString() + ChatColor.STRIKETHROUGH.toString() + "------------------------------------------------";
        MEDIUM_CHAT_BAR = ChatColor.GRAY.toString() + ChatColor.STRIKETHROUGH.toString() + "------------------------------";
    }
}
