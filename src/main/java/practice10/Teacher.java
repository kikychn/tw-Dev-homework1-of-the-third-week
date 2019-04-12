package practice10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {
    private LinkedList<Klass> klass;

    public Teacher(int id, String name, int age, LinkedList<Klass> klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return klass;
    }

    public void setKlass(LinkedList<Klass> klass) {
        this.klass = klass;
    }


    public String introduce() {
        if (klass != null) {
            List<String> classList = new ArrayList<>();
            for (Klass klass1 : klass) {
                classList.add(String.valueOf(klass1.getNumber()));
            }
            return super.introduce() + " I am a Teacher. I teach Class " + String.join(", ", classList) + ".";
        } else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }

    public boolean isTeaching(Student student) {
        return isIn(student);
    }

    public boolean isIn(Student student) {
        for (Klass klass1 : klass) {
            if (klass1.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student) {
        for (Klass klass1 : klass) {
            if (klass1.equals(student.getKlass())) {
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            }
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

}
