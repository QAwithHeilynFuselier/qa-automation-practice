# Preparación — Entrevista Fiserv (Automated Tester, 8 de sept, 9 AM onsite, con Avinash Pandey)

## 0.1 La JD real, después de la llamada con el manager

Esto es más preciso que la publicación original — úsalo como la verdad de referencia a partir de ahora:

- **Rol real:** Automated Tester — 60% automatización, 40% manual. No es un rol de QA manual con algo de automatización de relleno; es al revés.
- **Top 3 skills que piden:** Playwright, AWS, GitLab.
- **Lenguaje de automatización:** Java como primario; Python también sirve, pero Java es lo que van a evaluar primero.
- **Requeridos:**
  - Experiencia hands-on desarrollando y manteniendo tests automatizados con **Playwright**, incluyendo construir scripts/frameworks reutilizables para aplicaciones web.
  - Competencia en Java o Python para desarrollar scripts de automatización.
  - Experiencia con un "test automation harness" (arnés/infraestructura de ejecución de pruebas).
  - Experiencia probando en un ambiente **AWS**.
  - Experiencia usando **GitLab** para control de versiones, desarrollo de automatización, y ejecución/monitoreo de pipelines de test automatizados.
- **Deseado (no obligatorio):** experiencia en pagos (+payments exp) — aquí tienes ventaja real con Victory World Church y el proyecto de JPMorgan.
- Otros detalles mencionados: testing de apps web, desktop y basadas en base de datos; ejecución de scripts tanto on-premise como en la nube; performance testing con JMeter o Gatling; seguimiento de builds y despliegues.
- **Tipo de contratación:** contrato inicial de 4 meses, con posibilidad de extensión o de conversión a contratación directa (Contract-to-Hire). Esto significa que además de evaluarte para el trabajo inmediato, probablemente estén viendo si encajas a largo plazo — vale la pena mostrar interés en crecer con el equipo, no solo en completar el contrato.

## 0.2 Los dos gaps reales — cómo abordarlos con honestidad (no los escondas, contéstalos con seguridad)

**AWS** — tu experiencia de nube real es Azure, no AWS.
> "My recent cloud experience has been Azure-focused, but I've worked extensively with cloud-hosted applications, CI/CD pipelines, containers, and distributed environments. The underlying testing principles remain the same, and I've historically been able to ramp up quickly on new technologies."

**Si te piden dibujar un pipeline genérico en la pizarra** (variante recomendada por la reclutadora, útil si quieres desviar la pregunta hacia algo que sí controlas): dibuja `Build -> Unit Tests -> Deploy to Staging -> Trigger Automation Suite (Smoke/Regression) -> Report`, y di algo como: *"The principles of CI/CD and cloud architecture are the same regardless of provider. I know how to work with Docker containers, trigger automated suites on a commit, and validate deployments. I'd adapt to AWS and GitLab within days because I already understand the underlying logic."* (ver también la sección 2.6 con la analogía completa de la fábrica de autos para explicar esto).

**GitLab** — tu experiencia real de CI/CD es Jenkins y GitHub Actions, no GitLab específicamente.
> "My CI/CD experience has been primarily with Jenkins and GitHub Actions, but the concepts transfer directly — setting up pipeline stages, triggering automated test runs, and monitoring pipeline results. GitLab's interface and syntax are different, but I've historically picked up new CI/CD tooling quickly."

Nota lo que tienen en común ambas respuestas: reconocer el gap sin disculparte de más, y anclarlo en algo real que sí sabes hacer (los conceptos transfieren) más tu historial de aprender rápido. Esa es la fórmula que ya usamos para Kubernetes/Appium/Cucumber en HD Supply — se repite aquí.

**Lo que NO es un gap, aunque el JD lo mencione:** Python. El JD dice "Java primary then Python only will work" — tú tienes Python real (Aegis, Snorkel AI), así que si sale el tema, es un punto a favor, no algo que defender.

## 0.5 Contexto del negocio (úsalo para mostrar que entiendes las apuestas, no solo la técnica)

Fiserv procesa miles de millones de transacciones al año — gateways de pago, plataformas bancarias core (como Clover), y banca online para miles de instituciones financieras. Como Automated Tester aquí, no solo pruebas funcionalidad: eres responsable de la precisión de datos financieros y la continuidad de sistemas de transacción. Un solo defecto puede significar pérdidas millonarias, fallas de cumplimiento regulatorio, o pérdida de confianza del cliente.

**Cómo usarlo:** si te preguntan "¿por qué te interesa este rol?" o "¿qué entiendes del impacto de QA aquí?", puedes conectar tu experiencia real en Victory World Church (validación de transacciones financieras, defectos de seguridad), dentsu (incidentes producción-críticos, RCA), y el proyecto de RAG con JPMorgan (precisión de datos financieros) directamente con esta realidad de Fiserv.

## 0.6 Quién te entrevista: Avinash Pandey

Su título es **Senior Director IT, AI Builder, Expert Engineer (EE) at Fiserv**. Esto importa:

- **No es un director puramente administrativo.** "AI Builder" y "Expert Engineer" en el título dicen que sigue siendo técnico y hands-on, no solo gestiona gente.
- **Antigüedad real en la empresa:** Senior Director (oct 2024–presente), antes Director (mar 2021–oct 2024), Manager e IT Manager (2019–2021). Antes de eso, 9 años en First Data Corporation (que se fusionó con Fiserv) como Application Lead. Casi 16 años seguidos en la misma organización.
- **Su especialidad, en sus propias palabras:** testing de apps móviles y web, frameworks de test automation, APIs, implementación de POS y MPOS con pagos digitales (Manual, Magstripe, EMV, Apple Pay, Android Pay, Samsung Pay, gift cards, checks). También arquitectura, business continuity, integración, QA y operaciones, liderando en waterfall, scrum y kanban.
- **Ya ha publicado y reclutado antes para posiciones de SDET/QA Engineer en Fiserv** — conoce bien lo que busca en este tipo de rol, no es su primera vez armando este equipo.
- **Señal importante:** reposteó un post sobre "modernizar plataformas de pago a gran escala" usando "AI-enabled development para moverse más rápido" — sigue de cerca cómo la IA entra al desarrollo y testing. Tu experiencia en Aegis, el proyecto de RAG con JPMorgan, y tu rol como AI Evaluation Contractor en Snorkel AI están directamente alineados con algo que le interesa.

**Qué es probable que le importe menos:** conteo de casos de prueba ejecutados, discusiones de testing manual puro.
**Qué es probable que le importe más:** cómo construyes automatización, cómo troubleshooteas fallos, cómo integras tests en pipelines, decisiones de diseño de framework, escalabilidad, root-cause analysis, mentalidad de ingeniería.

## 0.6.5 Formato CONFIRMADO del onsite — léelo justo antes de entrar

Confirmado directamente: la reunión con Avinash es **una conversación técnica de arquitectura y estrategia en la pizarra**, no una prueba de código en computadora.

**Lo que SÍ va a pasar:**
- Te presentan un problema de negocio (ej. automatizar la validación de un formulario de pagos y su persistencia) y tú dibujas los bloques del framework en la pizarra.
- Explicas en voz alta el flujo técnico: autenticación por API para el token → Page Objects de Playwright en la UI → verificación directa en SQL con JDBC.
- Discuten escenarios reales de producción: RCA, fallos en pipelines de GitLab, edge cases.

