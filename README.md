# cSuite API

**Overview**

The cSuite API is a comprehensive framework designed to integrate seamlessly with an all-in-one (AIO) server core for PaperMC servers. Developed by ConaxGames, this API provides tools and utilities tailored to simplify server management and plugin development, enabling streamlined and innovative server operations.

---

## Features

- **AIO Core Integration:** Designed specifically to enhance and extend an AIO server core for PaperMC.
- **Utility Classes:** Offers pre-built utilities for server operations and plugin development, minimizing boilerplate code.
- **Extensibility:** Modular and flexible design to suit various server setups and customizations.
- **Performance-Optimized:** Built to handle high-performance requirements of modern PaperMC servers.

---

## Getting Started

To begin using the cSuite API in your project, select your preferred build automation tool from the dropdown (_Maven_ or _Gradle_) to view the setup instructions.

<details>
    <summary>Maven</summary>

Add the following lines to your `pom.xml` inside of `dependencies` block:
```xml
<dependency>
    <groupId>com.conaxgames</groupId>
    <artifactId>csuite-api</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

Ensure the API is shaded into your plugin to prevent conflicts, you should configure the _[maven-shade-plugin](https://maven.apache.org/plugins/maven-shade-plugin/)_ with relocation in your `pom.xml`:

```xml
<configuration>
    <relocations>
        <relocation>
            <pattern>com.conaxgames</pattern>
            <shadedPattern>com.conaxgames.{yourplugin}.csuite</shadedPattern>
        </relocation>
    </relocations>
</configuration>
```
</details>

<details>
    <summary>Gradle</summary>

Add the following lines to your `build.gradle` inside of `dependencies` block:
```groovy
compileOnly group: 'com.conaxgames', name: 'csuite-api', version: '1.0.0'
```

Ensure the API is shaded into your plugin to prevent conflicts, you should configure the _[Shadow Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)_ with relocation in your `build.gradle`:

```groovy
relocate 'com.conaxgames', 'com.conaxgames.{yourplugin}.csuite'
```
</details>

---

## License

This project is licensed under the [MIT License](LICENSE).
