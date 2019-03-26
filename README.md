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

## Consumer \<T>
Receives one parameter and provide no result through the `accept()`. It's possible to chain `Consumers<T>` through the `andThen()` method. It's the only side-effect based functional interface (which means don't operate through the return of a value). Provides variations for `double`, `int`, and `long` primitive types, where the input parameter is the primitive type.There is also a variation where you receive two parameters see the `BiConsumer<T,U>` and its own variations for `double`, `int` and `long` primitive types, in this case, the function receives two parameters, one object `T` and one primitive type depending on the functional interface.

* `Consumer<T>`
* `DoubleConsumer`
* `IntConsumer`
* `LongConsumer`
* `BiConsumer<T,U>`
* `ObjDoubleConsumer<T>`
* `ObjIntConsumer<T>`
* `ObjLongConsumer<T>`