**Lo que NO va a pasar:**
- Nadie te descuenta puntos por un punto y coma, un paréntesis, o no recordar el nombre exacto de una función de Playwright.
- No vas a escribir código funcional desde cero en una computadora. Si escribes algo en la pizarra, lo que importa es el propósito de la lógica (mostrar el uso de `trim()`, la inyección del token, la aserción), no la sintaxis perfecta.

**Tu objetivo real en la pizarra:**
1. Dibujar los bloques de la arquitectura (Tests → Playwright POM/API → Database DAO) — tienes el diagrama ya hecho, repásalo.
2. Explicar el "por qué" de tus decisiones — por ejemplo, elegir Playwright por su auto-waiting nativo, y el bypass de login por API para que el pipeline de CI/CD sea rápido y no flaky.
3. **Cerrar involucrando a Avinash, no como un monólogo:** *"This is how I would design the automation harness for reliability and data integrity. How do you typically handle this pattern in your current pipelines?"* — esto convierte tu respuesta en una conversación de colega a colega, que es justo el tono "supportive" que ya sabemos que tiene el panel.

Ve con la tranquilidad de que es una reunión de trabajo sobre diseño de sistemas, no un examen.

## 0.7 Cómo evalúa realmente el panel técnico (whiteboard/onsite)

**Formato:**
- No te piden código perfecto de memoria — te piden dibujar la arquitectura (bloques y capas) en la pizarra y explicar la lógica paso a paso en voz alta.
- El panel suele incluir ingenieros líderes, arquitectos o directores técnicos (como Avinash).
- Te presentan un escenario práctico real — por ejemplo, validar un formulario de registro y su persistencia — para ver cómo conectas la interfaz, la API y la base de datos. Esto es literalmente la estructura del proyecto de práctica que empezamos a construir juntas.

**Los 3 pilares técnicos que buscan:**
1. **Arquitectura modular:** separación de responsabilidades — Page Object Model para la interfaz (ahora pensando en Playwright, no solo Selenium), un cliente de API para autenticación rápida (bypass de login usando un token en vez de hacer login por UI cada vez), y patrón DAO con JDBC para la base de datos. Ya empezaste a construir esto en tu proyecto de práctica (`UsuarioFormPage` + `DbHelper`) — la pieza que estamos armando ahora es el cliente de API con bypass de login por token.
2. **Estrategia de cobertura de testing:** camino feliz (happy path), edge cases (`trim` de espacios en blanco, protección contra SQL injection), y una suite de regresión automatizada en CI/CD (ahora piensa GitLab, aunque tu experiencia real es Jenkins/GitHub Actions).
3. **Troubleshooting y trazabilidad:** mentalidad metódica de RCA revisando logs y métricas ante fallos en producción. Tu experiencia en dentsu es tu ejemplo más fuerte para esto.

**Lo que realmente decide la contratación:**
- **Visión de calidad e integridad de datos:** no basta con hacer clicks en pantalla — hay que verificar que los datos realmente persistieron en el backend.
- **Comunicación colaborativa:** explicar tu razonamiento en voz alta, estar abierta a sugerencias, y cerrar con una pregunta tipo "¿ustedes cómo lo manejan en su equipo?" — es señal de seniority, no de inseguridad.
- **Criterio sobre sintaxis:** no necesitas recordar de memoria la sintaxis exacta de cada método, siempre que la lógica técnica sea sólida.

## 0.8 Los 5 puntos que debes repetir a lo largo de toda la entrevista

Si conectas tus respuestas consistentemente a esto, suenas como una ingeniera de automatización que es dueña de la calidad end-to-end, no como una tester tradicional — que es justo lo que este rol busca:

1. Automatización con Playwright
2. Desarrollo de frameworks en Java
3. Validación de APIs y de backend
4. Root cause analysis
5. Ingeniería de calidad integrada en CI/CD

## 1. "Tell me about yourself" — respuesta lista

> "I'm an SDET and Test Automation Engineer with over ten years of experience across software engineering, QA automation, backend validation, API testing, SQL development, and production support.
>
> Most recently I've been focused heavily on automation using Java, Selenium, and Playwright. I've built maintainable automation frameworks, automated API validations, supported release testing, performed backend database validation, and partnered closely with development teams to troubleshoot issues through root-cause analysis.
>
> I've also been working in AI evaluation environments — as an AI Evaluation Contractor and on my own project evaluating a RAG pipeline against JPMorgan Chase's 10-Q filing — where I use Playwright, TypeScript, SQL, and Docker-based solutions to validate application behavior and data integrity.
>
> What interests me about this opportunity is the combination of automation engineering, cloud testing, CI/CD integration, and quality ownership throughout the SDLC."

## 2. Preguntas técnicas con respuesta lista (en inglés — practícalas en voz alta)

**Why Playwright?**
> "One of the reasons I enjoy Playwright is that it's more modern and reliable than many legacy UI automation approaches. I've found it especially useful for handling dynamic web applications, parallel execution, built-in waits, and cross-browser testing. In recent work I've used Playwright to validate workflows, application behavior, and data integrity while improving test execution speed and stability."

**Puntos técnicos adicionales sobre Playwright, útiles para profundizar si te preguntan "por qué Playwright y no Selenium":**
- **Auto-waiting nativo:** espera automáticamente a que los elementos sean visibles, estables y clickeables antes de interactuar — reduce test flakiness sin código extra de espera manual.
- **Intercepción y mocking de red (`page.route()`):** permite interceptar llamadas HTTP para simular respuestas de APIs, probar errores de red (500, timeout), o inyectar datos de prueba sin depender de un backend real completo.
- **Browser Contexts:** crea ambientes de navegador aislados e independientes en milisegundos sin abrir una instancia nueva del navegador — útil para pruebas paralelas rápidas.
- **Trace Viewer:** graba capturas de pantalla, DOM, red y consola paso a paso durante una ejecución, lo cual facilita mucho el root cause analysis cuando un test falla — puedes mencionarlo como tu herramienta de diagnóstico visual en vez de solo revisar logs de texto.

**Ejemplo de bypass de login vía token con Playwright en Java** (referencia — entiende la lógica para poder explicarla, más que memorizar el código exacto; nota que usé un dominio genérico de ejemplo, no uno real de Fiserv):
```java
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.RequestOptions;

public class PlaywrightAuthBypass {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
            APIRequestContext apiContext = playwright.request().newContext();

            // 1. Obtener token vía API enviando un payload JSON (comillas internas escapadas)
            String jsonPayload = "{\"username\": \"usuario@ejemplo.com\", \"password\": \"ClaveSegura123!\"}";
            APIResponse response = apiContext.post("https://api.ejemplo.com/v1/auth/login",
                RequestOptions.create().setHeader("Content-Type", "application/json").setData(jsonPayload));

            String token = extractToken(response.text()); // función propia para extraer el token del JSON

            // 2. Crear un BrowserContext e inyectar el token, sin pasar por la UI de login
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://app.ejemplo.com");
            page.evaluate("token => window.localStorage.setItem('authToken', token)", token);

            // 3. Navegar directo a la pantalla protegida
            page.navigate("https://app.ejemplo.com/dashboard");
        }
    }
}
```

