import stanford.karel.*;



public class MyKarel extends Karel {

    public void run() {
    import stanford.karel.*;
                move();
                doubleTheBeepers();
            }
            public void doubleTheBeepers() {
                putDoubleBeeperOnNextDoor();

            }

            private void putDoubleBeeperOnNextDoor() {
                while(beepersPresent()){
                    pickBeeper();
                    move();
                    putBeeper();
                    putBeeper();
                    turnAround();
                    move();
                    turnAround();
                }
            }
            private void turnAround() {
                turnLeft();
                turnLeft();
            }
            private void turnRight() {
                turnLeft();
                turnLeft();
                turnLeft();
            }
        }
}