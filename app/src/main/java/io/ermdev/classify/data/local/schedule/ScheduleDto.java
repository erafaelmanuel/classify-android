package io.ermdev.classify.data.local.schedule;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by erafaelmanuel on 12/14/2017.
 */

public class ScheduleDto implements Parcelable {

    private int id;
    private String day;
    private String startTime;
    private String endTime;

    public ScheduleDto() {}

    protected ScheduleDto(Parcel in) {
        id=in.readInt();
        day=in.readString();
        startTime=in.readString();
        endTime=in.readString();
    }

    public static final Creator<ScheduleDto> CREATOR = new Creator<ScheduleDto>() {
        @Override
        public ScheduleDto createFromParcel(Parcel in) {
            return new ScheduleDto(in);
        }

        @Override
        public ScheduleDto[] newArray(int size) {
            return new ScheduleDto[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(day);
        parcel.writeString(startTime);
        parcel.writeString(endTime);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