**Arquitectura de 4 capas — buena para dibujar en la pizarra:**

| Capa | Tecnología / Patrón | Responsabilidad |
|---|---|---|
| 1. Tests/Specs | TestNG/JUnit + Playwright Test | Orquesta el flujo, aserciones (`assertThat`), tags de regresión |
| 2. Page Object Model | Playwright Locators | Encapsula locators y acciones del formulario, maneja edge cases (trim/espacios) |
| 3. API & Auth Harness | `APIRequestContext` de Playwright | Obtención de tokens, setup de datos de prueba, mocks de red |
| 4. Database DAO | Java JDBC (`PreparedStatement`) | Consulta directa a la BD para reconciliar datos UI vs. backend |

**Have you built an automation framework?**
> "Yes. At Test Pro I built a modular automation framework using Java, Selenium WebDriver, TestNG, and Page Object Model architecture. The goal was maintainability, reusability, and scalability. The framework separated test logic from page interactions, supported regression testing, simplified maintenance, and enabled faster onboarding for future test development. When designing frameworks I focus heavily on reusable components, reporting, maintainability, and CI/CD integration."

**How do you approach API testing?**
> "I approach API testing as a critical part of the overall quality strategy. I validate status codes, response payloads, schemas, business rules, data contracts, and edge cases. I also compare API responses against backend database records when appropriate to verify end-to-end accuracy. My experience includes Postman, JSON validation, backend SQL verification, and integration testing."

**Describe a root cause analysis example.**
> "While at dentsu, I regularly supported production-critical incidents. Rather than stopping at identifying symptoms, I traced issues through logs, application behavior, backend dependencies, and data flows to identify the true source of failures. Once the root cause was identified, I worked with development teams to validate fixes and ensure similar defects could be prevented in future releases. That mindset has carried into my automation work because understanding why something failed is often more valuable than simply reporting a defect."

**How would you integrate automation into CI/CD?**
> "Automation should be part of the deployment pipeline, not something performed afterward. My approach is to integrate smoke tests, API validation, and regression automation into the build process so quality checks occur automatically. When tests fail, the pipeline provides immediate feedback, preventing defective code from progressing through environments. I've worked with Jenkins and GitHub Actions and understand how automation fits into continuous delivery practices — the same principles apply to GitLab pipelines."

**What happens when an automated test suddenly starts failing?**
> "I first determine whether the failure is a test issue, an environment issue, a data issue, or an actual application defect. I review logs, execution results, recent code changes, environment changes, test data dependencies, and application behavior. If the issue is in the automation itself, I update the framework. If it's a product defect, I provide reproducible evidence to engineering. The goal is quickly identifying the true cause and preventing repeated failures."

**Tell me about database validation.**
> "Database validation has been a significant part of my career. I've written SQL queries, stored procedures, reconciliation scripts, and validation logic to ensure backend systems accurately reflected application behavior. I've used database verification extensively during migrations, API testing, release validation, and production issue investigations."

**How would you test a payment application?** (muy probable, es Fiserv)
> "I would validate both functional behavior and transaction integrity. That includes API validation, UI validation, authentication and authorization, transaction processing, exception handling, database validation, audit tracking, performance testing, and end-to-end transaction flows. For payment systems, accuracy and reliability are critical, so I would place significant emphasis on data verification and regression coverage around transaction processing."

Si quieres dar más detalle (nivel senior), puedes desglosarlo en 4 categorías concretas:
1. **Integridad de transacción end-to-end:** el monto que se envía en la UI debe coincidir exactamente con el payload de la API y con lo que queda registrado en la tabla de auditoría en SQL.
2. **Manejo de excepciones y timeouts:** simular caídas de la pasarela de pago (interceptando la red) para asegurar que el sistema no duplique cobros — esto se llama *idempotencia*.
3. **Edge cases:** límites numéricos, caracteres especiales, campos vacíos, trimming de espacios.
4. **Seguridad:** uso de `PreparedStatement` en JDBC para prevenir SQL injection, y verificar que datos sensibles de tarjeta no viajen sin cifrar.

**If asked about AI testing** (posible bonus — mencionaron agregar capacidades de agentes a un entorno React existente, así que esto podría salir):
> "I've recently worked on AI evaluation programs where the goal wasn't simply verifying functionality but evaluating reasoning quality, consistency, reliability, and edge-case behavior. That involved designing validation scenarios, testing multi-step workflows, evaluating outputs, identifying failure patterns, and measuring reliability across different prompts and conditions. I see many similarities between AI testing and traditional software quality engineering because both require strong validation strategies and an analytical mindset."

### 2.5 Proyecto personal: Bill Bloom — tu mejor carta para el interés de Avinash en IA

Publicaste esto en LinkedIn, así que es totalmente posible que Avinash lo haya visto o que salga si revisan tu perfil. **No es algo que temer — es tu ejemplo más fuerte y más específico de "cómo pruebas una app donde la IA decide qué pasa"**, que es exactamente el tipo de problema que le interesa a alguien enfocado en AI-enabled development (sección 0.6).

**Qué es:** Bill Bloom, una app de gastos compartidos en grupo con 4 funciones impulsadas por Gemini (parseo de gastos en lenguaje natural, entrada por voz, escaneo de recibos, y análisis personal de gastos). Stack: React, Node.js, MongoDB, Gemini, Selenium, Playwright, JUnit 5, TypeScript, y Claude Code.

**Lo que la hace una historia fuerte:** probaste la MISMA aplicación con 4 enfoques distintos — test planning + code inspection, Selenium+Java+JUnit5, Playwright+TypeScript, y Claude Code como agente autónomo de QA que exploró el código por su cuenta y generó su propia suite de pruebas. Eso es comparar metodologías de testing de forma deliberada, no solo "usé una herramienta".

**Respuesta lista si te preguntan sobre esto o piden un "project deep dive":**
> "One project I'm proud of is Bill Bloom, a group expense-sharing app I built with several Gemini-powered AI features — natural language expense parsing, voice entry, receipt scanning, and expense analytics. The interesting testing challenge was that the AI decides what happens next, so I couldn't just assert on exact, predictable outputs.
>
> I actually tested the same application using four different approaches — test planning and code inspection, Selenium with Java and JUnit 5, Playwright with TypeScript, and Claude Code as an autonomous QA agent that explored the codebase and generated its own test suite. That gave me a real comparison of tradeoffs between traditional UI automation, a more modern framework, and an AI-driven exploratory approach.
>
> The biggest lesson was learning to validate invariants instead of exact text — since the AI's wording could vary, what mattered was verifying the business rules held: positive amounts, valid categories, participants who were actual group members. I also made the tests hermetic by provisioning and tearing down disposable test data through the API instead of relying on a hardcoded seeded database. And when I found an edge case — the AI defaulting to assigning an expense to every group member when it couldn't recognize who was mentioned — instead of tweaking the test to avoid it, I documented that behavior explicitly. With AI-driven features, unexpected behavior is something you want visibility into, not something to hide."

