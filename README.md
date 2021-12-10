# Component challenge implementation with Quarkus and Qute

This implementation uses Qute with "tags" and "includes". It uses
static methods in specific component classes to implement additional
functionality in Java.

## usage

```
mvn compile quarkus:dev
```

head to http://localhost:8080

## Learnings

* There is no access to "unknown" attributes in tags and includes. E.g. inside a tag you can not iterate over all (optional) attributes given to your tag.
* Optional attributes in tags are strange. You have to write `{this.get('attr')}` instead of `{attr}` since the last one would raise an exception when the attribute is missing.
* Tags do not support "named blocks". You have to use `{#include}` (with `{#insert}`) instead. But `{#include}` doesn't have such a nice API.
* There is no static type checking for tags.
