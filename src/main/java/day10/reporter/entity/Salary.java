package day10.reporter.entity;

public class Salary {
    private Reporter journalist;
    private String typePost;

    public Salary(Reporter journalist, String typePost) {
        this.journalist = journalist;
        this.typePost = typePost;
    }

    public Reporter getJournalist() {
        return journalist;
    }

    public void setJournalist(Reporter journalist) {
        this.journalist = journalist;
    }

    public String getTypePost() {
        return typePost;
    }

    public void setTypePost(String typePost) {
        this.typePost = typePost;
    }
}
