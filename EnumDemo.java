//ager interface ko public kroge to dusre file me daalna hoga interface aur 
//file ka naam interface ka nam.java hoga ..Ex :-- A.java
interface A {
    void hello();
}
public class EnumDemo {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // all members of enum are public, static and final
        // since its final you cannot create child enums
        // type is Week

        void display() {
            //abstract method is not allowed in enum
            //but normal method is allowed as display create the body as u want
        }

        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("hey how are you");
        }
        // this is not public or protected, only private or default
        // why? we dont want to create new objects
        // this is not the enum concept, thats why

        // internally: public static final Week Monday = new Week();
    }
/*
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));
//        for(Week day : Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());//gives the index of members of enum
											  `                                             }
}

 */
}