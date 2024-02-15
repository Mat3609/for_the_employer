package com.epam.training.student_matsvei_shablouski.classes.main_task.train_schedule.use_train_sorting;

import com.epam.training.student_matsvei_shablouski.classes.main_task.train_schedule.train.Train;


import java.util.List;

public interface SortTrain {
    List<Train> getListOfTrainsGoingToGivenDest(String destination);
    List<Train> getListOfTrainsGoingToGivenDestDepartingAfterSpecifHour(String destination, int givenHour);
    List<Train> getListOfTrainsGoingToGivenDestWhichHaveGeneralPlaces(String destination);
}
