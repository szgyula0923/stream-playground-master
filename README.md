stream-playground
=================

Toy project for playing with [streams](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/package-summary.html) in Java.

Data is taken from [REST Countries](https://restcountries.eu/) via the following URI:
<https://restcountries.eu/rest/v2/all?fields=alpha2Code;name;capital;region;area;population;translations;timezones>

Start playing with Java streams executing
``` shell
mvn compile jshell:run
```

Example:
```java
import countries.*;
var countries = new Countries().getAll();
countries.stream().max(Comparator.comparing(Country::getPopulation)); //  the most populous country
```
