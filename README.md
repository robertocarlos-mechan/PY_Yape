# SOLI_BILL_QA_AUTOMATION
Este es un proyecto de Automatización Mobile que utiliza Serenity BDD y Appium
para la creación de un framework de automatización que permita probar el apk SOLI.

Este proyecto ha sido desarrollado por [Roberto Mechán](https://www.linkedin.com/in/roberto-mech%C3%A1n-302735179/) para mejorar el
desarrollo en pruebas avanzadas de mobile automation.
***

## 🏠 Detalles del Tester

* Name: `Roberto Mechán`
* Country: `Peru`
* City: `Chiclayo`
* LinkedIn: [https://www.linkedin.com/in/roberto-mech%C3%A1n-302735179/]()

***

## 🛠️ Lenguajes & Frameworks

Este proyecto utiliza los siguientes lenguajes y frameworks:

* [Serenity BDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html) como framework de pruebas
  automatizadas.
* [Appium](https://appium.io/) como framework para probar y validar aplicaciones web nativas, híbridas y móviles.
* [Cucumber](https://cucumber.io/) como software de testing BDD que permite elaborar pruebas a partir de AC.

* [Java 17](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html) como lenguaje de
  programación.
* [Screen Play](https://serenity-js.org/handbook/thinking-in-serenity-js/screenplay-pattern.html) como el patrón de
  diseño.
* [Gradle](https://gradle.org/) como herramienta de compilación.

***

## 🟢 Pre-requisitos: 🟢

1. Descargar la última versión estable de Java
   JDK [aquí](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html)
2. Instalar git desde [aquí](https://git-scm.com)
3. Instalar Gradle Build Tool desde [aquí](https://gradle.org/install/)
4. Instalar Android studio [aquí](https://developer.android.com/studio)
5. Instalar Appium Desktop(Server GUI) [aquí](https://github.com/appium/appium-desktop)
6. Instalar Appium Inspector [aquí](https://github.com/appium/appium-inspector)

**🗒️ Nota**: `build.gradle` tiene toda la configuración del proyecto instalada, ejecutar el siguiente comando para
iniciar todas las tareas (Incluidos los test).

👀 Adicional en su **IDE** de preferencia deberá tener instalados los siguientes plugins:

1. [x] *JUnit*
2. [x] *Cucumber for Java*
3. [x] *Gherkin*
4. [x] *Lombok*

***
## 🏗️ Estructura del proyecto

El proyecto tiene scripts de compilación para Gradle y sigue la estructura la siguiente estructura basada en el patrón
de diseño de Screenplay:

```Gherkin
src
+ main                                  | Source main
+ test                                  |
+ java                                  | Test runners and supporting code
+ co.com.bdb.certificacion              | Package base
+ features                              | Features set
+ {feature_name}                        | Feature name
+ pages                                 | Pages use with webdriver test
+ steps                                 | Utility class for definition steps
+ {feature_name}Definition.java         | Definition class
+ model                                 | DTOs, Pojos, VOs, etc ...
+ utils                                 | General utility class
+ Runners                               | Main class
+ resources                             |
+ features                              | Feature files
         + {feature_name}               | Feature file  specific
{feature_name}.feature                  |
+ serenity.conf                         | Config file for Serenity
serenity.properties                     | General properties Serenity
```

***
## ▶️ Ejecución del proyecto:

1. Descarga el proyecto desde Azure Devops
    * **Opción 1** (HTTPS): `https://btbdow00/tfs/XLAB/BILLE_BILLETERA%20SOLI/_git/SOLI_BILL_QA_AUTOMATION`
    * **Opción 2** (SSH): `ssh://btbdow00:22/tfs/XLAB/BILLE_BILLETERA%20SOLI/_git/SOLI_BILL_QA_AUTOMATION`
    * **Opción 3:** Descárgalo como archivo Zip y extráelo

***

2. **CD** en la carpeta `SOLI_BILL_QA_AUTOMATION`.
***
3. Configurar Gradle
    * Ejecute el siguiente comando en el terminal:`./gradlew build`.

***

4. Ejecutar las pruebas en el proyecto
    * **Opción 1**: ejecutar en la ruta del proyecto alguno de los siguientes comandos:

    ```bash
    ./gradlew clean test
    ```

    ```bash
    gradle clean test --no-build-cache -Dcucumber.filter.tags="@login_soli"
    ```

    * **Opción 2**: Ir a las clases de la carpeta **runners** `src/test/java/co/com/bcp/runners` y ejecutar
  cada Runner.

***
## 📄 Generación de informes

El informe al detalle con los pasos y resultados de las pruebas que se registrará en la ruta:
`target/site/serenity/index.html`.

Adicional se genera un reporte single page si se desea una revisión de alto nivel sobre los resultados de los test, el
cual se registrará en la ruta:
`target/site/serenity/serenity-summary.html`.

Este comando permitirá generar ambos reportes:

```bash
./gradlew reports
```

***