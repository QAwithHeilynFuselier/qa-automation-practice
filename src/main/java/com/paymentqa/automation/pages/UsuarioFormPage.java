package com.paymentqa.automation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

/**
 * Page Object Model para el formulario de registro (localhost:5002/).
 * Encapsula los locators: el test nunca llama page.locator() directamente,
 * solo usa los metodos publicos de esta clase.
 */
public class UsuarioFormPage {

    private final Page page;
    private final Locator nameInput;
    private final Locator emailInput;
    private final Locator submitButton;
    private final Locator resultBanner;
    private final Locator userIdLabel;

    public UsuarioFormPage(Page page) {
        this.page = page;
        this.nameInput = page.locator("#name");
        this.emailInput = page.locator("#email");
        this.submitButton = page.locator("#submitBtn");
        this.resultBanner = page.locator("#result");
        this.userIdLabel = page.locator("#userId");
    }

    public void navigate(String baseUrl) {
        page.navigate(baseUrl);
    }

    public void fillName(String name) {
        nameInput.fill(name.trim()); // trim: edge case de espacios en blanco al inicio/final
    }

    public void fillEmail(String email) {
        emailInput.fill(email.trim());
    }

    public void submit() {
        submitButton.click();
    }

    public void register(String name, String email) {
        fillName(name);
        fillEmail(email);
        submit();
    }

    public void waitForConfirmation() {
        resultBanner.waitFor(); // auto-wait de Playwright: espera visibilidad, sin Thread.sleep
    }

    public String getConfirmedUserId() {
        return userIdLabel.innerText();
    }
}
