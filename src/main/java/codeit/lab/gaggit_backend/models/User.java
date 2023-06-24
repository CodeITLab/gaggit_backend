package codeit.lab.gaggit_backend.models;

public class User {
    private Integer id;
    private String name;
    private boolean isAuthenticated;

    public User(Integer id, String name, boolean isAuthenticated) {
        this.id = id;
        this.name = name;
        this.isAuthenticated = isAuthenticated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }
}
