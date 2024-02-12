import java.io.InputStream;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = List.of(

                new Car("benz", "siah", 2012, 10000),
                new Car("bmw", "zard", 2023, 12000),
                new Car("honda", "sefid", 2012, 10000),
                new Car("benz", "sefid", 2012, 34000),
                new Car("benz", "sefid", 2012, 10000),
                new Car("bmw", "sefid", 1987, 1000),
                new Car("honda", "sefid", 2012, 7000),
                new Car("benz", "siah", 2012, 10000),
                new Car("honda", "sefid", 2002, 10000),
                new Car("benz", "zard", 2012, 10000),
                new Car("bmw", "sefid", 1876, 2300),
                new Car("benz", "siah", 2012, 10000),
                new Car("honda", "zard", 2008, 11000),
                new Car("benz", "sefid", 2012, 10000),
                new Car("benz", "siah", 2012, 5000),
                new Car("honda", "zard", 1987, 6000)
        );
        Optional<Integer> bmw = cars.stream()
                .filter(car -> car.getName().equals("bmw"))
                .map(Car::getPrice)
                .reduce(Integer::sum);
        bmw.ifPresent(System.out::println);

        Optional<Car> siah = cars.stream()
                .filter(car -> car.getColour().equals("siah") && car.getModel() > 2000)
                .max((o1, o2) -> o1.getPrice() - o2.getPrice());
        siah.ifPresent(car -> car.getName().concat(car.getColour()));
        System.out.println(siah);
        //        Tree tree=new TreeImp();
//        Stream<Integer> stream= Stream.of(11,22);
//        Stream<Integer> iterate = Stream.iterate(1, n-> n<100,n -> n+2);
//        iterate.forEach(System.out::println);
/*        String decorate = tree.decorate();
        System.out.println(decorate);

        Tree lamp = new Lamp(tree);
        String decorate2 = lamp.decorate();
        System.out.println(decorate2);

        Tree roban = new Roban(tree);
        String decorate3 = roban.decorate();
        System.out.println(decorate3);*/

//        TreeDecorator treeDecorator= new Lamp(new Roban(tree));
//        System.out.println(treeDecorator.decorate());
//
//        BinaryOperator<Integer>operator = BinaryOperator.maxBy(Integer::compareTo);
//        System.out.println(operator.apply(100, 15));


//        avg(10,10,9).orElse(Double.NaN);
//        avg().or(new Supplier<Optional<? extends Double>>() {
//            @Override
//            public Optional<? extends Double> get() {
//                return Optional.empty();
//            }
//        })
//        Stream<String> cars = Stream.of("Honda","BMW","BENZ","BMW");
////        boolean allMatch = cars.noneMatch(s -> s.startsWith("B"));
//
//        cars.sorted((o1, o2) -> o1 - o2 )
////        Stream<String> b = cars.skip(1).limit(2);
//        Stream<Integer> integerStream = cars.map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return null;
//            }
//        });
//
//        Stream<Object> objectStream = cars.flatMap(new Function<String, Stream<?>>() {
//            @Override
//            public Stream<?> apply(String s) {
//                return Stream.of();
//            }
//        });
//        integerStream.forEach(System.out::println);

//        b.forEach(System.out::println);
//        cars.distinct();
//        String reduce = cars.reduce("", String::concat);
//        System.out.println(reduce);
//        System.out.println(allMatch);
    }
//    public static Optional<Double> avg(int...numbers){}
//        IntStream.of(numbers).average();
//        return Optional.of(average.getAsDouble());?



}



