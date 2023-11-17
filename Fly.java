public interface Fly {
    
    void takeOff();

    void ascend(int meters);

    default void glide() {
        System.out.println("glides into the air.");
    }

    void descend(int meters);

    void land();
}




 // TODO : uncomment the following code in order to test it
        /*
        hawkeye.takeOff();
        hawkeye.ascend(120);
        hawkeye.ascend(30);
        hawkeye.glide();
        hawkeye.descend(140);
        hawkeye.land();
        hawkeye.descend(9);
        hawkeye.land();
        */