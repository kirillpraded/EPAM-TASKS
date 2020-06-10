package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {
    private String destinationPlace;
    private int trainNumber;
    private Date departureTime;
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

    public Train(String destinationPlace, int trainNumber, String departureTime) throws ParseException {
        this.destinationPlace = destinationPlace;
        this.trainNumber = trainNumber;
        this.departureTime = simpleDateFormat.parse(departureTime);
    }

    public static void sortByNumber(Train[] trains){
        boolean isSorted = false;
        Train temp;
        while (!isSorted){
            isSorted = true;
            for(int i = 0; i < trains.length-1; i++){
                if(trains[i].trainNumber > trains[i+1].trainNumber){
                    isSorted = false;
                    temp = trains[i];
                    trains[i] = trains[i+1];
                    trains[i+1] = temp;
                }
            }
        }
        for (Train train : trains){
            System.out.println(train.toString());
        }
    }

    public static Train getTrainByNumber(Train[] trains, int number){
        for(Train train : trains){
            if (train.trainNumber == number){
                return train;
            }
        }
        return null;

    }

    public static void sortByDestinationPlace(Train[] trains){
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                int compare = trains[i].destinationPlace.compareTo(trains[j].destinationPlace);
                if (compare > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                } else if (compare == 0) {
                    if (trains[i].departureTime.compareTo(trains[j].departureTime) > 0) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
        for (Train train : trains){
            System.out.println(train.toString());
        }
    }


    @Override
    public String toString() {
        return "Train {" +
                "destinationPlace='" + destinationPlace + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime=" + departureTime +
                '}';
    }
}
