package com.epam.training.student_matsvei_shablouski.clean_code.planes;


import com.epam.training.student_matsvei_shablouski.clean_code.classification.ClassificationLevel;
import com.epam.training.student_matsvei_shablouski.clean_code.classification.ExperimentalTypes;
import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes experimentalTypes;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes experimentalTypes, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalTypes = experimentalTypes;
        this.classificationLevel = classificationLevel;
    }

    public ExperimentalTypes getExperimentalTypes() {
        return experimentalTypes;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExperimentalPlane that = (ExperimentalPlane) o;
        return experimentalTypes == that.experimentalTypes && classificationLevel == that.classificationLevel;
    }

    @Override
    public int hashCode() {return Objects.hash(super.hashCode(), experimentalTypes, classificationLevel);}


    @Override
    public String toString() {
        return "ExperimentalPlane{" +
                "experimentalTypes=" + experimentalTypes +
                ", classificationLevel=" + classificationLevel +
                '}';
    }
}
