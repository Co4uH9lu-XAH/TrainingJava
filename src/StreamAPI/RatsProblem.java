package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RatsProblem {

    private static List<Cage> cages;

    public static void main(String[] args) {
        init();
        receiveRatsInformation();
    }

    public static void receiveRatsInformation(){


        //вывести всех крыс, возраст которых = 1 год

//        cages.stream()
//                .flatMap(cage -> cage.getRats().stream())
//                .filter(rat -> rat.age!=null && rat.age==1)
//                .forEach(System.out::println);

        //Сохранить в ArrayList всех крыс,имя которых содержит "Mike"

//        List <Rat> rats2 = new ArrayList<>();
//        rats2 = cages.stream()
//                .flatMap(cage -> cage.getRats().stream())
//                .filter(rat -> rat.name!=null && rat.name.contains("Mike")).collect(Collectors.toList());
//        System.out.println(rats2);

        //Вывести 3х крыс возраст которых больше одного года, отсортированных по возрасту

//        cages.stream()
//                .flatMap(cage -> cage.getRats().stream())
//                .filter(rat -> rat.age!=null && rat.age>1)
//                .sorted(Comparator.comparingInt(Rat::getAge))
//                .limit(3)
//                .forEach(System.out::println);

        //Вывести крысу без имени

//        cages.stream()
//                .flatMap(cage -> cage.getRats().stream())
//                .filter(rat -> rat.name==null)
//                .forEach(System.out::println);

        //получить и вывести 2х уникальных серых крыс, отсортировав их по имени

        cages.stream()
                .flatMap(cage -> cage.getRats().stream())
                .filter(rat -> "grey".equals(rat.color))
                .distinct()
                .limit(2)
                .sorted(Comparator.comparing(Rat::getName))
                .forEach(System.out::println);

    }
    public static void init(){
        cages = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cages.add(new Cage());
            cages.get(i).setRats(new ArrayList<>());
        }
        cages.get(0).getRats().add(new Rat(1, "grey", "Pinky"));
        cages.get(0).getRats().add(new Rat(2, "grey", "Brain"));
        cages.get(0).getRats().add(new Rat(null, "grey", "Jimmy"));
        cages.get(1).getRats().add(new Rat(2, null, "Bessy"));
        cages.get(1).getRats().add(new Rat(3, "grey", "Mike"));
        cages.get(1).getRats().add(new Rat(1, "grey", null));
        cages.get(2).getRats().add(new Rat(1, "white", "Nick"));
        cages.get(2).getRats().add(new Rat(2, "white", "Mike2"));
        cages.get(2).getRats().add(new Rat(null, "grey", "Mike3"));
        cages.get(0).getRats().add(new Rat(1, "grey", "Pinky"));
    }
    static class Cage {
        private List<Rat> rats;
        List<Rat> getRats() {
            return rats;
        }
        public void setRats(List<Rat> rats) {
            this.rats = rats;
        }
    }
    static class Rat {
        private Integer age;
        private String color;
        private String name;
        public Rat(Integer age, String color, String name) {
            this.age = age;
            this.color = color;
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(Integer age) {
            this.age = age;
        }
        public String getColor() {
            return color;
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return "Rat{" +
                    "age=" + age +
                    ", color='" + color + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