**Si Avinash profundiza más, puntos de respaldo:**
- *"Why not just use one framework?"* → "I wanted a real comparison — Selenium gave me fine-grained control over wait strategies, Playwright gave built-in auto-retries and faster test authoring, and the Claude Code agent approach was useful for exploratory coverage I hadn't scripted myself."
- *"How do you validate AI output if it's not deterministic?"* → "You shift from exact-match assertions to invariant-based assertions — checking the properties that must always hold true, regardless of exact wording."
- *"How do you handle test data?"* → "Hermetic tests: each suite provisions its own disposable users/groups via API before running, and tears them down after — so tests never depend on the state of a shared seeded database."

Actualiza también tu respuesta de la sección 6 sobre "project deep dive": ahora tienes **tres** proyectos de IA para elegir (Aegis, JPMorgan RAG, y Bill Bloom) — Bill Bloom es probablemente el más fuerte para *este* entrevistador porque es específicamente sobre metodología de testing con IA, no solo sobre construir con IA.

### 2.6 Cómo explicar un pipeline de CI/CD — la analogía de la fábrica de autos

Esta analogía te la mandó la reclutadora y es muy buena para explicar en la pizarra sin perder a la audiencia.

Un pipeline de CI/CD es una serie de pasos automatizados que el código atraviesa desde que el desarrollador lo escribe hasta que llega a los usuarios finales — como una fábrica de ensamblaje de autos: nadie saca un auto a la calle sin antes probar que los frenos funcionen o que las puertas cierren bien.

**El flujo, paso a paso:**
1. **Commit/Push:** el desarrollador sube el código al repositorio (GitLab/GitHub) — esto dispara el pipeline automáticamente.
2. **Build:** el pipeline junta las piezas de código, descarga librerías, y verifica que todo compile sin errores de sintaxis.
3. **Unit Tests:** corren pruebas rápidas de los propios desarrolladores para validar lógica básica.
4. **Deploy to QA/Staging:** el pipeline instala el código automáticamente en un ambiente de pruebas cerrado.
5. **Automation Suite (aquí entras tú):** el pipeline dispara tus scripts de Playwright o tus pruebas de API automáticamente — corren solas, sin que nadie te avise por chat.
6. **El veredicto:** si tus tests pasan (verde), el código avanza hacia producción. Si fallan (rojo), el pipeline se congela, bloquea el despliegue, y alerta al equipo — así el código defectuoso nunca llega a los usuarios reales.

**Por qué le importa esto a Avinash:** antes, un tester manual esperaba a que el desarrollador le avisara "ya subí el código, pruébalo" — horas de retraso. Con un pipeline, tus pruebas corren en el segundo exacto en que el código se actualiza. Eso es velocidad + seguridad, que es justo lo que Fiserv busca en un rol de automatización, no de testing manual.

**Frase clave si te preguntan por la parte de infraestructura que no dominas (AWS/GitLab):**
> "I don't configure the cloud infrastructure from scratch, but I understand exactly how to connect my Playwright scripts so the pipeline triggers them at the testing stage and halts the deployment if something fails."

## 3. Ejercicios de práctica para pizarra

Practica estos en voz alta, explicando tu razonamiento paso a paso mientras dibujas/escribes. No necesitas sintaxis perfecta — necesitas mostrar estructura mental clara.

**Ejercicio A — Diseña un framework de automatización**
*Pregunta probable: "¿Cómo estructurarías un framework de automatización desde cero para una nueva aplicación web?"*
1. Capa de configuración (URLs, credenciales, ambientes: dev/qa/prod)
2. Page Object Model — una clase por página, locators separados de la lógica de test
3. Capa de utilidades (waits, screenshots, logging)
4. Capa de datos de prueba (JSON/CSV externos, no hardcodeados)
5. Capa de tests (TestNG/JUnit — agrupados por funcionalidad)
6. Reportes (Allure) e integración CI/CD
Tú ya hiciste esto en TEST PRO — apóyate en ese ejemplo real.

**Ejercicio B — Valida integridad de datos entre API y base de datos**
*Pregunta probable: "Un usuario crea un registro vía API. ¿Cómo validarías que los datos llegaron correctamente a la base de datos?"*
1. Llamar el endpoint POST con Postman/REST client, capturar el ID de respuesta
2. Consultar directamente la base de datos (SQL) usando ese ID
3. Comparar campo por campo: request enviado vs. registro en BD
4. Validar tipos de datos, formatos (fechas, nulls), y reglas de negocio (defaults, constraints)
5. Casos límite: caracteres especiales, campos opcionales vacíos, duplicados
Esto es literalmente lo que hiciste en TEST PRO y Victory World Church, y lo que estamos practicando en el proyecto Java juntas.

**Ejercicio C — Diseña casos de prueba para una funcionalidad nueva**
*Pregunta probable: "Te dan una historia de usuario para 'transferir fondos entre cuentas'. ¿Qué probarías?"*
- Happy path: transferencia exitosa con montos válidos
- Validaciones de negocio: saldo insuficiente, monto negativo o cero, cuenta destino inválida
- Concurrencia: dos transferencias simultáneas de la misma cuenta
- Seguridad: autorización (¿puede un usuario transferir desde una cuenta que no es suya?)
- Integración: verificar que el saldo se actualiza correctamente en ambas cuentas tras la transacción

## 4. Java / OOP — preguntas clásicas con respuesta lista

**"Explica los 4 pilares de OOP y cómo los aplicas en tus frameworks de automatización"**

- **Encapsulamiento**: en Page Object Model, los locators (`WebElement`) son privados dentro de cada clase de página; solo expones métodos públicos (`login()`, `submitForm()`).
- **Abstracción**: el test solo llama `loginPage.login(usuario, clave)` sin saber cómo se implementa el click o el `sendKeys()` por dentro.
- **Herencia**: una clase base `BaseTest` o `BasePage` con configuración común (setup del driver, waits) que todas las páginas/tests extienden.
- **Polimorfismo**: un método `initDriver()` que se comporta distinto según el navegador pero se llama igual desde cualquier test.

**"Escribe un programa en Java para invertir un string sin usar funciones built-in de reverse"**

```java
public class ReverseString {
    public static String reverse(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverse("Fiserv")); // vresiF
    }
}
```
Explica en voz alta la lógica mientras la escribes: "convierto el string a un arreglo de caracteres, uso dos punteros (izquierda y derecha) que se acercan hacia el centro intercambiando valores, hasta que se cruzan."

## 5. Repaso rápido de sintaxis

Java/Selenium — no memorices, repasa para reconocer y explicar:
```java
WebElement boton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
boton.click();

Assert.assertEquals(actual, esperado, "mensaje de error");

try {
    driver.findElement(By.xpath("//button[contains(text(),'Enviar')]")).click();
} catch (NoSuchElementException e) {
    // manejo del error
}
```

Playwright en Java (verificado en playwright.dev/java) — ya que es el skill #1 de la lista, este es el que más te conviene repasar. La sintaxis real, no una aproximación:

```java
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

// Arrancar el navegador y abrir una página
try (Playwright playwright = Playwright.create()) {
    Browser browser = playwright.chromium().launch();
    Page page = browser.newPage();
    page.navigate("http://127.0.0.1:5000/");

    // Localizar por rol (equivalente moderno a By.id/By.xpath de Selenium)
    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Crear")).click();

    // Localizar por label — muy común en formularios
    page.getByLabel("Nombre").fill("Heilyn Fuselier");
    page.getByLabel("Email").fill("heilyn@example.com");

    // Assertion con auto-wait integrado — no necesitas WebDriverWait manual
    assertThat(page.getByText("creado")).isVisible();
}
```

