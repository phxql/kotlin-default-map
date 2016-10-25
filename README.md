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

## License

LGPLv3

## Maintainer

Moritz Kammerer ([@phxql](https://github.com/phxql))