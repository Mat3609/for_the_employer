package com.epam.training.student_matsvei_shablouski.classes.main_task.train_schedule.schedule_train;


import com.epam.training.student_matsvei_shablouski.classes.main_task.train_schedule.train.Train;
import com.epam.training.student_matsvei_shablouski.classes.main_task.train_schedule.use_train_sorting.SortTrain;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Schedule implements SortTrain {


    private List<Train> listTrain;

    public Schedule() {
        listTrain = new ArrayList<>();
    }

    public void addTrain(Train train) {
        Optional<Train> optionalTrain = Optional.ofNullable(train);
        optionalTrain.ifPresentOrElse(train1 -> listTrain.add(train1), () -> System.out.println("attempt to add Null object"));
    }



    @Override
    public List<Train> getListOfTrainsGoingToGivenDest(String destination) {
        return listTrain.stream().
                         filter(train -> train.getDestination().equals(destination)).
                         collect(Collectors.toList());
    }

    @Override
    public List<Train> getListOfTrainsGoingToGivenDestDepartingAfterSpecifHour(String destination, int hour) {
        return listTrain.stream().
                         filter(train -> train.getDestination().equals(destination) && train.getTimeDepart() > hour).
                         collect(Collectors.toList());
    }

    @Override
    public List<Train> getListOfTrainsGoingToGivenDestWhichHaveGeneralPlaces(String destination) {
        return listTrain.stream().
                         filter(train -> train.getDestination().equals(destination) && train.getPlaces().getGeneral() > 0).
                         collect(Collectors.toList());
    }
}
