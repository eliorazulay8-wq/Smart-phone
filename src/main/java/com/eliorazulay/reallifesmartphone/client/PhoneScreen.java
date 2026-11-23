package com.eliorazulay.reallifesmartphone.client;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class PhoneScreen extends Screen {
    private static final int PHONE_W = 230, PHONE_H = 420;
    private int left, top;
    private String selectedApp = "";
    public PhoneScreen() { super(Component.translatable("screen.reallifesmartphone.home")); }
    @Override protected void init() { left = (width - PHONE_W) / 2; top = (height - PHONE_H) / 2; }
    @Override public void render(GuiGraphics g, int mouseX, int mouseY, float partialTick) {
        renderBackground(g);
        g.fill(left - 5, top - 5, left + PHONE_W + 5, top + PHONE_H + 5, 0xFF111318);
        g.fill(left, top, left + PHONE_W, top + PHONE_H, 0xFF202633);
        g.fill(left + 8, top + 8, left + PHONE_W - 8, top + 42, 0xFF111820);
        g.drawString(font, "9:41", left + 18, top + 20, 0xFFFFFFFF, false);
        g.drawString(font, "● ● ●  100%", left + 150, top + 20, 0xFFFFFFFF, false);
        if (selectedApp.isEmpty()) {
            g.drawCenteredString(font, "My Smartphone", left + PHONE_W / 2, top + 60, 0xFFFFFFFF);
            String[] apps = {"Phone", "Messages", "Camera", "Gallery", "Browser", "Settings"};
            for (int i = 0; i < apps.length; i++) {
                int col = i % 3, row = i / 3;
                int x = left + 16 + col * 68, y = top + 105 + row * 105;
                g.fill(x, y, x + 58, y + 58, 0xFF435A76);
                g.drawCenteredString(font, apps[i].substring(0, 1), x + 29, y + 22, 0xFFFFFFFF);
                g.drawCenteredString(font, apps[i], x + 29, y + 66, 0xFFFFFFFF);
            }
            g.drawCenteredString(font, "Tap an app • ESC to close", left + PHONE_W / 2, top + PHONE_H - 25, 0xFFB8C5D6);
        } else {
            g.drawString(font, "‹  " + selectedApp, left + 18, top + 62, 0xFFFFFFFF);
            g.drawCenteredString(font, "This app is planned for a future update.", left + PHONE_W / 2, top + 190, 0xFFFFFFFF);
            g.drawCenteredString(font, "Click to go back", left + PHONE_W / 2, top + 220, 0xFFB8C5D6);
        }
        super.render(g, mouseX, mouseY, partialTick);
    }
    @Override public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0) {
            if (!selectedApp.isEmpty()) { selectedApp = ""; return true; }
            String[] apps = {"Phone", "Messages", "Camera", "Gallery", "Browser", "Settings"};
            for (int i = 0; i < apps.length; i++) {
                int col = i % 3, row = i / 3;
                int x = left + 16 + col * 68, y = top + 105 + row * 105;
                if (mouseX >= x && mouseX <= x + 58 && mouseY >= y && mouseY <= y + 85) { selectedApp = apps[i]; return true; }
            }
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }
    @Override public boolean isPauseScreen() { return false; }
}