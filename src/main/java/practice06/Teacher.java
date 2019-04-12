package practice06;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce() {
        if(getKlass()!=null){
            return super.introduce() + " I am a Teacher. I teach Class " + klass + ".";
        }else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }
}
