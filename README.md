# modern-java-design-pattern
Design pattern visited with modern java features with focus on functional design paradigm

Reference: Devoxx

* Design Patterns are common ways to solve problems that developers have discovered over time. They often fill the gaps between the language capabilities and the design goals. When languages mature, sometimes patterns become natural features of languages and blend in to the natural way of writing code instead of a special effort. Java has evolved significantly over the years. In this session we'll revisit some common design problems and see how patterns are realized to solve those problems with the modern capabilities in Java.
* Null in Java is a smell
* A good design reads like a story rather than a puzzle
* Effective Java: Do not return a NULL rather return an empty collection  - do not need a null check
* If there is no collection then return Optional.
  * Option<T> is a container object which may or may not contain a non-null value. If a value is present, isPresent() will return true and get() will return the value.
* A good design has a empathy
* 