Diferencia clave si te preguntan Selenium vs. Playwright: en Playwright, `Locator` espera automáticamente a que el elemento exista y sea interactuable antes de actuar (auto-wait integrado), mientras que en Selenium tú manejas los waits explícitamente con `WebDriverWait`/`ExpectedConditions`. El patrón de Page Object Model (una clase por página, locators encapsulados) se mantiene igual en ambos — lo que cambia es la sintaxis de localización y espera por dentro de cada método.

Python — repaso mínimo por si preguntan:
```python
def validar_respuesta(response, esperado):
    assert response.status_code == 200
    return response.json() == esperado
```

## 6. Más preguntas conversacionales probables (referencia rápida)

- "¿Cómo decides qué automatizar vs. dejar manual?" → prioridad por riesgo/frecuencia de regresión.
- "¿Cómo manejas un ambiente on-premise vs. cloud?" → tu experiencia con Azure (Victory World Church, Microsoft/N3), reconociendo el gap de AWS como en sección 0.2.
- "Explícame la arquitectura de un proyecto tuyo" (project deep dive) → Aegis (tres LLM providers, Playwright como Ground Truth Engine) y el proyecto de JPMorgan (XBRL como ground truth, consenso de tres modelos, 6/6 correctas) — dado que Avinash es "AI Builder", este último pesa mucho.
- "¿Cómo es el rol de QA dentro de tu equipo Agile/Scrum?" → manejo de defectos en Jira durante sprints en TEST PRO.
- "Explica el ciclo de vida de un defecto (bug life cycle)" → Nuevo → Asignado → En progreso → Resuelto → Verificado → Cerrado (Reabierto si falla la verificación).
- "¿Qué es SDLC y dónde entra QA?" → Requerimientos → Diseño → Desarrollo → Testing → Deployment → Mantenimiento; QA idealmente participa desde Requerimientos (shift-left).

## 7. Preguntas de comportamiento

- Autonomía y trabajo en equipo → ejemplo de cuándo resolviste algo sola vs. cuándo colaboraste con desarrollo.
- Adaptabilidad al cambio → cambio de prioridades a mitad de sprint, o adaptarte a una herramienta nueva rápido (útil para reforzar tu respuesta sobre AWS/GitLab).
- Manejo de tiempo y multitarea con atención al detalle → cómo priorizas cuando tienes varios defectos/casos de prueba pendientes a la vez.
- Automotivación y pasión por testing → por qué elegiste esta carrera.
- Colaboración entre equipos → ejemplo real de coordinar con desarrollo y negocio (dentsu o TEST PRO).

## 7.5 Framework para estructurar tus respuestas — STAR

Esto surgió de una recomendación de Jeff: tener un método fijo para organizar cualquier respuesta de comportamiento, en vez de responder en desorden. El estándar de la industria es **STAR**:

- **S — Situación:** el contexto breve — ¿dónde, cuándo, con quién? (1-2 frases, no te alargues aquí)
- **T — Tarea:** ¿cuál era tu responsabilidad específica en esa situación?
- **A — Acción:** qué hiciste **tú** concretamente — habla en primera persona ("I traced...", "I identified...", "I proposed..."), no "the team did". Esta es la parte que más pesa y a la que debes darle más tiempo/detalle.
- **R — Resultado:** qué pasó al final — idealmente con un número, una métrica, o un impacto de negocio claro.

**Ejemplo aplicando STAR a tu historia de RCA en dentsu (ya tienes el contenido en la sección 2, solo se reorganiza):**
> **S:** "At dentsu, we experienced a production-critical incident affecting a client-facing system."
> **T:** "My responsibility was to identify the root cause quickly to minimize business impact, rather than just reporting the symptom."
> **A:** "I traced the issue through logs, application behavior, backend dependencies, and data flows to isolate the true source of the failure, instead of stopping at the first visible symptom."
> **R:** "We identified the actual root cause, worked with the dev team to validate the fix, and put safeguards in place to prevent similar defects in future releases."

**Tarea para ti antes del onsite:** toma 2-3 de tus historias de la sección 7 (por ejemplo, la de "adaptabilidad al cambio" y la de "colaboración entre equipos") y reescríbelas en este formato de 4 líneas. No hace falta memorizarlas palabra por palabra — con tener la estructura clara en la cabeza (S-T-A-R) es suficiente para que la respuesta salga ordenada aunque te pregunten con otras palabras.

**Nota:** para preguntas técnicas/de pizarra (no de comportamiento), el "framework" que ya tienes es distinto y está en la sección 9 — repetir la pregunta con tus palabras, pensar en voz alta, y cerrar conectando con el negocio o haciéndole una pregunta a Avinash. STAR es específicamente para las preguntas de "cuéntame de una vez que...".

### 7.5.1 Preguntas probables para practicar con STAR

Elige 3-4 de estas (no las 12) y escribe tu respuesta en las 4 líneas S-T-A-R. Ya tienes historias reales para casi todas — dentsu, TEST PRO, Victory World Church, HD Supply.

1. "Tell me about a time you had to solve a technical problem on your own, without much guidance." *(Autonomía — dentsu o TEST PRO)*
2. "Describe a situation where you had to work closely with a development team to resolve an issue." *(Colaboración)*
3. "Tell me about a time priorities changed suddenly in the middle of a sprint or project. How did you handle it?" *(Adaptabilidad)*
4. "Give an example of when you had to quickly learn a new tool or technology you weren't familiar with." *(Adaptabilidad — conecta con tu respuesta de gaps de AWS/GitLab en la sección 0.2)*
5. "Describe a time you were juggling multiple test cases or defects at once. How did you prioritize?" *(Manejo de tiempo)*
6. "Tell me about a time you found a critical bug close to a release deadline. What did you do?" *(Atención al detalle bajo presión)*
7. "Walk me through a time you had to explain a technical issue to a non-technical stakeholder." *(Comunicación)*
8. "Tell me about a time you disagreed with a developer about whether something was actually a bug. How did you resolve it?" *(Manejo de conflicto)*
9. "Describe your role during a production incident. How did you approach root cause analysis?" *(RCA — dentsu, ya la tienes resuelta en la sección 2 y el ejemplo de arriba)*
10. "Tell me about a time you improved a testing process or framework. What was the impact?" *(Ownership — TEST PRO, framework modular)*
11. "Why did you choose a career in QA and test automation? What keeps you motivated?" *(Automotivación — no necesita STAR estricto, pero sí estructura clara)*
12. "Describe a time you had to give critical feedback about code quality or a design decision." *(Comunicación asertiva)*

### 7.5.2 Dos respuestas STAR que ya escribiste tú misma — listas para usar

Estas dos ya las tenías redactadas en tu propio resumen de práctica. Están bien construidas — solo las dejo aquí organizadas en el formato S-T-A-R para que las repases en voz alta.

