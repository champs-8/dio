public class Client {
    private String name;
    private Long id;

    // Default constructor
    public Client(String name, Long id) {
        this.name = name;
        this.id = id++;
    }
    // getters and setters for Client class
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
}

