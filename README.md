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

To begin using the cSuite API in your project, follow these steps:

### 1. Add Dependency
Include the API in your `pom.xml` file to integrate it as a dependency:

```xml
<dependency>
    <groupId>com.conaxgames</groupId>
    <artifactId>csuite-api</artifactId>
    <version>LATEST</version>
    <scope>compile</scope>
</dependency>
```

### 2. Configure Maven Shade Plugin
Ensure the API is shaded into your plugin to prevent conflicts. Add the following configuration to your Maven build file:

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-shade-plugin</artifactId>
    <version>3.4.1</version>
    <executions>
        <execution>
            <id>shade</id>
            <phase>package</phase>
            <goals>
                <goal>shade</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <relocations>
            <relocation>
                <pattern>com.conaxgames</pattern>
                <shadedPattern>com.conaxgames.{yourplugin}.csuite</shadedPattern>
            </relocation>
        </relocations>
    </configuration>
</plugin>
```

---

## Usage

### Initialization
Initialize the API within your plugin's `onEnable` method:

```java
@Override
public void onEnable() {
    CorePluginAPI coreAPI = new CorePluginAPI();
    coreAPI.initialize(this);
    // Additional setup
}
```

### Shutdown
Ensure a clean shutdown by calling the API's `onDisable` method in your plugin:

```java
@Override
public void onDisable() {
    CorePluginAPI.shutdown();
    // Additional cleanup
}
```

---

## Contributing

Contributions are welcome! If you'd like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or fix.
3. Submit a pull request for review.

---

## License

This project is licensed under the [MIT License](LICENSE).
