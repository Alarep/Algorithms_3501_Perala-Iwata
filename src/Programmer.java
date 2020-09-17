public class Programmer {

    // Field to assign the preferred company of a programmer.
    final private int preferred;

    // Field to check if the programmer has not yet been assigned a position.
    final private boolean isFree;

    Programmer(int desired, boolean openPos){
        this.preferred = desired;
        this.isFree = openPos;
    }
}