**Pregunta 8 de la lista de arriba — "Tell me about a time you disagreed with a developer about whether something was actually a bug":**
> **S:** "I found a backend bug where an API returned an incorrect status. The developer rejected it — he said it worked fine on his local machine."
> **T:** "My task was to provide clear technical proof without creating tension with the team."
> **A:** "I didn't argue. I captured the exact JSON payload from Postman and recorded a Playwright trace showing the exact log line where the backend code crashed."
> **R:** "The developer saw the data and understood the issue immediately. He fixed the bug within an hour, and we released on time."

Punto extra si te preguntan por qué funcionó: no fue "tener la razón", fue mostrar evidencia objetiva (payload + trace + log) en vez de discutir en base a opiniones.

**Nueva — "Describe a time you validated a large data migration" (útil para la pregunta 10, "improved a testing process", o si preguntan directamente por experiencia en datos/Azure):**
> **S:** "At Victory World Church, we migrated over ten thousand records to a cloud environment in Azure."
> **T:** "My task was to design the validation strategy to catch missing data or empty fields before the migration was considered complete."
> **A:** "I analyzed the schema mapping matrix and wrote T-SQL scripts using `IS NULL` and `TRIM` to find hidden blank spaces and data truncation that a simple row-count check would have missed."
> **R:** "I identified over 200 mismatched fields. We corrected the mapping rules and achieved 100% data accuracy before the release."

Esta historia es doblemente útil: sirve como STAR de comportamiento, y también refuerza tu experiencia real en Azure/cloud/datos si Avinash pregunta por el gap de AWS (sección 0.2).

## 8. Preguntas que tú le puedes hacer a Avinash

1. "What are the biggest quality challenges the team is trying to solve today?"
2. "How mature is the Playwright framework today?"
3. "What percentage of testing is currently automated versus manual?"
4. "What role does the QA organization play in the CI/CD process?"
5. "How is AWS being used within the application environment?"
6. "What agent-based capabilities are being introduced into the React framework?" (mencionaron esto — muestra que investigaste)
7. "What would success look like in the first 90 days for this role?"
8. Una sobre IA en general: "I noticed the team has been exploring AI-enabled development — how is AI being incorporated into the QA or testing process here at Fiserv?"
9. "Given your focus on next-generation payment platforms and AI-enabled development, how is the team integrating Playwright and AI capabilities into your automated release pipelines?"
10. "What is currently the biggest architectural or data reconciliation challenge your quality suite faces as system throughput grows?"
11. "How mature is the integration between the Playwright automation suite and the current GitLab CI/CD pipelines?" *(por qué funciona: encaja con el perfil técnico de Avinash y muestra que piensas en la salud del pipeline de deployment, no solo en escribir tests sueltos.)*
12. "For this 4-month contract, what does successful delivery look like for you in the first 30 days?" *(por qué funciona: muestra mentalidad de ejecución rápida — quieres entregar resultados limpios desde el inicio, algo muy relevante siendo contract-to-hire.)*

**Nota sobre cuál elegir:** no hagas las 12 — elige 3, máximo 4. La pregunta 12 (30 días) y la pregunta 7 (90 días) buscan lo mismo — elige una, no las dos. Buena combinación para el cierre: una técnica específica (11), una de negocio/impacto (1 o 10), y la de expectativas del contrato (12) — esa última además conecta directo con la pregunta que ya tenías anotada en la sección 0.1 sobre el contrato de 4 meses.
11. Sobre el contrato-a-contratación directa (opcional, útil si quieres mostrar interés en el largo plazo, no solo pregunta logística): "I understand this starts as a 4-month contract with potential for extension or conversion — what would make someone a strong candidate for conversion to a direct hire down the line?"

## 8.5 Los 5 errores más comunes que hacen fallar esta entrevista (evítalos)

1. **Escribir código de memoria sin explicar la arquitectura.** Si te quedas atascada tratando de recordar la sintaxis exacta de un método, para y explica la lógica del diseño en su lugar — ya sabemos que no te van a descontar por sintaxis (sección 0.6.5).
2. **Probar solo la capa de UI, sin mencionar el backend.** En una fintech como Fiserv, automatizar solo la pantalla no basta — siempre menciona la verificación de persistencia en la base de datos y la autenticación por API, aunque no te lo pregunten directamente.
3. **Quedarte callada mientras piensas o dibujas.** El silencio mientras resuelves algo hace que el entrevistador no pueda evaluar tu razonamiento. Narra en voz alta lo que estás pensando, aunque sea "estoy considerando si esto debería ir en la capa de API o en el Page Object..." — el proceso de pensar en voz alta ES lo que evalúan.
4. **No profundizar en RCA.** Si te preguntan qué haces cuando falla un test en el pipeline, no te quedes en "creo un ticket de bug" — explica cómo aíslas la causa: revisas logs, trazas de red, estabilidad del ambiente, antes de concluir si es un bug real o un problema de infraestructura.
5. **No adaptar el lenguaje al nivel de Avinash (Senior Director).** Hablar solo de ejecución manual de casos o conteo de bugs suena a nivel junior frente a un director. Reformula tus respuestas en términos de negocio cuando puedas: en vez de "automaticé 50 casos de prueba", di algo como *"automating this reduced manual regression time and gave the team faster feedback in the CI/CD pipeline, which translates directly into faster, safer releases"* — conecta la automatización con velocidad de entrega, reducción de falsos positivos, y retorno de inversión, no solo con la tarea técnica en sí.

## 9. Cómo presentarte — más allá de la técnica

Lo técnico te abre la puerta; esto es lo que decide si te quieren del otro lado.

- **Escucha activa:** antes de responder un ejercicio de pizarra, repite la pregunta con tus propias palabras ("entonces si entiendo bien, quieren que valide X y también Y, ¿correcto?"). Te da tiempo para pensar y muestra que escuchas antes de actuar.
- **Pregunta durante el ejercicio, no solo al final:** si el escenario es ambiguo, pregunta cosas como "¿esto correría en AWS o el ambiente todavía no está definido?" — es cómo piensa un ingeniero real, no alguien recitando una respuesta memorizada.
- **Cuando no sepas algo:** usa la fórmula de la sección 0.2 — reconócelo con calma, sin disculparte de más, y ancla en algo real que sí sabes. El estilo del panel es "supportive"; la honestidad se lee como seguridad.
- **Tono:** relajada, no apurada. Si necesitas 3 segundos para pensar, tómalos — un silencio breve se ve mejor que hablar sin rumbo.
- **Curiosidad genuina:** reacciona con interés real a lo que te cuenten, no solo esperes tu turno para preguntar al final.
- Repite los 5 puntos de la sección 0.8 con naturalidad a lo largo de la conversación, conectándolos a lo que te pregunten — no como discurso memorizado.

### 9.1 Cómo sonar segura sin sonar con ego inflado

Con todo el material fuerte que tienes ahora (Bill Bloom, JPMorgan, el proyecto técnico de 4 capas), hay un riesgo real de sonar como que estás recitando una lista de logros. Estas son formas concretas de mantenerte segura pero humilde:

