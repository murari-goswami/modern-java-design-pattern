import java.util.Optional;

public class OptionalSafeGuard {

    public static void setName(String name){

    }
    public static Optional<String> getName(){
        if (Math.random() > 0.5) {
            return Optional.of("John");
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        var result = getName();
        System.out.println(result.orElse("No name"));
    }

}

// IMPORTANT THINGS ABOUT Optional
/*
* If a method will always have a single value as a result, do not use Optional
* If a method may or may not have single value as a result, then use Optional
* If the result is a collection, do not use Optional
* ***** Don#t use Optional<T> as parameter to ta method *****
*
* */