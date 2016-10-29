# kotlin-default-map

A map which returns a default value for missing keys.

## Usage

```kotlin
val map = mapOf(1 to "one", 2 to "two").defaultsTo("???")

assertThat(map[1], equalTo("one"))
assertThat(map[2], equalTo("two"))
assertThat(map[3], equalTo("???"))

// Notice that value is of type String, not String?
val value: String = map[1]
```

## Downloading
### Gradle

```groovy
repositories {
    maven {
        url  "https://dl.bintray.com/phxql/maven"
    }
}

dependencies {
    compile 'de.mkammerer:kotlin-default-map:1.0'
}
```

### Maven

Add this repository:

```xml
<repositories>
  <repository>
    <snapshots>
      <enabled>false</enabled>
    </snapshots>
    <id>bintray-phxql-maven</id>
    <name>bintray</name>
    <url>https://dl.bintray.com/phxql/maven</url>
  </repository>
</repositories>
```
You can then use the following Maven coordinates:

```xml
<dependency>
    <groupId>de.mkammerer</groupId>
    <artifactId>kotlin-default-map</artifactId>
    <version>1.0</version>
</dependency>
```

## License

[LGPLv3](LICENSE)

## Maintainer

Moritz Kammerer ([@phxql](https://github.com/phxql))