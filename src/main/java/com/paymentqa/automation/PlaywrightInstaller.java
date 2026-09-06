package com.paymentqa.automation;

public class PlaywrightInstaller {
    public static void main(String[] args) throws Exception {
        com.microsoft.playwright.CLI.main(new String[]{"install", "chromium"});
    }
}
