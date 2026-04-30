<!--suppress HtmlDeprecatedAttribute -->

<div align="center">
    <h2><i>csuite-api</i></h2>
    <h3>Public API surface for building against the cSuite ecosystem on PaperMC.</h3>
    <a href="https://github.com/ConaxGames/csuite-api/actions/workflows/uploader-and-publisher.yml"><img src="https://img.shields.io/github/actions/workflow/status/ConaxGames/csuite-api/uploader-and-publisher.yml?style=for-the-badge&logo=github" alt="CI"></a>
    <img src="https://img.shields.io/github/license/ConaxGames/csuite-api?style=for-the-badge&logo=github" alt="License">
    <a href="https://github.com/ConaxGames/csuite-api/releases"><img src="https://img.shields.io/github/downloads/ConaxGames/csuite-api/total.svg?style=for-the-badge&logo=github" alt="Downloads"></a>
    <a href="https://discord.com/invite/fYZt22SmTp"><img src="https://img.shields.io/badge/Discord-ConaxGames-5865F2?style=for-the-badge&logo=discord&logoColor=white" alt="Discord"></a>
</div>

<h3>Resources</h3>

- [Maven Central](https://central.sonatype.com/search?name=csuite-api&namespace=com.conaxgames&type=maven)
    - [Repository directory](https://repo.maven.apache.org/maven2/com/conaxgames/csuite-api/)
- [Releases](https://github.com/ConaxGames/csuite-api/releases/)
    - [Latest](https://github.com/ConaxGames/csuite-api/releases/latest)
- [Java source](https://github.com/ConaxGames/csuite-api/tree/main/src/main/java/com/conaxgames)

<h3>Install</h3>

**Maven**

```xml
<dependency>
    <groupId>com.conaxgames</groupId>
    <artifactId>csuite-api</artifactId>
    <version>1.1.5</version>
</dependency>
```

**Gradle**

```groovy
compileOnly group: 'com.conaxgames', name: 'csuite-api', version: '1.1.5'
```

Vendor with shade and relocate `com.conaxgames` to your plugin namespace ([Maven Shade](https://maven.apache.org/plugins/maven-shade-plugin/examples/class-relocation.html) · [Shadow](https://gradleup.com/shadow/configuration/relocation/)).

<h3>Credits</h3>

<i>csuite-api ships against papermc tooling and owes its stability to upstream platform work:</i>

[Paper](https://papermc.io/software/paper) · [Folia](https://papermc.io/software/folia) · [Velocity](https://papermc.io/software/velocity)
