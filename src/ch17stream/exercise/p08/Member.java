package ch17stream.exercise.p08;

public class Member {
    private String name;
    private String job;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "{name :" + name +", job:" + job +"}";
    }

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }

}
