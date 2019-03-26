# java-util-function


## Supplier\<T>
Supplies a result through the `get()` method. Functional Interface available for `boolean`, `int`, `double` and `long` primitive types.

* `Supplier<T>`
* `BooleanSupplier`
* `DoubleSupplier`
* `IntSupplier`
* `LongSupplier`

## Predicate\<T>
Receives one parameter and resolve it into a boolean return through method `test()`. You can chain `Predicates` using `and()`, `or()` or `negate()` methods. I'ts also possible to use the static method `isEqual()` to generate a predicate to compare objects. 

Variations for primitive data types support `double`, `int` and `long`, in this case, the output is still a boolean, but the input parameter represents the primitive data type. There is also a variation where you receive two parameters see the `BiPredicate<T,U>`

* `Predicate<T>`
* `DoublePredicate`
* `IntPredicate`
* `LongPredicate`
* `BiPredicate<T,U>`
