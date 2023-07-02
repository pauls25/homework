package io.codelex.oop.parcels;

public class Exercise6 {
    public static void main(String[] args) {

        Parcel validParcel = new Parcel(30, 30, 30, 29.0f, false);
        Parcel validParcel2 = new Parcel(30, 30, 30, 15.0f, true);

        Parcel invalidParcel = new Parcel(20, 30, 30, 16.0f, true);
        Parcel invalidParcel2 = new Parcel(30, 30, 30, 31.0f, false);
        Parcel invalidParcel3 = new Parcel(200, 100, 100, 30.0f, true);


        System.out.println("Parcel 'validParcel 1' is valid? " + validParcel.validate());
        System.out.println("Parcel 'validParcel 2' is valid? " + validParcel2.validate());

        System.out.println("Parcel 'invalidParcel 1' is valid? " + invalidParcel.validate());
        System.out.println("Parcel 'invalidParcel 2' is valid? " + invalidParcel2.validate());
        System.out.println("Parcel 'invalidParcel 3' is valid? " + invalidParcel3.validate());
    }
}
