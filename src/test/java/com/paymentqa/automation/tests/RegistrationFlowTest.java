package com.paymentqa.automation.tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.paymentqa.automation.dao.DbHelper;
import com.paymentqa.automation.pages.UsuarioFormPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Test orquestador (capa 1 del diagrama). Requiere que RegisterServer ya
 * este corriendo en otra terminal (http://localhost:5002).
 *
 * Flujo: llena el formulario via Page Object -> obtiene el id que devuelve
 * la UI -> valida directo contra SQLite via DAO -> assert final comparando
 * lo enviado contra lo persistido.
 */
public class RegistrationFlowTest {

    private static final String BASE_URL = "http://localhost:5002/";

    private Playwright playwright;
    private Browser browser;
    private Page page;
    private final DbHelper dbHelper = new DbHelper();

    @BeforeClass
    public void setUp() {
        playwright = Playwright.create();
        // headless=false para que puedas ver el navegador abrirse y llenar el form
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    @Test
    public void elUsuarioRegistradoEnUiDebePersistirEnBaseDeDatos() throws Exception {
        String nombreEnviado = "Heilyn Fuselier";
        String emailEnviado = "heilyn.test@example.com";

        // 1. Page Object Model: interaccion con la UI
        UsuarioFormPage formPage = new UsuarioFormPage(page);
        formPage.navigate(BASE_URL);
        formPage.register(nombreEnviado, emailEnviado);
        formPage.waitForConfirmation();

        long idGenerado = Long.parseLong(formPage.getConfirmedUserId());

        // 2. Database DAO: consulta directa a SQLite
        DbHelper.UsuarioRegistrado persistido = dbHelper.buscarPorId(idGenerado);

        // 3. Assert final: lo enviado == lo persistido
        Assert.assertNotNull(persistido, "El usuario deberia existir en la base de datos");
        Assert.assertEquals(persistido.nombre(), nombreEnviado, "El nombre persistido debe coincidir con el enviado");
        Assert.assertEquals(persistido.email(), emailEnviado, "El email persistido debe coincidir con el enviado");
    }

    @AfterClass
    public void tearDown() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}
