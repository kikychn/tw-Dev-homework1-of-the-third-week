package practice11;

public class Klass {
    private Integer number;
    private Student leader;

    public Student getLeader() {
        return leader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number.equals(klass.number);
    }


    public void assignLeader(Student leader) {
        if (this.equals(leader.getKlass())) {
            this.leader = leader;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        student.setKlass(this);
        System.out.print("I am Tom. I know Jerry has joined Class 2.\n");
    }

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public boolean isIn(Student student) {
        if (this.equals(student.getKlass())) {
            return true;
        }
        return false;
    }
}
