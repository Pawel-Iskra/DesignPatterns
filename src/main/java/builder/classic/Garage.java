package builder.classic;

public class Garage {

    private String walls;
    private String roof;
    private String floor;
    private String gate;
    private String window;
    private int area;

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", floor='" + floor + '\'' +
                ", gate='" + gate + '\'' +
                ", window='" + window + '\'' +
                ", area=" + area +
                '}';
    }
}