- **Da crédito, no protagonismo exclusivo:** di "I worked with the dev team to..." o "I partnered with..." en vez de sonar como que resolviste todo sola. Sigue usando "yo" para tu acción específica (como pide STAR), pero reconoce a quién más estuvo involucrado.
- **Haz preguntas genuinas, no solo esperes tu turno para brillar:** cerrar un ejercicio con "How do you typically handle this in your current pipelines?" es curiosidad real, no una táctica.
- **Reconoce tus gaps con calma, no a la defensiva:** decir "mi experiencia real es con Azure, pero los conceptos transfieren" es honestidad — se lee como seguridad tranquila, no como debilidad. La gente con ego inflado inventa o minimiza lo que no sabe; tú haces lo contrario.
- **Evita el lenguaje absoluto:** en vez de "I'm the best at X" o "I always do Y", usa "in my experience, this approach has worked well" o "what I've found useful is...".
- **Escucha de verdad antes de responder:** deja que Avinash termine de hablar; un silencio breve antes de contestar se ve mejor que interrumpir para "demostrar" que ya sabes.
- **No conviertas cada respuesta en un resumen de tus tres proyectos de IA.** Si preguntan por un proyecto, cuenta ese uno bien — no trates de meter Bill Bloom, JPMorgan y Aegis en cada respuesta.

La fórmula en el fondo: seguridad tranquila + curiosidad genuina + crédito compartido. Es exactamente el tono "supportive" del panel, así que vas a encajar bien siendo tú misma.

**Logística:** duerme bien la noche antes en vez de repasar hasta tarde — a este nivel se nota más la claridad de pensamiento que la memorización de último momento. Llega temprano y repasa la guía una vez ligera esa mañana, no como estudio intensivo.

## 10. Antes de la entrevista

- Confirma con Megan si el bloque técnico es pizarra o computadora.
- Lleva copia impresa o digital de tu CV ajustado a Java/Playwright/API testing (no el de Playwright/TypeScript puro de HD Supply — este debe reflejar Java como primario).
- Ten listas 2-3 de las preguntas de la sección 8 para el final.
- Recuerda: el tono reportado es de apoyo, no de presión — si no sabes algo (AWS, GitLab, Appium, Cucumber a fondo, Kubernetes), reconócelo con seguridad usando las respuestas de la sección 0.2, en vez de bloquearte o inventar.

## 11. Sesión de práctica hands-on — proyecto Java real corriendo (4 sept 2026)

Esto documenta lo que ya hiciste con tus propias manos en `E:\Interview fiserv\Practice Project` — no es solo teoría, ya lo corriste y funcionó. Repásalo antes del onsite para hablar de esto con ejemplos concretos, no solo conceptos.

### 11.1 Cómo levantar el servidor de práctica (para repetirlo cuando quieras)

El archivo `AuthApiServer.java` no usa librerías externas (solo `com.sun.net.httpserver`, incluido en el JDK), así que no necesitas Maven ni IntelliJ para correrlo — compilas y ejecutas directo:

```powershell
cd "E:\Interview fiserv\Practice Project\src\main\java"
javac com\paymentqa\automation\AuthApiServer.java
java com.paymentqa.automation.AuthApiServer
```

Va a imprimir `Auth server corriendo en http://localhost:5001` y la terminal se queda "congelada" — es lo esperado, significa que el servidor está escuchando. Déjala así y abre una ventana nueva de PowerShell para mandar requests.

Nota: notaste que IntelliJ no mostraba la flechita verde de "Run" — es porque el `pom.xml` del proyecto está en una ubicación no estándar (`src\main\java\pom.xml` en vez de la raíz del proyecto), lo cual confunde a IntelliJ para reconocerlo como proyecto Maven. No bloqueó el ejercicio porque el archivo no depende de Maven para compilar.

### 11.2 Los comandos curl que ya probaste (y qué demostró cada uno)

**Login válido, body como texto plano:**
```powershell
curl.exe -X POST http://localhost:5001/login -d "admin@fiserv.com SecurePass123!"
```
→ `{"token":"abc123"}` — status 200 implícito.

**Mismo login, viendo status code y headers completos:**
```powershell
curl.exe -i -X POST http://localhost:5001/login -d "admin@fiserv.com SecurePass123!"
```
→ Mostró `HTTP/1.1 200 OK`, `Content-type: application/json; charset=UTF-8`, `Content-length: 18`, y el body.

**Login con payload JSON real (con header `Content-Type`):**
```powershell
curl.exe -i -X POST http://localhost:5001/login -H "Content-Type: application/json" -d "{\"email\": \"admin@fiserv.com\", \"password\": \"SecurePass123!\"}"
```
→ Mismo resultado exitoso, pero esta vez con un payload correctamente estructurado en JSON — así es como se ve un request real en un sistema de producción.

**Para probar el caso de error (pendiente de correr, pero ya sabes qué esperar):**
```powershell
curl.exe -i -X POST http://localhost:5001/login -d "admin@fiserv.com PasswordMala"
```
→ Debería devolver `{"error":"Invalid credentials"}` con status 401.

### 11.3 Aclaración clave sobre payloads (surgió practicando, no solo leyendo)

- **Payload = el body de datos, tanto de lo que envías (request payload) como de lo que recibes (response payload)** — no es solo "lo que yo mando".
- El primer curl que corriste **no mandó JSON de verdad** — mandó texto plano (`"admin@fiserv.com SecurePass123!"`). El servidor de práctica solo hace `requestBody.contains(...)`, sin parsear JSON, por eso funcionó igual. Si te preguntan "¿este endpoint espera JSON?", la respuesta honesta con este ejemplo sería: *"Este servidor de práctica valida el body como texto plano, pero en un API real de producción el estándar es que el payload venga en JSON con `Content-Type: application/json`, y el servidor lo parsea antes de validar campos."*
- Con `-i` puedes ver también los **headers** de la respuesta (`Content-Type`, `Content-Length`) — buen ejemplo concreto si preguntan "¿qué validas en una respuesta además del body?".

Repasa también `Heilyn_Refresher_JSON_Payloads_Postman.md` — cubre JSON Schema, data contract testing, y los scripts de test de Postman de TEST PRO que están directamente conectados a esto.

### 11.4 Cómo explicar cada capa del diagrama de arquitectura (respuestas listas)

Referencia: `diagrams/arquitectura_proyecto.png` — el diagrama de las 4 capas.

**1. Test/Specs (TestNG):**
> "Esta es la capa de Test/Specs, construida con TestNG. Es la que arranca el flujo completo: llama primero al harness de autenticación para obtener el token, luego usa el Page Object Model para interactuar con la UI o enviar datos, después consulta la base de datos con el DAO para confirmar que lo que se envió realmente se guardó — y al final, es también esta capa la que hace el assert final, comparando lo que se mandó contra lo que quedó persistido en la base de datos."

Punto extra: TestNG no es solo "el que corre los tests" — es el orquestador que decide el orden de las llamadas a las otras capas y el que al final juzga si la prueba pasa o falla.

**2. API & Auth Harness:**
> "Esta capa se encarga de la autenticación antes de que empiece cualquier prueba de UI. En vez de hacer login manualmente por la interfaz cada vez, mandamos una petición POST directa a la API de login, recibimos un token, y ese token se lo pasamos a la capa de Playwright para que la sesión ya empiece autenticada."

Punto extra: esto se llama **API-based login / login bypass** — acelera mucho los tests porque no dependes de que cargue un formulario de login en cada prueba.

