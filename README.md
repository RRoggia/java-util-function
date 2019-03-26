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

## Function \<T,R>
The method `apply()` receives an parameter`T` and returns and object of type `R`. It's possible to use `andThen()` to receive a `Function<R,V>` therefore chaining it and creating an `Function<T,V>`. Same applies to the `compose()`, but instead of adding after the function, it is built before it. For example, `Function<T,R>` composed by `Function<V,T>` creates a `Function<V,R>`. The static method `identity()` creates a function that the input type is the same as the output type, for example `Function<T,T>` and `t -> t`.

It provides `Function` for primitive data types such `double`, `long` and `int`. Where the input parameter is the primitive data type and the output parameter is an object `R`. The API also provides functional interfaces with the input parameter as an object `T` and the ouput as a primitive type such as `Double`, `Long` or `Int`. A third variation is both input and output parameter as primitive types such as `double,int`, `double,long`, `int ,double`, `int, long`, `long, double` and `long, int`.  

`UnaryOperation<T>` it's the same as the `Function` static method `identity()`, creates a function that the input type is the same as the output type, `t -> t`. There are the functional interfaces for `double`, `int` and `long` primitive types.

* `Function<T,R>`

* `DoubleFunction<R>`
* `IntFunction<R>`
* `LongFunction<R>`

* `ToDoubleFunction<T>`
* `ToIntFunction<T>`
* `ToLongFunction<T>`

* `DoubleToIntFunction`
* `DoubleToLongFunction`
* `IntToDoubleFunction`
* `IntToLongFunction`
* `LongToDoubleFunction`
* `LongToIntFunction`

* `UnaryOperator<T>`
* `DoubleUnaryOperator`
* `IntUnaryOperator`
* `LongUnaryOperator`


## BiFunction\<T,U,V>
A `BiFunction` is similar to a `Function`, but it receives two input parameters `T` and `U` and it also has an output parameter `R`. Similar to the `Function` it also provides an `andThen()` method that can be used to chain a `BiFunction` to a `Function` and return another `BiFunction`.

 The `BiFunction` supports the `double`, `int` and `long` primitive types as an output parameter through similar functional interfaces, where the primitive type is the output parameter.
 
 A `BinaryOperator` is similar to the `UnaryOperator` where the all the input and output parameters are the same. Functional interfaces for `double`, `int` and `long` primitives types are in place.
 
 `BinaryOperator` interface provides two static methods `maxBy` and `minBy` that receives a `Comparator` functional interface and returns respectively the greater or the lower value being compared.

* `BiFunction<T,U,R>`
* `ToDoubleBiFunction<T,U>`
* `ToIntBiFunction<T,U>`
* `ToLongBiFunction<T,U>`

* `BinaryOperator<T>`
* `DoubleBinaryOperator`
* `IntBinaryOperator`
* `LongBinaryOperator`



