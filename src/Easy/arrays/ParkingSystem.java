package Easy.arrays;

public class ParkingSystem {
    public int[] parkingSpaces = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        parkingSpaces[0] = big;
        parkingSpaces[1] = medium;
        parkingSpaces[2] = small;
    }

    public boolean addCar(int carType) {

        if (parkingSpaces[carType - 1] != 0) {
            parkingSpaces[carType - 1]--;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem(1, 1, 0);
        System.out.println(ps.addCar(1));
    }

}