**3. Page Object Model (Playwright):**
> "Esta capa contiene las interacciones con la interfaz gráfica, organizadas usando el patrón Page Object Model. Cada página tiene su propia clase, con métodos como `fillField()` o `clickSubmit()` que usan `page.locator()` internamente. Si la UI cambia, solo actualizas el Page Object correspondiente, no cada test que lo usa."

**4. Database DAO (JDBC):**
> "Esta capa se conecta directamente a la base de datos usando JDBC, para verificar que los datos enviados por UI o API realmente se guardaron. Usamos `PreparedStatement` en vez de concatenar strings, tanto por seguridad (SQL injection) como por buenas prácticas."

Punto extra si preguntan "¿por qué validar en base de datos y no solo en la UI?": la UI puede *mostrar* éxito sin que el dato realmente se haya persistido — validar en la base de datos confirma que de verdad llegó.

**Assert final:**
> "Al final, el test compara los datos enviados con los datos que quedaron guardados en la base de datos. Si coinciden, pasa; si no, falla. Esto es una prueba end-to-end real, no solo una UI que 'se ve bien'."

### 11.4.1 Versión "de bolsillo" del framework — 3 capas, para cuando te pregunten en general (no por tu proyecto)

Tú misma preparaste un resumen aparte (buen trabajo — esto se agrega porque es útil, no porque falte algo). Ahí describes el framework como **3 capas** en vez de 4:

- **Test Layer (arriba):** TestNG, corre los casos.
- **Page Objects / Actions Layer (medio):** selectores de UI + endpoints de API.
- **Core / Utils Layer (abajo):** conexión a base de datos y configuración.

**No se contradice con el diagrama de 4 capas — es el mismo framework visto con menos detalle.** La diferencia es solo de granularidad:

| Versión de 3 capas (genérica, para hablar rápido) | Versión de 4 capas (tu proyecto real, para cuando pidan detalle) |
|---|---|
| Core / Utils Layer | se divide en **API & Auth Harness** + **Database DAO** |
| Page Objects / Actions Layer | es exactamente tu **Page Object Model (Playwright)** |
| Test Layer | es exactamente tu **Test/Specs (TestNG)** — incluye el assert final |

**Cómo usar esto en la entrevista:** si Avinash pregunta algo general tipo "how do you structure your framework?", responde con la versión corta de 3 capas — es más fácil de dibujar rápido y de explicar en 20 segundos. Si después profundiza ("how does the DB layer work exactly?" o "how do you handle auth?"), ahí bajas al nivel de detalle de 4 capas, porque ya tienes el proyecto real corriendo que lo respalda. Empieza simple, profundiza solo si te lo piden — así no pareces que memorizaste algo rígido.

**Frase puente si quieres mencionar ambas sin que se vea como que te contradices:**
> "At a high level, I structure it in three layers — Core, Page Objects, and Test. In practice, I usually split that Core layer into two responsibilities: one part handles authentication and API calls, and the other handles the database validation. So depending on how much detail you want, it's either three layers or four."

### 11.4.2 Estrategia end-to-end de pagos (de tu propio resumen) — cómo conecta con tu proyecto

También trajiste esta idea, que es exactamente el patrón de tu proyecto real aplicado a pagos:

> `[ API Request ] ➡️ [ Playwright UI ] ➡️ [ SQL Database ]`
>
> "For payments, I use an End-to-End strategy. First, I use APIs or the UI to complete a transaction. Then, my framework connects to the database using SQL. I run a SELECT query to fetch the transaction record. Finally, I use an assertion to compare the UI data against the database. They must match 100%."

Esto es literalmente lo que hiciste con `RegisterServer` + `UsuarioFormPage` + `DbHelper` + el assert final — solo que en tu proyecto es un registro de usuario en vez de un pago. Si Avinash pregunta específicamente por pagos, usa esta frase casi tal cual, y si quiere que bajes a código, tienes el ejemplo real:
```java
String uiTotal = "150.00";
String dbTotal = database.getPaymentAmount(transactionId);
assertEquals(uiTotal, dbTotal);
```

## 12. Vocabulario técnico en inglés — flashcards de la sesión del 4 sept

Repasa esto en voz alta, no solo leyendo — la meta es que la boca se acostumbre a decir estas palabras sin trabarte en la entrevista. Para cada término: qué significa, y una frase de ejemplo que puedes usar tal cual.

**payload**
Significa: el cuerpo de datos de una petición o respuesta (request payload / response payload).
> "The response payload included the token and a 200 status code."

**endpoint**
Significa: la URL/ruta específica de una API a la que le mandas una petición (ej. `/login`).
> "I sent a POST request to the login endpoint."

**request / response**
Significa: lo que tú envías (request) y lo que el servidor te devuelve (response).
> "I validated both the request and the response for that endpoint."

**status code**
Significa: el código numérico HTTP que indica el resultado (200 éxito, 401 no autorizado, 404 no encontrado, 500 error de servidor).
> "A 401 status code means the credentials were invalid."

**header**
Significa: metadatos de la petición/respuesta, aparte del body (ej. `Content-Type`).
> "The response header confirmed the content type was JSON."

**body**
Significa: los datos reales que viajan en la petición o respuesta (lo mismo que "payload", término más informal).
> "I passed the credentials in the request body."

**JSON schema**
Significa: un documento que define la forma esperada de un JSON — campos requeridos, tipos de dato.
> "We validated the response against a JSON schema to catch any unexpected structure changes."

**data contract testing**
Significa: verificar que la forma de la respuesta de una API no cambie inesperadamente entre releases.
> "Data contract testing ensures backend changes don't silently break API consumers."

**token / authentication**
Significa: la credencial que recibes tras un login exitoso, usada para probar que estás autenticado en llamadas siguientes.
> "I authenticate via the API first, then inject the token to bypass the UI login."

**curl**
Significa: herramienta de línea de comandos para mandar peticiones HTTP (alternativa ligera a Postman).
> "I used curl to quickly verify the endpoint before writing the automated test."

**assertion / assert**
Significa: la comparación que decide si una prueba pasa o falla.
> "The final assertion compares the submitted data against what's persisted in the database."

**persist / persistence**
Significa: que un dato quedó guardado permanentemente (ej. en base de datos), no solo mostrado en pantalla.
> "I verify that the data actually persisted in the database, not just that the UI showed a success message."

**Page Object Model (POM)**
Significa: patrón de diseño donde cada página de la app tiene su propia clase con sus locators y acciones.
> "Each page has its own class, so a UI change only requires updating one Page Object."

**locator**
Significa: la forma en que Playwright/Selenium encuentra un elemento en la página (por rol, label, texto, etc.).
> "Playwright locators auto-wait for the element to be visible and actionable."

**DAO (Data Access Object)**
Significa: patrón que encapsula el acceso a la base de datos en una clase dedicada.
> "The DAO layer queries the database directly to reconcile UI data with backend data."

**PreparedStatement / SQL injection**
Significa: forma segura de ejecutar SQL con parámetros, que previene inyección de código malicioso.
> "We use PreparedStatement instead of string concatenation to prevent SQL injection."

**orchestrate**
Significa: coordinar el orden en que se llaman las distintas capas del framework (lo que hace la capa de Tests/Specs).
> "TestNG orchestrates the flow: authentication, UI interaction, database validation, and the final assertion."
