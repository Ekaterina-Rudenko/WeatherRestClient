package dto;

import java.util.List;

public class MeasurementResponse {
    List<MeasurementDTO> measurementDTOList ;

    public List<MeasurementDTO> getMeasurementDTOList() {
        return measurementDTOList;
    }

    public void setMeasurementDTOList(List<MeasurementDTO> measurementDTOList) {
        this.measurementDTOList = measurementDTOList;
    }
}
