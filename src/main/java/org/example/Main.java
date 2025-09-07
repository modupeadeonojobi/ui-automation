package org.example;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;


/**
 * @author iModupsy
 * @created 26/08/2025
 */
public class Main {
    public static void main(String[] args) {
        try (final Playwright playwright = Playwright.create()) {
            final Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false)
                    .setSlowMo(1000));
            final BrowserContext context = browser.newContext();
            final Page page = context.newPage();
            page.navigate("https://kccc.dufuna.com/realms/credit-collector/protocol/openid-connect/auth?client_id=credit-controller-client&redirect_uri=https%3A%2F%2Ffrontend-credit-collector.dufuna.com%2F&state=92a67c0f-2c4a-460f-b711-677b014c5557&response_mode=fragment&response_type=code&scope=openid&nonce=a036dc98-73b7-4156-a429-37c3543d4231&code_challenge=z2QV7f-e20-MORukNGGhbVWKa_rvzeULGq39pyz6bZs&code_challenge_method=S256");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).fill("blessing@example.om");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("example");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign In")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Search by organization's name")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Search by organization's name")).fill("KPMG Limited");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Search by organization's name")).press("Enter");
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("KPMG Limited SI-7 11/08/2025")).getByRole(AriaRole.IMG).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
            page.getByText("Configuration").click();
            page.getByText("Edit").first().click();
            page.getByRole(AriaRole.TEXTBOX).click();
            page.getByRole(AriaRole.TEXTBOX).fill("");
            page.getByRole(AriaRole.TEXTBOX).press("CapsLock");
            page.getByRole(AriaRole.TEXTBOX).fill("Ariel International");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Update")).click();
            page.getByText("Dashboard").click();
            page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("user")).locator("svg").click();
            page.getByText("Sign Out").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Out")).click();
        }
    }
}