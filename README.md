# Real Life Smartphone — Forge 1.20.1

A starter mod project for Minecraft Java 1.20.1, Forge 47.2.0, Java 17.

## Build
Run `gradle build` with Gradle 8.1.1 and Java 17, or push to GitHub Actions. The workflow builds the mod and uploads the JAR as an Actions artifact.

## Current prototype
- Adds a Smartphone item.
- Right-click opens a phone-shaped GUI.
- Includes Phone, Messages, Camera, Gallery, Browser and Settings app tiles.
- ESC closes the GUI; it does not pause single-player.

## Not implemented yet
The app tiles are placeholders. Real calls/SMS, camera capture/gallery, internet browsing/video, battery/charging, PIN lock, 3D held-phone screen, and multiplayer screen synchronization are not implemented in this first build. The item texture is also a placeholder and needs a smartphone.png asset.

This is a foundation, not the complete real-life phone experience yet.